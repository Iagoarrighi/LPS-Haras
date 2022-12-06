/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Alimento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author gusta
 */
public class AlimentoDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public AlimentoDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Alimento alimento = (Alimento) obj;
        this.entityManager.getTransaction().begin();
        if (alimento != null) {
            this.entityManager.merge(alimento);
        } else {
            this.entityManager.persist(alimento);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Alimento alimento = (Alimento) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(alimento);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT a "
                + " FROM Alimento a "
                + " WHERE id = :id ";

        qry = this.entityManager.createQuery(sql);
        qry.setParameter("id", id);
        
        List lst = qry.getResultList();
        if (lst.isEmpty()) {
            return null;
        } else {
            return lst.get(0);
        }
    }
    
    public Alimento findByNome(String nome) {
        sql = " SELECT n "
                + " FROM Alimento "
                + " WHERE nome = :nome ";

        qry = this.entityManager.createQuery(sql);
        qry.setParameter("nome", nome);
        
        List lst = qry.getResultList();
        if (lst.isEmpty()) {
            return null;
        } else {
            return (Alimento) lst.get(0);
        }
    }

    
    @Override
    public List<Object> findAll() {
        sql = " SELECT a "
                + " FROM Alimento a ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
    
    
    
}

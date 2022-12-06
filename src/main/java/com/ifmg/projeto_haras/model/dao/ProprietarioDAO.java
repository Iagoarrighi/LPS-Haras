/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Proprietario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ProprietarioDAO implements IDao{
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public ProprietarioDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Proprietario proprietario = (Proprietario) obj;
        this.entityManager.getTransaction().begin();
        if (proprietario != null) {
            this.entityManager.merge(proprietario);
        } else {
            this.entityManager.persist(proprietario);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Proprietario proprietario = (Proprietario) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(proprietario);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT p "
                + " FROM Proprietario p "
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
    
    @Override
    public List<Object> findAll() {
        sql = " SELECT p "
                + " FROM Proprietario p ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
}

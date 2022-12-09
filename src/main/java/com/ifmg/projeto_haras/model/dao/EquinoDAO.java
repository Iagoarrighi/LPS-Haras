/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Equino;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author gusta
 */
public class EquinoDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public EquinoDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Equino equino = (Equino) obj;
        this.entityManager.getTransaction().begin();
        if (equino != null) {
            this.entityManager.merge(equino);
        } else {
            this.entityManager.persist(equino);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Equino equino = (Equino) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(equino);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT e "
                + " FROM Equino e "
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
    
    public List<Equino> findAll() {
        sql = " SELECT e "
                + " FROM Equino e ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
}

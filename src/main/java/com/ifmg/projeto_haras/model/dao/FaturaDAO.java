/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Fatura;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author iago_
 */
public class FaturaDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public FaturaDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }

    
    @Override
    public void save(Object obj) {
        Fatura fatura = (Fatura) obj;
        this.entityManager.getTransaction().begin();
        if (fatura != null) {
            this.entityManager.merge(fatura);
        } else {
            this.entityManager.persist(fatura);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Fatura fatura = (Fatura) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(fatura);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT f "
                + " FROM Fatura f "
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
    
    public List<Object> findAll() {
        sql = " SELECT f "
                + " FROM fatura f ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
}

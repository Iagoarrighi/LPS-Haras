/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Baia;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author iago_
 */
public class BaiaDAO implements IDao {

    private EntityManager entityManager;
    private Query qry;
    private String sql;

    public BaiaDAO() {
        entityManager = Database.getInstance().getEntityManager();
    }

    @Override
    public void save(Object obj) {
        Baia baia = (Baia) obj;
        this.entityManager.getTransaction().begin();
        if (baia != null) {
            this.entityManager.merge(baia);
        } else {
            this.entityManager.persist(baia);
        }
        this.entityManager.getTransaction().commit();
    }

    @Override
    public boolean delete(Object obj) {
        Baia baia = (Baia) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(baia);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT b "
                + " FROM Baia b "
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

    public List<Baia> findAll() {
        sql = " SELECT b "
                + " FROM Baia b ";

        qry = this.entityManager.createQuery(sql);

        List lst = qry.getResultList();
        return lst;
    }
}

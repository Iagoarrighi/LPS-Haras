/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.dao;

import com.ifmg.projeto_haras.factory.Database;
import com.ifmg.projeto_haras.model.Proprietario;
import com.ifmg.projeto_haras.model.Veterinario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author gusta
 */
public class VeterinarioDAO implements IDao {
    private EntityManager entityManager;
    private Query qry;
    private String sql;
    
    public VeterinarioDAO(){
        entityManager = Database.getInstance().getEntityManager();
    }
    
    public Integer getVeterinarioByEmailAndSenha(String email, String senha){
        sql = " SELECT v "
                + " FROM Veterinario v "
                + " WHERE email = :email"
                + " AND senha = :senha ";
        qry = this.entityManager.createQuery(sql);
        qry.setParameter("email", email);
        qry.setParameter("senha", senha);
        
        List<Veterinario> lst = qry.getResultList();

        if (lst.isEmpty()) {
            return 0;
        } else {
            return lst.get(0).getId();
        }
    }

    
    @Override
    public void save(Object obj) {
        Veterinario veterinario = (Veterinario) obj;
        this.entityManager.getTransaction().begin();
        if (veterinario != null) {
            this.entityManager.merge(veterinario);
        } else {
            this.entityManager.persist(veterinario);
        }
        this.entityManager.getTransaction().commit();
    }

    
    @Override
    public boolean delete(Object obj) {
        Veterinario veterinario = (Veterinario) obj;
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(veterinario);
        this.entityManager.getTransaction().commit();
        return true;
    }

    @Override
    public Object find(int id) {
        sql = " SELECT v "
                + " FROM Veterinario v "
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
    
    public List<Veterinario> findAll() {
        sql = " SELECT v "
                + " FROM Veterinario v ";

        qry = this.entityManager.createQuery(sql);
        
        List lst = qry.getResultList();
        return lst;
    }
}

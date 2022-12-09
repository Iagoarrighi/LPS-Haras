/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.testes;

import com.ifmg.projeto_haras.model.Alimento;
import com.ifmg.projeto_haras.model.dao.AlimentoDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class testeMain {
    public static void main(String[] args) {
        Alimento a1 = new Alimento("Abacaxi", 9.00);;
        
        AlimentoDAO adao = new AlimentoDAO();
        
        adao.save(a1);
        
//        List<Alimento> a2 = (List<Alimento>) (Alimento) adao.findAll();
//        
//        for (Alimento object : a2) {
//            System.out.println(object.getNome());
//        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

/**
 *
 * @author gusta
 */
@Data
@Entity
public class Alimento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double preco;
    
    public Alimento(){
        this.id = -1;
        this.nome = "";
        this.preco = -1.0;
    }
    
    public Alimento(String nome, Double preco){
        this.id = null;
        this.nome = nome;
        this.preco = preco;
    }
    
}

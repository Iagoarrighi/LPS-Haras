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
public class Baia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Double tamanho;
    private String tipo;
    
    public Baia(){
        this.id = -1;
        this.tamanho = -1.0;
        this.tipo = "";
    }
    
    public Baia(Double tamanho, String tipo){
        this.id = null;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }
}

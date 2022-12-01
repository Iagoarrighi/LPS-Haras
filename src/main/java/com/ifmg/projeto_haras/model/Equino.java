/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author gusta
 */
@Entity
@Data
public class Equino {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private char sexo;
    private String raca;
    private LocalDate nascimento;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Proprietario proprietario;
    @ManyToOne(cascade = CascadeType.ALL)
    private Cuidador cuidador;
    @ManyToOne(cascade = CascadeType.ALL)
    private Veterinario veterinario;
    @OneToOne(cascade = CascadeType.ALL)
    private Baia baia;
    
    public Equino(){
        this.id = -1;
        this.nome = "";
        this.sexo = '-';
        this.raca = "";
        this.nascimento = null;
    }

    public Equino(String nome, char sexo, String raca, LocalDate nascimento) {
        this.id = null;
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.nascimento = nascimento;
    }
    
}

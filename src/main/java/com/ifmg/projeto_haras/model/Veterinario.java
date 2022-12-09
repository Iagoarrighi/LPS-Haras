/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

/**
 *
 * @author gusta
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Veterinario extends Pessoa {
    private String crmv;


    public Veterinario(String nome, String senha, String email, String crmv) {
        super(nome, senha, email);
        this.crmv = crmv;
    }

    public Veterinario() {
        super();
        this.crmv = "";
    }
}

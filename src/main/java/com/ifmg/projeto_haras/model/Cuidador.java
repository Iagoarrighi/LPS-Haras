/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import java.time.LocalDate;
import lombok.Data;

/**
 *
 * @author gusta
 */
@Entity
@Data
@PrimaryKeyJoinColumn(name = "id")
public class Cuidador extends Pessoa {
    private LocalDate dataInicioContrato;
    
    public Cuidador(){
        super();
        this.dataInicioContrato = null;
    }

    public Cuidador(String nome, String senha, String email, LocalDate dataInicioContrato) {
        super(nome, senha, email);
        this.dataInicioContrato = dataInicioContrato;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.valid;

import com.ifmg.projeto_haras.model.Cuidador;
import com.ifmg.projeto_haras.model.exceptions.CuidadorException;
import java.time.LocalDate;

/**
 *
 * @author gusta
 */
public class ValidateCuidador {
    public Cuidador validaCamposEntrada(String nome, String senha, String email, String data){
        Cuidador cuidador = new Cuidador(nome, senha, email, LocalDate.parse(data));
        if (nome.isEmpty()) {
            throw new CuidadorException("Error - Campo vazio: 'nome'.");
        }
        cuidador.setNome(nome);
        if (senha.isEmpty()) {
            throw new CuidadorException("Error - Campo vazio: 'senha'.");
        }
        cuidador.setSenha(senha);
        if (email.isEmpty()) {
            throw new CuidadorException("Error - Campo vazio: 'email'.");
        }
        cuidador.setEmail(email);
        if (data.isEmpty()) {
            throw new CuidadorException("Error - Campo vazio: 'data de inicio de contrato'.");
        }
        cuidador.setDataInicioContrato(LocalDate.parse(data));
        
        
        return cuidador;
    }
}

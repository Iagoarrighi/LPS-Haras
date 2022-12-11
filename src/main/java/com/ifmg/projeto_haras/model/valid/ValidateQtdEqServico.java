/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.valid;

import com.ifmg.projeto_haras.model.exceptions.EquinoException;

/**
 *
 * @author gusta
 */
public class ValidateQtdEqServico {
    public Integer validaQuantidade(String quantidade){
        if (quantidade.isEmpty()) {
            throw new EquinoException("Error - Campo vazio: 'quantidade'.");
        }
        if (!isInteger(quantidade)){
            throw new EquinoException("Error - Campo não é inteiro: 'quantidade'.");
        }
        
        return Integer.parseInt(quantidade);
    }
    
    private boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }
}

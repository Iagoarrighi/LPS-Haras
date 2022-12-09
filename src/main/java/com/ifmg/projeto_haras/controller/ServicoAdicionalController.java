/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.controller;

import com.ifmg.projeto_haras.model.ServicoAdicional;
import com.ifmg.projeto_haras.model.dao.ServicoAdicionalDAO;
import com.ifmg.projeto_haras.model.exceptions.ServicoAdicionalException;
import com.ifmg.projeto_haras.model.valid.ValidateServicoAdicional;
import javax.swing.JTable;

/**
 *
 * @author gusta
 */
public class ServicoAdicionalController {
    private ServicoAdicionalDAO repositorio;
    
    public ServicoAdicionalController(){
        this.repositorio = new ServicoAdicionalDAO();
    }
    
    public void cadastrarServico(String servico, String preco){
        ValidateServicoAdicional valid = new ValidateServicoAdicional();
        ServicoAdicional novoSerAdicional = valid.validaCamposEntrada(servico, preco);
            
        repositorio.save(novoSerAdicional);
    }
    
    public void atualizarServico(int idSerAdicional, String servico, String preco){
        ValidateServicoAdicional valid = new ValidateServicoAdicional();
        ServicoAdicional novoSerAdicional = valid.validaCamposEntrada(servico, preco);
        
        novoSerAdicional.setId(idSerAdicional);
        repositorio.save(novoSerAdicional);
    }
    
    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadServicoAdicional(repositorio.findAll()), null);
    }
    
    public void excluirServico(ServicoAdicional servicoAdicional){
        if (servicoAdicional != null) {
            repositorio.delete(servicoAdicional);
        }else{
            throw new ServicoAdicionalException("Error: Baia inexistente.");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.controller;

import com.ifmg.projeto_haras.model.Proprietario;
import com.ifmg.projeto_haras.model.dao.ProprietarioDAO;
import com.ifmg.projeto_haras.model.exceptions.ProprietarioException;
import com.ifmg.projeto_haras.model.valid.ValidateProprietario;
import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author gusta
 */
public class ProprietarioController {
    private ProprietarioDAO repositorio;
    
    public ProprietarioController(){
        this.repositorio = new ProprietarioDAO();
    }
    
    public String buscarProprietariosString(){
        List<Proprietario> proprietarios = repositorio.findAll();
        
        String proprietarioIdNomeString = "";
        for (Proprietario prop : proprietarios) {
            proprietarioIdNomeString += prop.getId()+" - "+prop.getNome()+"\n";
        }
        
        return proprietarioIdNomeString;
    }
    
    public Proprietario buscarProprietarioPorId(Integer id){
        if(id == null){
            return null;
        }
        Proprietario prop = (Proprietario) repositorio.find(id);
        return prop;
    }
    
    public void cadastrarProprietario(String nome, String senha, String email, String cpf){
        ValidateProprietario valid = new ValidateProprietario();
        Proprietario novoCuidador = valid.validaCamposEntrada(nome, senha, email, cpf);
             
        repositorio.save(novoCuidador);
    }
    
    public void atualizarProprietario(int idCuidador, String nome, String senha, String email, String cpf){
        ValidateProprietario valid = new ValidateProprietario();
        Proprietario novoCuidador = valid.validaCamposEntrada(nome, senha, email, cpf);
        
        novoCuidador.setId(idCuidador);
        repositorio.save(novoCuidador);
    }
    
    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadProprietario(repositorio.findAll()), null);
    }
    
    public void excluirProprietario(Proprietario proprietario){
        if (proprietario != null) {
            repositorio.delete(proprietario);
        }else{
            throw new ProprietarioException("Error: Proprietario inexistente.");
        }
    }
}

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
import jakarta.persistence.OneToOne;
import lombok.Data;
/**
 *
 * @author iago_
 */
@Data
@Entity

public class Fatura {
      
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean foiPaga;
    @OneToOne(cascade = CascadeType.ALL)
    private Proprietario proprietario;
    
    
    public Fatura(){
        this.id = -1;
        this.foiPaga = false;
    }
    
    public Fatura(Boolean foiPaga){
        this.id = null;
        this.foiPaga = foiPaga;
    }
}

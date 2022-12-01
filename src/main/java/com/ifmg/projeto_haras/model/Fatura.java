/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model;

/**
 *
 * @author iago_
 */
public class Fatura {
    
@Data
@Entity
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Boolean foiPaga;
    
    
    public Fatura(){
        this.id = -1;
        this.foiPaga = false;
    }
    
    public Fatura(Boolean foiPaga){
        this.id = null;
        this.foiPaga = foiPaga;
    }
}

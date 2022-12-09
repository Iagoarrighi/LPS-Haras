/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.controller;

import com.ifmg.projeto_haras.model.Baia;
import com.ifmg.projeto_haras.model.Cuidador;
import com.ifmg.projeto_haras.model.Equino;
import com.ifmg.projeto_haras.model.Proprietario;
import com.ifmg.projeto_haras.model.Veterinario;
import com.ifmg.projeto_haras.model.dao.EquinoDAO;
import com.ifmg.projeto_haras.model.exceptions.EquinoException;
import com.ifmg.projeto_haras.model.valid.ValidateEquino;
import javax.swing.JTable;

/**
 *
 * @author gusta
 */
public class EquinoController {

    private EquinoDAO repositorio;

    public EquinoController() {
        this.repositorio = new EquinoDAO();
    }

    private Integer getIdDoidNome(String idNome) {
        if (idNome.equals("")) {
            return null;
        }
        String[] novoIdNome = idNome.split(" - ");
        return Integer.parseInt(novoIdNome[0]);
    }

    public void cadastrarEquino(String nome, String sexo,
            String raca, String nascimento, String prop, String vet,
            String baia, String cuidador) {

        System.out.println("ENTROU NO CADASTRAR");

        Integer idProprietario = getIdDoidNome(String.valueOf(prop));
        Integer idCuidador = getIdDoidNome(String.valueOf(cuidador));
        Integer idBaia=null;
        if (!String.valueOf(baia).equals("")) {
             idBaia = Integer.parseInt(String.valueOf(baia));
        }
        Integer idVeterinario = getIdDoidNome(String.valueOf(vet));

        ProprietarioController propC = new ProprietarioController();
        CuidadorController cuidC = new CuidadorController();
        BaiaController baiaC = new BaiaController();
        VeterinarioController vetC = new VeterinarioController();

        Proprietario propO = propC.buscarProprietarioPorId(idProprietario);
        Veterinario vetO = vetC.buscarVeterinarioPorId(idVeterinario);
        Baia baiaO = baiaC.buscarBaiaPorId(idBaia);
        Cuidador cuidO = cuidC.buscarCuidadorPorId(idCuidador);

        ValidateEquino valid = new ValidateEquino();
        Equino novoEquino = valid.validaCamposEntrada(nome, sexo,
                raca, nascimento, propO, vetO, baiaO, cuidO);

        repositorio.save(novoEquino);
    }

    public void atualizarEquino(int idEquino, String nome, String sexo,
            String raca, String nascimento, String prop, String vet,
            String baia, String cuidador) {

        System.out.println("ENTROU NO ATUALIZAR");

        Integer idProprietario = getIdDoidNome(String.valueOf(prop));
        Integer idCuidador = getIdDoidNome(String.valueOf(cuidador));
        Integer idBaia = Integer.parseInt(String.valueOf(baia));
        Integer idVeterinario = getIdDoidNome(String.valueOf(vet));

        ProprietarioController propC = new ProprietarioController();
        CuidadorController cuidC = new CuidadorController();
        BaiaController baiaC = new BaiaController();
        VeterinarioController vetC = new VeterinarioController();

        Proprietario propO = propC.buscarProprietarioPorId(idProprietario);
        Veterinario vetO = vetC.buscarVeterinarioPorId(idVeterinario);
        Baia baiaO = baiaC.buscarBaiaPorId(idBaia);
        Cuidador cuidO = cuidC.buscarCuidadorPorId(idCuidador);

        ValidateEquino valid = new ValidateEquino();
        Equino novoEquino = valid.validaCamposEntrada(nome, sexo,
                raca, nascimento, propO, vetO, baiaO, cuidO);

        novoEquino.setId(idEquino);
        repositorio.save(novoEquino);
    }

    public void atualizarTabela(JTable grd) {
        Util.jTableShow(grd, new TMCadEquino(repositorio.findAll()), null);
    }

    public void excluirEquino(Equino equino) {
        if (equino != null) {
            repositorio.delete(equino);
        } else {
            throw new EquinoException("Error: Equino inexistente.");
        }
    }
}

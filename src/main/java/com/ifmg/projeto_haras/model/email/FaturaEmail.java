/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ifmg.projeto_haras.model.email;

import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author gusta
 */
public class FaturaEmail {

    public FaturaEmail(String emailUsuario, String msg) {

        String EmailRemetente = "gustavofbigogno@gmail.com";
        String senhaEmailRemetente = "ksohkzuwgxelfkfh";

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthentication(EmailRemetente, senhaEmailRemetente);
        email.setSSLOnConnect(true);

        try {
            email.setFrom(EmailRemetente);
            email.setSubject("Fatura");
            email.setMsg(msg);
            email.addTo(emailUsuario);
            email.send();
            System.out.println("Email foi enviado com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author bruno.vrufino
 */
public class ExemplosDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);
        
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println(formatador.format(hoje));
    }
    
}

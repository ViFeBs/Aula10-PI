/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula10.MODEL;

import java.util.Date;

/**
 *
 * @author bruno.vrufino
 */
public class NotaFiscal {
    private int idNota;
    private int numeroNota;
    private double valorNota;
    private Date dataNota;
    
    public NotaFiscal(){
    
    }

    public int getIdNota() {
        return idNota;
    }

    public int getNumeroNota() {
        return numeroNota;
    }

    public double getValorNota() {
        return valorNota;
    }

    public Date getDataNota() {
        return dataNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public void setNumeroNota(int numeroNota) {
        this.numeroNota = numeroNota;
    }

    public void setValorNota(double valorNota) {
        this.valorNota = valorNota;
    }

    public void setDataNota(Date dataNota) {
        this.dataNota = dataNota;
    }
    
    
}

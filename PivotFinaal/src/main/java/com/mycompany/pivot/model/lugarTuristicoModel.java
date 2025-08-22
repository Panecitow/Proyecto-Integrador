/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.model;

/**
 *
 * @author reyze
 */
public class lugarTuristicoModel {



    public int getIdLugarTuristico() {
        return idLugarTuristico;
    }

    public void setIdLugarTuristico(int idLugarTuristico) {
        this.idLugarTuristico = idLugarTuristico;
    }

    public int getIdLugarDestacado() {
        return idLugarDestacado;
    }

    public void setIdLugarDestacado(int idLugarDestacado) {
        this.idLugarDestacado = idLugarDestacado;
    }

    public String getNombreLugarTuristico() {
        return nombreLugarTuristico;
    }

    public void setNombreLugarTuristico(String nombreLugarTuristico) {
        this.nombreLugarTuristico = nombreLugarTuristico;
    }

    public String getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(String costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    private int idLugarTuristico;
    private int idLugarDestacado;
    private String nombreLugarTuristico;
    private String costoEntrada;

    public lugarTuristicoModel(int idLugarTuristico, int idLugarDestacado, String nombreLugarTuristico, String costoEntrada) {
        this.idLugarDestacado = idLugarDestacado;
        this.idLugarTuristico = idLugarDestacado;
        this.nombreLugarTuristico = nombreLugarTuristico;
        this.costoEntrada= costoEntrada;
    }
    
        public lugarTuristicoModel( String nombreLugarTuristico, String costoEntrada) {
        this.nombreLugarTuristico = nombreLugarTuristico;
        this.costoEntrada= costoEntrada;
    }
             public lugarTuristicoModel(){
                 
    }

}

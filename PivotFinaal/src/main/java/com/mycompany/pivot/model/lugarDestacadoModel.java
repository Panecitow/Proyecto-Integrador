/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.model;

/**
 *
 * @author Victor Dorian
 */
public class lugarDestacadoModel {

    public int getIdLugarDestacado() {
        return idLugarDestacado;
    }

    public void setIdLugarDestacado(int idLugarDestacado) {
        this.idLugarDestacado = idLugarDestacado;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoLugar() {
        return tipoLugar;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    private int idLugarDestacado;
    private String nombreLugar;
    private String direccion;
    private String tipoLugar;
    private String descripcion;
    
    public lugarDestacadoModel(int idLugarDestacado, String nombreLugar, String direccion, String tipoLugar, String descripcion) {
        this.idLugarDestacado = idLugarDestacado;
        this.nombreLugar = nombreLugar;
        this.direccion = direccion;
        this.tipoLugar = tipoLugar;
        this.descripcion = descripcion;
    }
    
        public lugarDestacadoModel( String nombreLugar, String direccion, String tipoLugar, String descripcion) {
        this.nombreLugar = nombreLugar;
        this.direccion = direccion;
        this.tipoLugar = tipoLugar;
        this.descripcion = descripcion;
    }
    public lugarDestacadoModel(){  
    }
    @Override
    public String toString() {
        return nombreLugar;
    }
}
    


    


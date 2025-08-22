/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.model;

/**
 *
 * @author reyze
 */
public class restaurantesModel {

    public int getIdRestaurantes() {
        return idRestaurantes;
    }

    public void setIdRestaurantes(int idRestaurantes) {
        this.idRestaurantes = idRestaurantes;
    }

    public int getIdLugarDestacado() {
        return idLugarDestacado;
    }

    public void setIdLugarDestacado(int idLugarDestacado) {
        this.idLugarDestacado = idLugarDestacado;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }
    private int idRestaurantes;
    private int idLugarDestacado;
    private String nombreRestaurante;

    public restaurantesModel(int idRestaurantes, int idLugarDestacado, String nombreRestaurante) {
        this.idRestaurantes = idRestaurantes;
        this.idLugarDestacado = idLugarDestacado;
        this.nombreRestaurante = nombreRestaurante;
    }

    public restaurantesModel(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

        public restaurantesModel() {
    }
        
            @Override
    public String toString() {
        return nombreRestaurante;
    }
}

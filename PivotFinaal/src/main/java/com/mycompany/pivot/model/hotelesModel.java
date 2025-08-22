/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.model;

/**
 *
 * @author reyze
 */
public class hotelesModel {

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }
//:((((
    public int getIdLugarDestacado() {
        return idLugarDestacado;
    }

    public void setIdLugarDestacado(int idLugarDestacado) {
        this.idLugarDestacado = idLugarDestacado;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getCostoNoche() {
        return costoNoche;
    }

    public void setCostoNoche(String costoNoche) {
        this.costoNoche = costoNoche;
    }

    private int idHotel;
    private int idLugarDestacado;
    private String nombreHotel;
    private String costoNoche;

    public hotelesModel(int idHotel, int idLugarDestacado, String nombreHotel, String costoNoche) {
        this.idHotel = idHotel;
        this.idLugarDestacado = idLugarDestacado;
        this.nombreHotel = nombreHotel;
        this.costoNoche = costoNoche;
    }
        public hotelesModel(String nombreHotel, String costoNoche) {
        this.nombreHotel = nombreHotel;
        this.costoNoche = costoNoche;
    }
                public hotelesModel() {
    }
                
                   @Override
    public String toString() {
        return nombreHotel;
    }
}


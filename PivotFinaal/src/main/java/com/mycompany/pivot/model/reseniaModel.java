/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.model;

/**
 *
 * @author reyze
 */
public class reseniaModel {

    public int getIdResenia() {
        return idResenia;
    }

    public void setIdResenia(int idResenia) {
        this.idResenia = idResenia;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdLugarDestacado() {
        return idLugarDestacado;
    }

    public void setIdLugarDestacado(int idLugarDestacado) {
        this.idLugarDestacado = idLugarDestacado;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getFechaResenia() {
        return fechaResenia;
    }

    public void setFechaResenia(String fechaResenia) {
        this.fechaResenia = fechaResenia;
    }

    private int idResenia;
    private int idUsuario;
    private int idLugarDestacado;
    private int calificacion;
    private String comentario;
    private String fechaResenia;

    public reseniaModel(int idResenia, int idUsuario, int idLugarDestacado, int calificacion, String comentario, String fechaResenia) {
        this.idResenia = idResenia;
        this.idUsuario = idUsuario;
        this.idLugarDestacado = idLugarDestacado;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaResenia = fechaResenia;
    }
        public reseniaModel(int idUsuario, int idLugarDestacado, int calificacion, String comentario, String fechaResenia) {
        this.idUsuario = idUsuario;
        this.idLugarDestacado = idLugarDestacado;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaResenia = fechaResenia;
    }
            public reseniaModel( ) {
    }
}

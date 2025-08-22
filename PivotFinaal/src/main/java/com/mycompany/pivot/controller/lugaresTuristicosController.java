/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.controller;

import com.mycompany.pivot.conexion.conexionBD;
import com.mycompany.pivot.model.lugarTuristicoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reyze
 */
public class lugaresTuristicosController {
    
      public static List<lugarTuristicoModel> obtenerTodos() {
        var lista = new ArrayList<lugarTuristicoModel>();
        String sql = "SELECT * FROM tb_lugarturistico";
    try(Connection con = conexionBD.obtenerConexion();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql)){
    while (rs.next()) {
            lista.add(new lugarTuristicoModel(rs.getInt("idLugarDestacado"),rs.getInt("idLugarTuristico"), rs.getString("nombreLugarTuristico"), rs.getString("costoEntrada")));
        }
    }
    catch(SQLException ex){
        
    ex.printStackTrace();
    }
    return lista ;
}
    
}

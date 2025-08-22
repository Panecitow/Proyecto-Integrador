/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.controller;

import com.mycompany.pivot.conexion.conexionBD;
import com.mycompany.pivot.model.lugarDestacadoModel;
import com.mycompany.pivot.model.lugarTuristicoModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Dorian
 */
public class lugarDestacadoController {
public static List<lugarDestacadoModel> obtenerTodos() {
        var lista = new ArrayList<lugarDestacadoModel>();
        String sql = "SELECT * FROM tb_lugardestacado";
    try(Connection con = conexionBD.obtenerConexion();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql)){
    while (rs.next()) {
            lista.add(new lugarDestacadoModel(rs.getInt("idLugarDestacado"),rs.getString("nombreLugar"), rs.getString("direccion"), rs.getString("tipoLugar"), rs.getString("descripcion")));
        }
    }
    catch(SQLException ex){
        
    ex.printStackTrace();
    }
    return lista ;
}
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.controller;

import com.mycompany.pivot.conexion.conexionBD;
import com.mycompany.pivot.model.hotelesModel;
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
public class hotelesController {
          public static List<hotelesModel> obtenerTodos() {
        var lista = new ArrayList<hotelesModel>();
        String sql = "SELECT * FROM tb_hotel";
    try(Connection con = conexionBD.obtenerConexion();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql)){
    while (rs.next()) {
            lista.add(new hotelesModel(rs.getInt("idHotel"),rs.getInt("idLugarDestacado"), rs.getString("nombreHotel"), rs.getString("costoNoche")));
        }
    }
    catch(SQLException ex){
        
    ex.printStackTrace();
    }
    return lista ;
}
}

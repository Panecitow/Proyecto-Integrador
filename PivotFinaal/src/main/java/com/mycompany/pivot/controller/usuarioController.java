/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.controller;

import com.mycompany.pivot.conexion.conexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import  com.mycompany.pivot.model.usuarioModel;


/**
 *
 * @author reyze
 */
public class usuarioController {
    
        public boolean login(String usuario, String password){
        String sql = "SELECT * FROM tb_usuario WHERE nombreUsuario = ? AND password = ?";
        try(Connection con = conexionBD.obtenerConexion();
                PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1, usuario);
            ps.setString(2,password);
            
            try(ResultSet rs = ps.executeQuery()){
                return rs.next();
            }
        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

        
            public static boolean insertarUsuario(usuarioModel usuario) {
        String sql = "INSERT INTO tb_usuario (nombreUsuario,password) VALUES (?,?)";
        try (Connection con = conexionBD.obtenerConexion(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getPassword());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

    }
}

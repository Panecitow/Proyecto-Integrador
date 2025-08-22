/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.controller;

import com.mycompany.pivot.conexion.conexionBD;
import com.mycompany.pivot.model.reseniaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author reyze
 */
public class reseniaController {
    public static boolean insertarResenia(reseniaModel resenia) {
        String sql = "INSERT INTO tb_resenia (idUsuario,idLugarDestacado,calificacion,comentario,fechaResenia) VALUES (?,?,?,?,?)";
        try (Connection con = conexionBD.obtenerConexion(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, resenia.getIdUsuario());
            ps.setInt(2, resenia.getIdLugarDestacado());
            ps.setInt(3, resenia.getCalificacion());
            ps.setString(4, resenia.getComentario());
            ps.setString(5, resenia.getFechaResenia());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;

        }

    }
    
              public static List<reseniaModel> obtenerTodos() {
        var lista = new ArrayList<reseniaModel>();
        String sql = "SELECT * FROM tb_resenia";
    try(Connection con = conexionBD.obtenerConexion();
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(sql)){
    while (rs.next()) {
lista.add(new reseniaModel(
    rs.getInt("idResenia"),
    rs.getInt("idUsuario"),
    rs.getInt("idLugarDestacado"),
    rs.getInt("calificacion"),
    rs.getString("comentario"),
    rs.getString("fechaResenia")  // 
));
        }
    }
    catch(SQLException ex){
        
    ex.printStackTrace();
    }
    return lista ;
}
    
    public static List<reseniaModel>buscarReseniaPorNombre(String nombreresenia){
        List<reseniaModel>listaResenias = new ArrayList<>();
        String sql = "SELECT * FROM tb_resenia WHERE calificacion LIKE ?";
        try(Connection con = conexionBD.obtenerConexion();
                PreparedStatement ps = con.prepareStatement(sql)){
                ps.setString(1, "%" + nombreresenia + "%");
                ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                reseniaModel resenia = new reseniaModel();
                resenia.setIdResenia(rs.getInt("idResenia"));
                resenia.setIdUsuario(rs.getInt("idUsuario"));
                resenia.setIdLugarDestacado(rs.getInt("idLugarDestacado"));
                resenia.setCalificacion(rs.getInt("calificacion"));
                resenia.setComentario(rs.getString("comentario"));
                resenia.setFechaResenia(rs.getString("fechaResenia"));
                
                listaResenias.add(resenia);
                
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }
         return listaResenias;       
    }
    public static boolean actualizarResenia(reseniaModel resenia) {
        String sql = "UPDATE tb_resenia SET idUsuario=?,idLugarDestacado=?,calificacion=?,comentario=?,fechaResenia=? WHERE idResenia=? ";
        boolean actualizado = false;
        try (Connection con = conexionBD.obtenerConexion(); 
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, resenia.getIdUsuario());
        ps.setInt(2, resenia.getIdLugarDestacado());
        ps.setInt(3, resenia.getCalificacion());
        ps.setString(4, resenia.getComentario());
        ps.setString(5, resenia.getFechaResenia());
        ps.setInt(6, resenia.getIdResenia());


            int filasAfectadas = ps.executeUpdate();
            actualizado = filasAfectadas>0;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
        return actualizado;
    }
    public static boolean eliminarResenia(int idResenia){
        String sql = "DELETE FROM tb_resenia WHERE idResenia= ?";
        try(Connection con = conexionBD.obtenerConexion();
                PreparedStatement ps = con.prepareStatement(sql)){
            
            ps.setInt(1, idResenia);
            ps.executeUpdate();
            return true;
            
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
}


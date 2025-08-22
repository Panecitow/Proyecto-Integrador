/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pivot.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author reyze
 */
public class conexionBD {
    public static final String URL = "jdbc:mysql://localhost:3306/pivot";
    public static final String USER = "root";
    public static final String PASSWORD = "Martinez12612";
    public static Connection obtenerConexion() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);

    }
}

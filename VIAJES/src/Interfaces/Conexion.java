/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    Connection connect=null;
    public Connection conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect=DriverManager.getConnection("jdbc:mysql://localhost/viajes","root","");
          //  JOptionPane.showMessageDialog(null, "Se conectó a la base de datos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Fallo en la conexión.. Comuniquese con el cabron que le vendió el software");
        }
        
        return connect;
    }
}

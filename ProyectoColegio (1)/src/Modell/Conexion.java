/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

/**
 *
 * @author USUARIO
 */
import java.sql.*;

public class Conexion {

    Connection cn;
    private String url = "jdbc:mysql://localhost:3306/proyecto_colegio";
    private String user = "root";
    private String password = "12345";

    public Connection cn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, user, password);
            System.out.println("conectar");
        } catch (Exception e) {
            System.out.println("error " + e);
        }
        return cn;
    }
}
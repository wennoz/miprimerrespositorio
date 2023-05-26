/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Ambiente 209-1
 */
public class ClaseEstudiante extends ClasePersona {

    Conexion conectar = new Conexion();
    Connection cn = conectar.cn();

    public String crear() {
        try {
            PreparedStatement create = cn.prepareStatement("INSERT INTO estudiante(nombre,apellido,identificacion,edad,estado) VALUES(?,?,?,?,?)");
            create.setString(1, this.getNombre());
            create.setString(2, this.getApellido());
            create.setInt(3, Integer.parseInt(this.getIdentificacion()));
            create.setInt(4, this.getEdad());
            create.setString(5, "A");
            create.executeUpdate();
            return "estudiante creado";
        } catch (Exception e) {
            return "error" + e.getMessage();
        }
    }

    private String curso;// solo tiene el curso al que pertenece y sus getter y setters

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modell;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ambiente 209-1
 */
public class ClaseCurso  {
 private int codigo;
 private String nombre;
 public static List<ClaseCurso> cursos=new ArrayList<>();//una lista de todos los cursos que pueden existir y sus geter y setter

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<ClaseCurso> getCursos() {
        return cursos;
    }

    public static void setCursos(List<ClaseCurso> cursos) {
        ClaseCurso.cursos = cursos;
    }
}

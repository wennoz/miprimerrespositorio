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
public class ClasePersona {

    private String identificacion;

    private String nombre, apellido;
    private int edad;
   
        private static List<ClasePersona> listaPersonas = new ArrayList<>();//aca tenemos la lista de personas 
       public static List<ClasePersona> getListaPersonas() {//este es el metodo geter de la lista por si se necesita
        return listaPersonas;
    }

    public  void setListaPersonas(List<ClasePersona> listaPersonas) {//metodo set
        this.listaPersonas = listaPersonas;
    }
    public String getIdentificacion() {//metodos getters y setters
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}

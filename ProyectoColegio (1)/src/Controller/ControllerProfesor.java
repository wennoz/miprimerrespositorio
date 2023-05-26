/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modell.ClaseCurso;
import Modell.ClaseProfesor;
import Modell.ClasePersona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WINDOWS
 */
public class ControllerProfesor {
     
     private static List<ClasePersona> listaPersonas = ClasePersona.getListaPersonas();
     private static List<ClaseProfesor> ListaProfesor=new ArrayList<>();
       public static List<ClaseCurso> cursos=ClaseCurso.getCursos();


    public static List<ClaseProfesor> getListaProfesor() {
        return ListaProfesor;
    }

    public static void setListaProfesor(List<ClaseProfesor> ListaProfesor) {
        ControllerProfesor.ListaProfesor = ListaProfesor;
    }

    public  boolean agregarcursoImparte(int codigo,String nombre,ClaseProfesor profesor) {
         List<ClaseCurso> cursoimparte=profesor.getCursoimparte();
        
             for(ClaseCurso curs:cursoimparte){
             if(curs.getCodigo()==codigo){
             return false;
             }
           }
         ClaseCurso curso=new ClaseCurso();
         curso.setCodigo(codigo);
         curso.setNombre(nombre);
          cursoimparte.add(curso);
      return true;
        
       
    }

    public  boolean editarcurso(int codigo,String nombre,ClaseProfesor profesor) {
         ClaseCurso curso=new ClaseCurso();
       List<ClaseCurso> cursoimparte=profesor.getCursoimparte();
         for(int j=0;j<cursoimparte.size();j++){
          if(cursoimparte.get(j).getCodigo()==codigo){
              curso.setCodigo(codigo);
              curso.setNombre(nombre);
          cursoimparte.set(j, curso);
       return true;
     
          }
        }
       return false;
    }

    public  boolean eliminarcurso(int codigo ,ClaseProfesor profesor) {
       List<ClaseCurso> cursoimparte=profesor.getCursoimparte();
                
         
       
         for(int j=0;j<cursoimparte.size();j++){
          if(cursoimparte.get(j).getCodigo()==codigo){
           cursoimparte.remove(j);
          return true;
     
          }
        }
      return false;
    }
  
    
     public boolean registrarProfesor(ClasePersona persona) {
     
        String identificacion = persona.getIdentificacion();
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int edad = persona.getEdad();
        
        ClaseProfesor profesor=new ClaseProfesor();
        profesor.setNombre(nombre);
        profesor.setApellido(apellido);
        profesor.setIdentificacion(identificacion);
        profesor.setEdad(edad);

       for(ClasePersona person:listaPersonas){
       if(person.getIdentificacion().equalsIgnoreCase(identificacion)){
       return false;
        }
       }
       listaPersonas.add(persona);
       ListaProfesor.add(profesor);
       return true;

    }

    public boolean actualizarProfesor(ClasePersona persona) {
         String identificacion = persona.getIdentificacion();
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int edad = persona.getEdad();
        
        ClaseProfesor profesor=new ClaseProfesor();
        profesor.setNombre(nombre);
        profesor.setApellido(apellido);
        profesor.setIdentificacion(identificacion);
        profesor.setEdad(edad);

        for (int j = 0; j < listaPersonas.size(); j++) {
            if (listaPersonas.get(j).getIdentificacion().equalsIgnoreCase(identificacion)) {
                 listaPersonas.set(j, persona);
                 ListaProfesor.set(j, profesor);
                 return true;

            }
        }

        return false;

    }

    public boolean EliminarProfesor(String identificacion) {
        int indice = 0;
        String identificacion1 = identificacion;

        for (int j = 0; j < listaPersonas.size(); j++) {
            if (listaPersonas.get(j).getIdentificacion().equalsIgnoreCase(identificacion)) {
                listaPersonas.remove(j);
                ListaProfesor.remove(j);
               return true;
            }
        }
        return false;

    }   
    

}

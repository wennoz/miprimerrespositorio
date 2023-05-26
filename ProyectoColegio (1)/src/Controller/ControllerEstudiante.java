/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modell.ClaseCurso;
import Controller.ControllerCurso;
import Modell.ClaseEstudiante;
import Modell.ClasePersona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WINDOWS
 */
public class ControllerEstudiante {

    private static List<ClaseCurso> cursos = ControllerCurso.getCursos();//lista de los cursos que se trae de controllercurso
    private static List<ClaseEstudiante> ListaEstudiantes = new ArrayList<>();//aca hay una lista de estudiante 
    private static List<ClasePersona> listaPersonas = ClasePersona.getListaPersonas();//aca esta la lista de personas

//aca esyan los getter y setter de las listas    
    public static List<ClaseEstudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public static void setCursoMatriculado(List<ClaseCurso> cursoMatriculado) {
        ControllerEstudiante.cursos = cursoMatriculado;
    }

    public static List<ClaseCurso> getCursos() {
        return cursos;
    }

    public static void setCursos(List<ClaseCurso> cursos) {
        ControllerEstudiante.cursos = cursos;
    }

    //aca esta es el metodo para matricular, que es darle un suros a un estudiante 
    public boolean matricular(int codigo, ClaseEstudiante estudiante) {// resivimos el codigo del curso y el estudiante al que se lo vamos a relacionarr
        for (ClaseCurso curs : cursos) {//recorremos la lista de cursos con un foreach 
            if (curs.getCodigo() == codigo) {//verificamos si el codigo del curso si esta en la lista
                String nombreCurso = curs.getNombre();//si esta el curso estraemos el nombre 

                estudiante.setCurso(nombreCurso);//este nombre se los asiganamos al curso del estudiante 
                return true;//retornamos true

            }
        }

        return false;// retorna false si no se cumple la condicion de arriba

    }

    public boolean editarMatricula(int codigo, ClaseEstudiante estudiante) {//se hace lo mismo que arriba para editar

        for (ClaseCurso curs : cursos) {
            if (curs.getCodigo() == codigo) {
                String nombreCurso = curs.getNombre();

                estudiante.setCurso(nombreCurso);
                return true;

            }
        }

        return false;
    }

    public boolean eliminarMatricula(int codigo, ClaseEstudiante estudiante) {// se hace lo mismo pero se envia un estring vacio para eliminar

        for (ClaseCurso curs : cursos) {
            if (curs.getCodigo() == codigo) {
                estudiante.setCurso("");
                return true;

            }
        }

        return false;

    }
      ClaseEstudiante estudiante = new ClaseEstudiante();
    public String registrarEstudiante(ClasePersona persona) {// aca resivimos una persona para agregarla a la lista de personas y estudiantes

        String identificacion = persona.getIdentificacion();//se sacan los datos de la  persona
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int edad = persona.getEdad();
        
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setIdentificacion(identificacion);
        estudiante.setEdad(edad);
        
        return estudiante.crear();

        
    }

    public boolean actualizarestudiante(ClasePersona persona) {// se hace lo mismo que arriba
        String identificacion = persona.getIdentificacion();
        String nombre = persona.getNombre();
        String apellido = persona.getApellido();
        int edad = persona.getEdad();

        ClaseEstudiante estudiante = new ClaseEstudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setIdentificacion(identificacion);
        estudiante.setEdad(edad);

        for (int j = 0; j < listaPersonas.size(); j++) {//aca lo que se hace es recorrer la lista de personas 
            if (listaPersonas.get(j).getIdentificacion().equalsIgnoreCase(identificacion)) {//cuando la identificacion se la misma 
                listaPersonas.set(j, persona);// se toma la posicion y se envia la nueva persona y nuevo estudiante 
                ListaEstudiantes.set(j, estudiante);
                return true;

            }
        }

        return false;

    }

    public boolean EliminarEstudiante(String identificacion) {// aca solo se resive la identificacion 
        for (int j = 0; j < listaPersonas.size(); j++) {// se recorre la lista de persinas 
            if (listaPersonas.get(j).getIdentificacion().equalsIgnoreCase(identificacion)) {// se busca la persona con esa identificacion
                listaPersonas.remove(j);// se borra la persona que coincida con la posicion en las dos listas 
                ListaEstudiantes.remove(j);
                return true;
            }
        }
        return false;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Modell.ClaseCurso;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/**
 *
 * @author WINDOWS
 */
public class ControllerCurso {
    private static List<ClaseCurso> cursos=new ArrayList<>();//aca tengo la lista de cursos 
    
    
    public static List<ClaseCurso> getCursos() { //los getter and setter de la lista  
        return cursos;
    }

    public static void setCursos(List<ClaseCurso> cursos) {
        ControllerCurso.cursos = cursos;
    }
    
         public  boolean agregarcurso(ClaseCurso curso) { // el metodo de agregar un nuevo curso al metodo
         int codigo = curso.getCodigo(); //sacamos el codigo del curso que resivimos por parametro
             
         for(ClaseCurso curs:cursos){//aca con foreach recorremos los cursos que hay en la lista de cusros 
          if(curs.getCodigo()==codigo){//aca buscamos si algun curso ya tiene el codigo
          return false;// si encuentra uno que cohincida retorna falso
     
          }
        }
       cursos.add(curso);// si la condicion no se cumple el curso se agrega a lamlista y se retorna true
      return true;
    }

    public  boolean editarcurso(ClaseCurso curso) {//aca para editar tambien resie el curso para editar
        
                
         int codigo = curso.getCodigo();// se guarda el codigo del curso en una variable
       
         for(int j=0;j<cursos.size();j++){// se hace un bluque for 
          if(cursos.get(j).getCodigo()==codigo){//se busca el curso que cohincida con el codigo del curso resivido
          cursos.set(j, curso);// si cohincide le paso el indice para que modifique lo qu ehya en esa posicion por el curso que se le paso por parametro
          return true;//retorna true
     
          }
        }
       return false;
    }

    public boolean eliminarcurso(ClaseCurso curso) { //este es igual al de editar solo que elimina
       
                
         int codigo = curso.getCodigo();
       
         for(int j=0;j<cursos.size();j++){
          if(cursos.get(j).getCodigo()==codigo){
         cursos.remove(j);// aca se le pasa el indice para que elimine el curso que esta en esa posicion
          return true;
     
          }
        }
        return false;
    }
      public Set<String> getNombresCursosSinDuplicados() {//aca cree un metodo para que no se repitan los nombres de los cursos 
        Set<String> setNombres = new HashSet<>();// creo un hashset que no deje meter s¿datos iguales
        for (ClaseCurso curso : cursos) {//recorro los cursos que hay en la lista y meto los nobres en el hashset
            setNombres.add(curso.getNombre());
        }
        return setNombres; //retorno el hashset, esto lo hago para usarlo en el combo box
    }
}

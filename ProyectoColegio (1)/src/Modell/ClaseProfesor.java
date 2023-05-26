package Modell;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ambiente 209-1
 */
public class ClaseProfesor extends ClasePersona {

    private static List<ClaseCurso> cursoimparte=new ArrayList<>();//lista de los cursos que dicta el prpofesor
     
 
//geter y setters
    public  List<ClaseCurso> getCursoimparte() {
        return cursoimparte;
    }

    public void setCursoimparte(List<ClaseCurso> cursoimparte) {
        this.cursoimparte = cursoimparte;
    }
 
    
    public static boolean mostrarcursosimparte(ClaseCurso curso){
       return true;
    }
}

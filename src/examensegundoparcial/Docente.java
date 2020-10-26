/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examensegundoparcial;

/**
 *
 * @author tavoGeek
 */
public class Docente extends Persona {

    private int numEmp;

    public Docente(int numEmp, String nombre) {
        super(nombre);
        this.numEmp = numEmp;
    }

    public String Practicar() {
        return this.getNombre() + " esta practicando";
    }
    
    public String Evaluar(int matricula) {
        return "Evaluando al alumno " + matricula;
    }

    public int getNumEmp() {
        return numEmp;
    }

    public void setNumEmp(int numEmp) {
        this.numEmp = numEmp;
    }
}

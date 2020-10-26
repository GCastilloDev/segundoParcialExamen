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
public class Alumno extends Persona {

    private int matricula;

    public Alumno(int matricula, String nombre) {
        super(nombre);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String Practicar() {
        return "El alumno " + this.getNombre() + " esta practicando...";
    }

    public String Estudiar() {
        return "El alumno " + this.getNombre() + " esta estudiando";
    }

}

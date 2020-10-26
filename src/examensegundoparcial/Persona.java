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
public abstract class Persona implements Actor{

    private String nombre;
    public int edad;
    private String curp;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String Asistir() {
        return "Asistiendo...";
    }

    public abstract String Practicar();

    public int imitarvoz(int value) {
        return value + 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
}

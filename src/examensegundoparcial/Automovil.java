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
public class Automovil extends Vehiculo {

    private String placas;

    public Automovil(String placas) {
        this.placas = placas;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public String Emplacar() {
        return "Emplacanado...";
    }

    public String Encender() {
        return "Encendiendo...";
    }

}

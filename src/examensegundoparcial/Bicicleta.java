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
public class Bicicleta extends Vehiculo {

    private int diablito;

    public Bicicleta() {
    }

    public int getDiablito() {
        return diablito;
    }

    public void setDiablito(int diablito) {
        this.diablito = diablito;
    }

    public String ponerDablos() {
        return "Poniendo dablos...";
    }
    
    public String Apagar() {
        return "Apagando...?? la bicicleta se apaga?";
    }
}

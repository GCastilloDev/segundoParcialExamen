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
public class Vehiculo implements Actor {

    private int numllantas;
    private String color;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(int numllantas) {
        this.numllantas = numllantas;
    }

    public int imitarvoz(int value) {
        return value + 10;
    }

    public int getNumllantas() {
        return numllantas;
    }

    public void setNumllantas(int numllantas) {
        this.numllantas = numllantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void Frenar() {

    }

    public void Acelerar() {

    }

    public String Apagar() {
        return this.modelo + " apagandose...";
    }

}

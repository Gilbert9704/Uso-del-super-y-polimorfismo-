/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicicleta28032016;

/**
 *
 * @author Estudiante
 */
public class Circulo extends FiguraGeometrica {
    
    private double radio;

    public Circulo(double radio, String color) {
        super(color);
        this.radio = radio;
    }
    //Ahora redefinimos el metodo area
    @Override //Override lo uso para sobreescribir algun metodo que necesito cambiar
    public double area(){
        return Math.PI*this.radio*this.radio;
    }
}

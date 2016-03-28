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
public class Bicicleta {
    
    private Circulo[] ruedas;
    private Circulo plato;
    private Triangulo[] marco;
    public double area;

    public Bicicleta(Circulo[] ruedas, Circulo plato, Triangulo[] marco, double area) {
        this.ruedas = ruedas;
        this.plato = plato;
        this.marco = marco;
        this.area = area;
    }
    
    public double area(){
        double resultado = 0;
        resultado += this.plato.area();
        
        for (Circulo c : this.ruedas)
            resultado += c.area();
        for (Triangulo t : this.marco)
            resultado += t.area();
        return resultado;
    }
    
    /*
    segunda opcion
    private FiguraGeometrica[] componentes;
    
    public Bicicleta(Circulo[] ruedas, Circulo plato, Triangulo[] marco, double area) {
        this.componentes = componentes;
    }
    
    public double area(){
    double resultado = 0;
    for(FiguraGeometrica c : this.componentes)
        resultado += c.area();
    return resultado;
    }
    */
}

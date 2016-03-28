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
public class Bicicleta2 {
    private FiguraGeometrica[] componentes;
    
    public Bicicleta2(FiguraGeometrica[] componentes) {
        this.componentes = componentes;
    }
    
    public double area(){
    double resultado = 0;
    for(FiguraGeometrica c : this.componentes)
        resultado += c.area();
    
    return resultado;
    }
    
}

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
public class FiguraGeometrica {
    
    protected String color;

    public FiguraGeometrica(String color) {
        this.color = color; 
    }
    
    public double area(){
        System.out.println("En Padre");
        return 0;
    }
    
}

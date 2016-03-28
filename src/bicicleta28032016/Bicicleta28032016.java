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
public class Bicicleta28032016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FiguraGeometrica[] = componentes = new FiguraGeometrica[6];
        componentes[0] = new Circulo(1, "a");
        componentes[1] = new Circulo(1, "a");
        componentes[2] = new Triangulo(2, "b");
        componentes[3] = new Triangulo(2, "b");
        componentes[4] = new Triangulo(2, "b");
        componentes[5] = new Circulo(1, "p");
        
        Bicicleta b = new Bicicleta(componentes);
        System.out.println(b.area());
        
        /*(Primera Opcion Circulo c1 = new Circulo(1, "verde");
        System.out.println(c1.area())
        Triangulo[] marco = new Triangulo;
        
        
        Circulo[] ruedas = new Circulo[2];
        ruedas[0] = new Circulo(1, "a");
        ruedas[1] = new Circulo(1, "a");
        
        Triangulo[] marco = new Triangulo[3];
        marco[0] = new Triangulo(2, "b");
        marco[1] = new Triangulo(2, "b");
        marco[2] = new Triangulo(2, "b");
        Circulo plato = new Circulo(1, "p");
        
        Bicicleta b = new Bicicleta(ruedas, plato, marco);
        System.out.println(b.area());
        */
    }
    
}

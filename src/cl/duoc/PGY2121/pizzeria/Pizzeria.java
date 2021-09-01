/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.pizzeria;

import java.util.Scanner;



/**
 *
 * @author ovicr
 */
public class Pizzeria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Boleta boleta = new Boleta();
        boleta.setNumeroBoleta(1);
        Pizza pizza1 = new Pizza("pepperoni","Grande","delgada", boleta);
        String nombre = pizza1.getNombre();
        System.out.println("ud pidio una pizza: " + nombre);
        System.out.println("ud pidio una pizza: " + pizza1.getNombre());
        
        int precio = 0;
        String tamano = pizza1.getTamano();
        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la pizza: ");
        String tamano2 = s.nextLine();
        pizza1.setTamano(tamano2);
        
        System.out.println("tamaño pizza: " + tamano2);
        
        switch(tamano){
            case "grande":
                precio = 8000;
                break;
            case "Mediana":
                precio = 6000;
                break;
            default:
                precio = 5000;
        }
       
        
        System.out.println("largo tamaño: " + pizza1.getTamano().length());
        
        System.out.println("Usted debe pagar: " + precio);
        boleta.setTotalCompra(precio);
        pizza1.setBoleta(boleta);
        
        int total = pizza1.getBoleta().calcularCuenta();
        
        System.out.println("El total de su compra es: " + total);

    }
    
}

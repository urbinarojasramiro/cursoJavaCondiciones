/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.pizzeria;

import java.util.ArrayList;
import java.util.List;
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
        Scanner s = new Scanner(System.in);
        List<Pizza> pizzas = new ArrayList<Pizza>();
        int opcion = 0;
        int numeroBoleta = 1000;
        while(opcion != 5){
            Pizza pizza1 = new Pizza();
            System.out.println("1. Ingresar Pizza");
            System.out.println("5. Salir");
            opcion = s.nextInt();
            s.nextLine(); 
            if(opcion == 1){
                
                System.out.println("Ingrese el nombre de la pizza: ");
                String nombreInput = s.nextLine();
                pizza1.setNombre(nombreInput);
                System.out.println("Ud pidio una pizza: " + pizza1.getNombre());
                
                System.out.println("Ingrese el tamaño");
                String tamano = s.nextLine();
                pizza1.setTamano(tamano);
                System.out.println("Ud pidio una pizza de tamaño: " + pizza1.getTamano());
                
                boolean validacionMasa = false;
                while(!validacionMasa){
                    System.out.println("Ingrese el tipo de masa:");
                    String masa = s.nextLine();
                    if("Delgada".equals(masa) || "Normal".equals(masa)){
                        pizza1.setMasa(masa);
                        validacionMasa = true;
                    }else{
                        System.out.println("El tipo de masa no es valido, intente nuevamente!");
                    }
                }
                int precio = 0;
                switch(pizza1.getTamano()){
                    case "Grande":
                        precio = 8000;
                        break;
                    case "Mediana":
                        precio = 6500;
                        break;
                    case "Individual":
                        precio = 4000;
                        break;
                    default:
                        precio = 3000;
                }
                
                Boleta boleta = new Boleta();
                boleta.setNumeroBoleta(numeroBoleta++);
                boleta.setTotalCompra(precio);
                pizza1.setBoleta(boleta);
                pizzas.add(pizza1);
            } 
        }
        System.out.println("Usted compro las siguientes pizzas:");
        int totalCompra = 0;
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getNombre());
            System.out.println(pizza.getTamano());
            System.out.println(pizza.getMasa());
            System.out.println("----------------------");
            totalCompra = totalCompra + pizza.calcularTotalCompra();
        }
        
        System.out.println("El total de su compra es: " + totalCompra);

    }
    
}

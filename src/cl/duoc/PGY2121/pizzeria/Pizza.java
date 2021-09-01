/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.pizzeria;

/**
 *
 * @author ovicr
 */
public class Pizza {
    private String nombre;
    private String tamano;
    private String masa;
    private Boleta boleta;

    public Pizza(String nombre, String tamano, String masa, Boleta boleta) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.boleta = boleta;
    }

    

    public Pizza() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public Boleta getBoleta() {
        return boleta;
    }

    public void setBoleta(Boleta boleta) {
        this.boleta = boleta;
    }
    
    

    public void setMasa(String masa) {
        this.masa = masa;
    }
    
    public void preparar(){
        
        System.out.println("estamos preparando su pizza");
    }
    
}

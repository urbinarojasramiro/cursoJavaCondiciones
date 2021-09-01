/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.PGY2121.pizzeria;

/**
 *
 * @author escor
 */
public class Boleta {
    private long numeroBoleta;
    private int totalCompra;

    public Boleta(long numeroBoleta, int totalCompra) {
        this.numeroBoleta = numeroBoleta;
        this.totalCompra = totalCompra;
    }

    public Boleta() {
    }
    
    public int calcularCuenta(){
        return this.totalCompra;
    }

    public long getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(long numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public int getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(int totalCompra) {
        this.totalCompra = totalCompra;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.oscarcujcuj.bean;

/**
 *
 * @author Oscar Ivan Cujcuj Lopez
 * @date 14/04/2021
 * @time 12:33:18 AM
 * codigo tencnico IN5BV
 */ 
public class Multiplicacion {
    private double num5;
    private double num6;
    private double resultado;
    
    public Multiplicacion(){
    
    }

    public Multiplicacion(double num5, double num6, double resultado) {
        this.num5 = 0.0;
        this.num6 = 0.0;
        this.resultado = 0.0;
    }

    public double getNum5() {
        return num5;
    }

    public void setNum5(double num5) {
        this.num5 = num5;
    }

    public double getNum6() {
        return num6;
    }

    public void setNum6(double num6) {
        this.num6 = num6;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    
    
    public double calcularMultiplicacion(){
        resultado = num5*num6;
        return resultado;
    }
    
    
}

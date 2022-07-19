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
 * @time 11:13:57 AM
 * codigo tencnico IN5BV
 */ 
public class Divicion {
    private double num7;
    private double num8;
    private double resultado; 

    public Divicion() {
    }

    public Divicion(double num7, double num8, double Resultado) {
        this.num7 = 0.0;
        this.num8 = 0.0;
        this.resultado = 0.0;
    }

    public double getNum7() {
        return num7;
    }

    public void setNum7(double num7) {
        this.num7 = num7;
    }

    public double getNum8() {
        return num8;
    }

    public void setNum8(double num8) {
        this.num8 = num8;
    }

    public double getresultado() {
        return resultado;
    }

    public void setResultado(double Resultado) {
        this.resultado = Resultado;
    }
    
    public double calcularDivicion(){
        resultado = num7/num8;
        return resultado;
    }
    
    
    
    
    
}

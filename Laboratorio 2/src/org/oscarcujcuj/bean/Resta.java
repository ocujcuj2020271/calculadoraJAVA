/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.oscarcujcuj.bean;

/**
 *
 * @author Oscar Ivan Cujcuj Lopez
 * @date 13/04/2021
 * @time 02:32:54 PM
 * codigo tencnico IN5BV
 */ 
public class Resta {
    private double num3;
    private double num4;
    private double resultado;

    public Resta() {
    }

    public Resta(double num3, double num4, double resultado) {
        this.num3 = 0.0;
        this.num4 = 0.0;
        this.resultado = 0.0;
    }

    public double getNum3() {
        return num3;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum4() {
        return num4;
    }

    public void setNum4(double num4) {
        this.num4 = num4;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double cualculaResta(){
        resultado = num3 - num4;
        return resultado;
    }
 

}

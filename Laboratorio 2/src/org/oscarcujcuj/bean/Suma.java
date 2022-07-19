/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.oscarcujcuj.bean;


/**
 *
 * @author Oscar Ivan Cujcuj Lopez
 * @date 9/04/2021
 * @time 08:55:00 PM
 * codigo tencnico IN5BV
 */ 
public class Suma {
    //Atributos 
        private double num1;
        private double num2;
        private double resultado;


    public Suma() {
        
    }

    public Suma(double num1, double num2, double resultado) {
        num1 = 0.0;
        num2 = 0.0;
        resultado = 0.0;
    }
    
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public double  calcularResultado (){
     resultado = num1 + num2;
     return resultado; 
    }    
}

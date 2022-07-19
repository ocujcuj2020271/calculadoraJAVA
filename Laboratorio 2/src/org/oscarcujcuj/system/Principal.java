/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.oscarcujcuj.system;
import javax.swing.JOptionPane;
import org.oscarcujcuj.bean.Suma;
import org.oscarcujcuj.bean.Resta;
import org.oscarcujcuj.bean.Multiplicacion;
import org.oscarcujcuj.bean.Divicion;
import org.oscarcujcuj.bean.Salir;

/**
 *
 * @author Oscar Ivan Cujcuj Lopez
 * @date 9/04/2021
 * @time 08:51:35 PM
 * codigo tencnico IN5BV
 */ 
public class Principal {
    public static void main(String[] args) {
        
        byte opcion = 0;
        
        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
            "MENU\n"
            +"1. SUMA\n"
            +"2. Resta\n"
            +"3. Multiplicacion\n"
            +"4. Divicion\n"
            +"5. salir \n"
            +"Elija una opcion:"
            ));
            switch (opcion) {
                case 1:

                  Suma suma = new Suma();
                    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero uno: "));
                    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el numero dos: "));
       
                    suma.setNum1(num1);
                    suma.setNum2(num2);
                    suma.calcularResultado();
       
       
                    JOptionPane.showMessageDialog(null, "la suma es: " + suma.getResultado());
          
                    break;
                case 2: 
                    Resta resta = new Resta();
                    double num3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    double num4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    
                    resta.setNum3(num3);
                    resta.setNum4(num4);
                    resta.cualculaResta();
                    
                    JOptionPane.showMessageDialog(null, "la resta es: " + resta.getResultado());
       
                    
                    break;
                case 3:
                   
                    Multiplicacion multiplicacion = new Multiplicacion();
                    double num5 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    double num6 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    
                    multiplicacion.setNum5(num5);
                    multiplicacion.setNum6(num6);
                    multiplicacion.calcularMultiplicacion();
                    
                    
                    JOptionPane.showMessageDialog(null, "la resta es: " + multiplicacion.getResultado());
       
                    break;
                    
                case 4:
                    
                    Divicion divicion = new Divicion();
                    double num7 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    double num8 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    
                    divicion.setNum7(num7);
                    divicion.setNum8(num8);
                    divicion.calcularDivicion();
                    
                    JOptionPane.showMessageDialog(null, "la resta es: " + divicion.getresultado());
                    break;
                case 5:
                    
                    Salir s = new Salir();
                    s.salir();
                    
                default:
                    JOptionPane.showMessageDialog(null,"No existe ninguna opcion");
                    break;
            }
        }
        while(opcion!= 5);
        System.exit(0);
      
    
        }
    }

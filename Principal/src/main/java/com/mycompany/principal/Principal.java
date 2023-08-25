/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB09
 */
public class Principal {

    public static void main(String[] args) {
     calculadora c1 = new calculadora();
      calculadora c2 = new calculadora();
     
     
     c1.num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")) ;
     c2.num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero")) ;
     
     
     
     c1.ingrsarDatos();
     c1.sumar();
     c2.restar();
    }
}

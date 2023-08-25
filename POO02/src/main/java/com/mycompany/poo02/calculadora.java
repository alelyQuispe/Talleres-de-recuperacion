/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo02;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB09
 */
public class calculadora {
    //Atributos

    int num1;
    int num2;
    int suma, res, mul, div;
    //Metodos

    public void dividir() {

        mul = num1 / num2;
        System.out.println("La dividir es " + div);

    }

    public void multiplicacion() {

        mul = num1 * num2;
        System.out.println("La multiplicacion es " + mul);

    }

    public void restar() {

        res = num1 - num2;
        System.out.println("La restar es " + res);

    }

    public void sumar() {

        suma = num1 + num2;
        System.out.println("La suma es " + suma);

    }

    public void ingresarDatos() {

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));

    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "la suma es" + suma);
        JOptionPane.showMessageDialog(null, "la restar es" + res);
        JOptionPane.showMessageDialog(null, "la multiplicar es" + mul);
        JOptionPane.showMessageDialog(null, "la dividir es" + div);

    }
}

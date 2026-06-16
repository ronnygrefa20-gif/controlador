/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.example.mvc.Model.Acceso;

import ec.edu.espoch.example.mvc.Model.Calculadora;
import ec.edu.espoch.example.mvc.Model.interfaces.InterCalculadora;

/**
 *
 * @author Ronny G
 */
public class Calculadoras implements InterCalculadora {
    public double sumar (Calculadora calculadora){
        return calculadora.getN1()+ calculadora.getN2();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.example.mvc.controller;



import ec.edu.espoch.example.mvc.Model.Acceso.Calculadoras;
import ec.edu.espoch.example.mvc.Model.Calculadora;
import ec.edu.espoch.example.mvc.Model.interfaces.InterCalculadora;
import ec.edu.espoch.example.mvc.View.View;


public class ControllerCalculadora {
  

    private Calculadora calculadora;
    private View view;

    public ControllerCalculadora(View view) {
        calculadora = new Calculadora();
        this.view = view;
    }

    InterCalculadora metodosCalcu = new Calculadoras();
    
    public void controller() {
        try {
            double n1 = Double.parseDouble(view.getN1());
            double n2 = Double.parseDouble(view.getN2());
            calculadora.setN1(n1);
            calculadora.setN2(n2);
            
            double resultado=metodosCalcu.sumar(calculadora);
            view.mostrar(resultado);
            
        } catch (Exception e) {
            view.mostrarerror();
        }

    }

}


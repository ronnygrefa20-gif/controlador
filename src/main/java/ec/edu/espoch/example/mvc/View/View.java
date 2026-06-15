/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.example.mvc.View;

import ec.edu.espoch.example.mvc.controller.ControllerCalculadora;

/**
 *
 * @author Ronny G
 */
public class View {
    private ControllerCalculadora controlador;
    private String n1;
    private String n2;

    public View() {
        controlador = new ControllerCalculadora(this);

    }

    public String getN1() {
        return n1;
    }

    public void setN1(String n1) {
        this.n1 = n1;
    }

   public void mostrar (double resultado ){
       System.out.println("resultado es: "+ resultado);
   }
   
   public void boton(){
       controlador.controller();
   }
   public void mostrarerror(){
       System.out.println("Eror, datos incorectos ");
   }

    public String getN2() {
        return n2;
    }

    public void setN2(String n2) {
        this.n2 = n2;
    }
   
}


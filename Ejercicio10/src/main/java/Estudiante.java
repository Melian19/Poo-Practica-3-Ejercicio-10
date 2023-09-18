/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author melian
 */
public class Estudiante {
    String nombre, numero;
    double patrimonio,estrato;
    double pagoMatricula = 50000;    
    
    public Estudiante(String nombre, String numero, double patrimonio, double estrato){
        this.nombre = nombre;
        this.estrato = estrato;
        this.numero = numero;
        this.patrimonio = patrimonio;
    }
    
    public double calcularMatricula(){
        if ((patrimonio > 2000000) &&(estrato > 3)){
            pagoMatricula = pagoMatricula + (0.003 * patrimonio);
        }
        return pagoMatricula;
    }
}

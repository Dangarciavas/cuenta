/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.encapsulamiento.vista;

import edu.unal.poo.encapsulamiento.modelo.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Principal {
    public static void main(String[] args) {
        Scanner lectura= new Scanner(System.in);
        System.out.println("Creacion de cuentas");
        
        System.out.println("Ingrese numero");
        int numero= lectura.nextInt();
        
        System.out.println("Ingrese clave");
        int clave=lectura.nextInt();
        
        System.out.println("Ingrese el duenno");
        String duenno = lectura.next();
        
        System.out.println("Ingrese Saldo");
        double saldo = lectura.nextDouble();
    
        Cuenta cuenta1 = new Cuenta(numero, clave, duenno, saldo);
        System.out.println("Valor a consignar");
        double valor  = lectura.nextDouble();
        boolean resultado = cuenta1.consignar(valor);
        if(resultado == true){
            System.out.println("Consinacion exitosa");
            System.out.println("Nuevo saldo " + cuenta1.getSaldo());
        }
        else
            System.out.println("Consignacion fallida");
    }
}

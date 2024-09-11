package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

         Scanner scanner = new Scanner(System.in);

    
    

         System.out.print("Ingrese la cantidad total de la compra (en pesos): ");
         double cantidadCompra = scanner.nextDouble();
 
    
         scanner.close();
 
         
         int puntosAcumulados = (int) (cantidadCompra / 10);
 
         
         System.out.println("Puntos acumulados: " + puntosAcumulados);
 
         
         String nivelFidelizacion;
         if (puntosAcumulados >= 0 && puntosAcumulados <= 100) {
             nivelFidelizacion = "Bronce";
         } else if (puntosAcumulados >= 101 && puntosAcumulados <= 500) {
             nivelFidelizacion = "Plata";
         } else if (puntosAcumulados >= 501 && puntosAcumulados <= 1000) {
             nivelFidelizacion = "Oro";
         } else {
             nivelFidelizacion = "Platino";
         }
 
         
         System.out.println("Nivel de fidelización: " + nivelFidelizacion);
 
         
         double descuento = 0.0;
         String regalo = "";
 
         if (nivelFidelizacion.equals("Oro") || nivelFidelizacion.equals("Platino")) {
             descuento = cantidadCompra * 0.10;
             System.out.println("Felicidades, has recibido un descuento del 10%: $" + descuento);
         }
 
         if (nivelFidelizacion.equals("Platino")) {
             regalo = "Cupón para un producto gratis";
             System.out.println("Felicidades, has recibido un regalo especial: " + regalo);
         }
 
        
         double totalConDescuento = cantidadCompra - descuento;
         System.out.println("Total a pagar después del descuento: $" + totalConDescuento);
     }
 }

    

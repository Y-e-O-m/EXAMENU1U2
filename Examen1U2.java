/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen.pkg1.u.pkg2;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Examen1U2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double videojuego1 =  353.65;
        double videojuego2 = 803.50;
        double videojuego3 = 747.00;
        
       Scanner lectura = new Scanner(System.in);
       
       System.out.println("Nombre del videojuego1");
       String nombre1 = lectura.nextLine();
       System.out.println("Nombre del videojuego2");
       String nombre2 = lectura.nextLine();
       System.out.println("Nombre del videojuego3");
       String nombre3 = lectura.nextLine();
       
       System.out.println("Precio del videojuego1");
       double precio1 = lectura.nextDouble();
       System.out.println("Precio del videojuego2");
       double precio2 = lectura.nextDouble();
       System.out.println("Precio del videojuego3");
       double precio3 = lectura.nextDouble();
       
       double descuento1 = videojuego1 * 30;
       double descuento2 = videojuego2 * 65;
       double descuento3 = videojuego3 * 15;
       
       double total1 = descuento1 / 100;
       double total2= descuento2 / 100;
       double total3 = descuento3 / 100;
       
       System.out.println("El precio final del videojuego1 es:" + total1);
       System.out.println("El precio final del videojuego2 es: " + total2);
       System.out.println("El precio final del videojuego3 es: "+ total3);
    }
    
}

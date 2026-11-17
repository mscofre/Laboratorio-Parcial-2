/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioProfesores_Interfaces;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        
        System.out.println("==== INGRESO DE DATOS ====");
        System.out.print("Ingrese su cedula: ");
        int cedula = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su direccion: ");
        String direccion = sc.nextLine();
        System.out.print("Ingrese su IDBanner: ");
        String IDBanner = sc.nextLine();
        System.out.print("Ingrese su deartamento: ");
        String departamento = sc.nextLine();
        System.out.print("Ingrese su dedicacion: ");
        String dedicacion = sc.nextLine();
        System.out.print("Ingrese su sueldo: ");
        Double sueldo = sc.nextDouble();
        sc.nextLine();
        ProfesorTC profesor = new ProfesorTC(IDBanner, departamento, dedicacion, sueldo, edad, cedula, nombre, direccion);
        profesor.mostrarDatos();
        profesor.comer();
        profesor.respirar();
        profesor.enseniar();
        profesor.prepararClase();
        
        
        sc.close();
    }
    
}

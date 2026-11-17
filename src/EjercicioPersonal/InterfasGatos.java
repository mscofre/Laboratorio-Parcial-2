/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioPersonal;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class InterfasGatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==== Ingreso de Datos ====");
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la raza: ");
        String raza = sc.nextLine();
        System.out.print("Ingrese el color: ");
        String color = sc.nextLine();
        System.out.print("Ingrese el tamanio ");
        String tamanio = sc.nextLine();
        System.out.print("Ingrese el tipo: ");
        String tipo = sc.nextLine();
        TipoGato gato = new TipoGato(tamanio, tipo, edad, raza, nombre, color);
        gato.mostrarDatos();
        gato.dormir();
        gato.caminar();
        gato.comer();
        gato.beberAgua();
        gato.comer();
        gato.trepar();
        sc.close();
    }
    
}

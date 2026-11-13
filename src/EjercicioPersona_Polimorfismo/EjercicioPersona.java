/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioPersona_Polimorfismo;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();
        Estudiante estudiante = new Estudiante();
        Profesor profesore = new Profesor();
        int op;
        int n;
        int posicion;
        
        do {
            System.out.println("==== MENU ESPE ===");
            System.out.println("1.- Ingresar datos - Estudiantes");
            System.out.println("2.- Ingresar datos - Profesor");
            System.out.println("3.- Mostrar Datos - Estudiante");
            System.out.println("4.- Mostrar Datos - Profesor");
            System.out.println("5.- Eliminar Registro Estudiante");
            System.out.println("6.- Eliminar Registro Profesor");
            System.out.println("7.- Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    System.out.print("Cuantos Estudiantes desea Ingresar: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("==== REGISTRO DE ESTUDIANTE ====");
                        System.out.print("Ingrese la Cedula: ");
                        int cedula = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la Direccion: ");
                        String direccion = sc.nextLine();
                        System.out.print("Ingrese el idBanner: ");
                        String idBanner = sc.nextLine();
                        System.out.print("Ingrese el Semestre: ");
                        String semestre = sc.nextLine();
                        System.out.print("Ingrese el Paralelo: ");
                        String paralelo = sc.nextLine();
                        System.out.print("Ingrese la Matricula: ");
                        int matricula = sc.nextInt();
                        sc.nextLine();
                        estudiantes.add(new Estudiante(idBanner, semestre, paralelo, matricula, cedula, edad, nombre, direccion));
                    }
                   
                    break;
                    
                case 2:
                    System.out.print("Cuantos Profesores desea Ingresar: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("==== REGISTRO DE PROFESORES ====");
                        System.out.print("Ingrese la Cedula: ");
                        int cedula = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese el Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese Edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese la Direccion: ");
                        String direccion = sc.nextLine();
                        System.out.print("Ingrese el idBanner: ");
                        String idBanner = sc.nextLine();
                        System.out.print("Ingrese el Departamento: ");
                        String departamento = sc.nextLine();
                        System.out.print("Ingrese la Dedicacion: ");
                        String dedicacion = sc.nextLine();
                        profesores.add(new Profesor(idBanner, departamento, dedicacion, cedula, edad, nombre, direccion));
                    }
                    break;
                    
                case 3: 
                        for (int i = 0; i < estudiantes.size(); i++) {
                            estudiantes.get(i).mostrarDatos();
                        }
                    break;
                    
                case 4: 
                        for (int i = 0; i < profesores.size(); i++) {
                            profesores.get(i).mostrarDatos();
                        }
                    break;
                    
                case 5:
                    System.out.print("Ingrese el # de regitro que quiere Elimianr: ");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    estudiantes.remove(posicion);
                    break;
                case 6:
                    System.out.print("Ingrese el # de regitro que quiere Elimianr: ");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    profesores.remove(posicion);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Ingrese una opcion Valida");
                   
            }
        } while (op != 7);
    }
    
}

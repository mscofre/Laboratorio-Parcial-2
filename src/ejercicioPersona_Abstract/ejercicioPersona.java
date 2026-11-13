/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioPersona;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Usuario
 */
public class ejercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op, n;
        int posicion;

        ArrayList<Estudiante> estudaintes = new ArrayList<>();
        ArrayList<Profesor> profesores = new ArrayList<>();


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
                    System.out.print("Cunatos estudiantes desea ingresar: ");
                    n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {
                        System.out.println("==Ingreso de datos estudainte ==");
                        System.out.print("Ingrese cedula: ");
                        int cedula = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese edad: ");
                        int edad = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese direccion: ");
                        int direccion = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingrese idBanner: ");
                        String idBanner = sc.nextLine();
                        System.out.print("Ingrese nMatricula: ");
                        int nmatricula = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Ingres semestre: ");
                        String semestre = sc.nextLine();
                        System.out.print("Ingrese Paralelo: ");
                        String paralelo = sc.nextLine();
                        estudaintes.add(new Estudiante(idBanner, semestre, paralelo, nmatricula, cedula, edad, nombre, paralelo));

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
                        for (int i = 0; i < estudaintes.size(); i++) {
                        estudaintes.get(i).mostrarDatos();
                        }
                    break;
                    
                case 4: 
                        for (int i = 0; i < profesores.size(); i++) {
                        profesores.get(i).mostrarDatos();
                        }
                    break;
                    
                case 5:
                    System.out.print("Ingrese el # de registro que quiere Eliminar: ");
                    posicion = sc.nextInt();
                    sc.nextLine();
                    estudaintes.remove(posicion);
                    break;
                case 6:
                    System.out.print("Ingrese el # de registro que quiere Eliminar: ");
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
        sc.close();
        
    }
    
}

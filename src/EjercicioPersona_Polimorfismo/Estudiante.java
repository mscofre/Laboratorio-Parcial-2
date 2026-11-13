/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPersona_Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    
    private String idBanner, semestre, paralelo;
    private int matricula;
    
    //Constructor

    public Estudiante(String idBanner, String semestre, String paralelo, int matricula, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.semestre = semestre;
        this.paralelo = paralelo;
        this.matricula = matricula;
    }
    

    public Estudiante() {
    }
    
    //Metodos

    @Override
    public void mostrarDatos() {
        System.out.println("==== DATOS DEL ESTUDIANTE ====");
        super.mostrarDatos();
        System.out.println("idBanner: "+idBanner);
        System.out.println("Semestre: "+semestre);
        System.out.println("Paralelo: "+paralelo);
        System.out.println("Matricula: "+matricula);
    }
    
}

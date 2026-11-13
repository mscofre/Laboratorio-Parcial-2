/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPersona;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    private String idBanner, semestre, paralelo;
    private int nmatricula;

    public Estudiante(String idBanner, String semestre, String paralelo, int nmatricula, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.semestre = semestre;
        this.paralelo = paralelo;
        this.nmatricula = nmatricula;
    }

    public Estudiante(int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
    }

    
    
    
    @Override
    protected void mostrarDatos() {
        System.out.println("==== DATOS DE ESTUDAINTE ====");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedual: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        System.out.println("idBanner: "+idBanner);
        System.out.println("Semestre: "+semestre);
        System.out.println("Paralelo: "+paralelo);
        System.out.println("nMatricula: "+nmatricula);
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPersona;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    private String idBanner, departamento, dedicacion;

    //Constructor
    
    public Profesor(String idBanner, String departamento, String dedicacion, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.departamento = departamento;
        this.dedicacion = dedicacion;
    }

    public Profesor(int cedula, int edad, String nombre, String direccion) {
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
        System.out.println("Departamento: "+departamento);
        System.out.println("Dedicacion: "+dedicacion);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPersona_Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Persona {
    private int cedula, edad;
    private String nombre, direccion;

    public Persona(int cedula, int edad, String nombre, String direccion) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public Persona() {
    }
    
    //Metodos
    
    public void mostrarDatos(){
    
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioProfesores_Interfaces;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected int edad, cedula;
    protected String nombre, direccion;
    

    //Constructor

    public Persona(int edad, int cedula, String nombre, String direccion) {
        this.edad = edad;
        this.cedula = cedula;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona() {
    }

    //Metodos
    public abstract void comer ();
    public abstract void respirar ();
    public void mostrarDatos() {
        System.out.println("Cedula: "+cedula);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
    }
    
}

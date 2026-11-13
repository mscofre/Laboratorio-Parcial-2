/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioPersona;

/**
 *
 * @author Usuario
 */
public abstract class Persona {
    protected int cedula, edad;
    protected String nombre, direccion;
    //Constructor

    public Persona(int cedula, int edad, String nombre, String direccion) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }    
    //Metodos
    
    protected abstract void mostrarDatos();
}

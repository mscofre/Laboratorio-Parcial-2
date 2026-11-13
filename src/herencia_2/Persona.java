/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;

/**
 *
 * @author Usuario
 */
public class Persona {
    //Atributos
    private int cedula, edad;
    private String nombre, direccion;
    
    //CONSTRUCOR

    public Persona(int cedula, int edad, String nombre, String direccion) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona() {
    }

    
    //GETTER AND SETTER

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    //METODOS
    
    public void mostrarPersona (){
        System.out.println("Nombre: "+nombre);
        System.out.println("Cedula: "+cedula);
        System.out.println("Edad: "+edad);
        System.out.println("Direccion: "+direccion);
        
    }    
}

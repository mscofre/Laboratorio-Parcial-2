/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPersonal;

/**
 *
 * @author Usuario
 */
public abstract class Animal {
    protected int edad;
    protected String raza, nombre, color;
    
    //Constructor

    public Animal(int edad, String raza, String nombre, String color) {
        this.edad = edad;
        this.raza = raza;
        this.nombre = nombre;
        this.color = color;
    }

    public Animal() {
    }
    
    //Metodos
    public abstract void respirar();
    public abstract void comer();
    public abstract void beberAgua();
    public void mostrarDatos(){
        System.out.println("Raza: "+raza);
        System.out.println("Nombre: "+nombre);
        System.out.println("Color: "+color);
        System.out.println("Edad: "+edad);
    }
    
}

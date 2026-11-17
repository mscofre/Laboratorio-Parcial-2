/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPersonal;

/**
 *
 * @author Usuario
 */
public class TipoGato extends Animal implements Gato{
    private String tamanio, tipo;
    
    //Constructor

    public TipoGato(String tamanio, String tipo, int edad, String raza, String nombre, String color) {
        super(edad, raza, nombre, color);
        this.tamanio = tamanio;
        this.tipo = tipo;
    }

    public TipoGato() {
    }

    @Override
    public void respirar() {
        System.out.println("El gato esta respirando");
    }

    @Override
    public void comer() {
        System.out.println("El gato esta comiendo");
    }

    @Override
    public void beberAgua() {
        System.out.println("El gato esta bebiendo Agua");
    }

    @Override
    public void dormir() {
        System.out.println("El gato esta Durmiendo");
    }

    @Override
    public void caminar() {
        System.out.println("El gato esta caminando");
    }

    @Override
    public void trepar() {
        System.out.println("El gato esta trepando un Arbol");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("==== DATOS DEL GATO ====");
        super.mostrarDatos(); 
        System.out.println("Tamanio: "+tamanio);
        System.out.println("Tipo: "+tipo);
    }
    
    
    
}

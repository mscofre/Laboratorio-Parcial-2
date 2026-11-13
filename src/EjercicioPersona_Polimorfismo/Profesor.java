/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPersona_Polimorfismo;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
    
    private String idBanner, departamento, dedicacion;
    
    //Constructor

    public Profesor() {
    }

    public Profesor(String idBanner, String departamento, String dedicacion, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.departamento = departamento;
        this.dedicacion = dedicacion;
    }
    
    //Metodos

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println("=== DATOS DEL PROFESOR ===");
        System.out.println("IDBanner: "+idBanner);
        System.out.println("Departamento: "+departamento);
        System.out.println("Dedicacion: "+dedicacion);
    }
    
        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioProfesores_Interfaces;

/**
 *
 * @author Usuario
 */
public class ProfesorTC extends Persona implements IProfesor{
    
    private String IDBanner, departamento, dedicacion;
    private double sueldo;

    public ProfesorTC() {
    }

    public ProfesorTC(String IDBanner, String departamento, String dedicacion, double sueldo, int edad, int cedula, String nombre, String direccion) {
        super(edad, cedula, nombre, direccion);
        this.IDBanner = IDBanner;
        this.departamento = departamento;
        this.dedicacion = dedicacion;
        this.sueldo = sueldo;
    }
    

    @Override
    public void comer() {
        System.out.println("El profesor esta comeindo");
    }

    @Override
    public void respirar() {
        System.out.println("El profesor esta respirando");
    }

    @Override
    public void enseniar() {
        System.out.println("El profesor esta enseniando sobre interfaces");
    }

    @Override
    public void prepararClase() {
        System.out.println("El profesor esta preparando clases");
    }

    @Override
    public void mostrarDatos() {
        System.out.println("===== DATOS DEL PROFESOR ====");
        super.mostrarDatos();
        System.out.println("IDBanner "+IDBanner);
        System.out.println("Departamento: "+departamento);
        System.out.println("Dedicacion "+dedicacion);
        System.out.println("Sueldo "+sueldo);
    }
    
    
    
}

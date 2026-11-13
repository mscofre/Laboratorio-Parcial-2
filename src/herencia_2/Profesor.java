/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona{
//Atributos
    private String idBanner, departamento, dedicacion;
    
    //Constructor

    public Profesor(String idBanner, String departamento, String dedicacion, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.departamento = departamento;
        this.dedicacion = dedicacion;
    }

    public Profesor() {
    }
    
    //Getter and Setter

    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDedicacion() {
        return dedicacion;
    }

    public void setDedicacion(String dedicacion) {
        this.dedicacion = dedicacion;
    }
    
    //Metodos
    
    public void mostrarProfesor (){
        System.out.println("=== DATOS DEL PROFESOR ===");
        super.mostrarPersona();
        System.out.println("IDBanner: "+idBanner);
        System.out.println("Departamento: "+departamento);
        System.out.println("Dedicacion: "+dedicacion);
    }
    
}

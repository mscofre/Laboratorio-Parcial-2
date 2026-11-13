/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_2;

/**
 *
 * @author Usuario
 */
public class Estudiante extends Persona{
    private String idBanner, semestre, paralelo;
    private int matricula;

    //CONTRUCTOR
    
    public Estudiante(String idBanner, String semestre, String paralelo, int matricula, int cedula, int edad, String nombre, String direccion) {
        super(cedula, edad, nombre, direccion);
        this.idBanner = idBanner;
        this.semestre = semestre;
        this.paralelo = paralelo;
        this.matricula = matricula;
    }
    
    public Estudiante() {
    }
    //GETTER AND SETTER


    public String getIdBanner() {
        return idBanner;
    }

    public void setIdBanner(String idBanner) {
        this.idBanner = idBanner;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    //Metodo
    
    public void mostrarEstudiante(){
        System.out.println("==== DATOS DEL ESTUDIANTE ===");
        super.mostrarPersona();
        System.out.println("IDBanner: "+idBanner);
        System.out.println("Matricula: "+matricula);        
        System.out.println("Semestre: "+semestre);
        System.out.println("Paralelo: "+paralelo);

    }
    
}

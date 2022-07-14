/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prePrueba3;

/**
 *
 * @author Usuario
 */
public class Alumno {
    //atributos
    int id;
    String nombre;
    String rut;
    String curso;
    String activo;
    
    //Constructor
    public Alumno(int id, String nombre, String rut, String curso, String activo) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.curso = curso;
        this.activo = activo;
    }
    
    //métodos (mostrar datos)
    public void mostrarDatos(){
        System.out.println("id: " + this.id);
        System.out.println("nombre: " + this.nombre);
        System.out.println("rut: " + this.rut);
        System.out.println("curso: " + this.curso);
        System.out.println("activo: " + this.activo);
    }
    
    //getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pojos;

/**
 * @version 1.0
 * @author ruth
 */
public class Alumno {
    
    String nombre;
    String apellidos;
    String contacto;

    public Alumno(String nombre, String apellidos, String contacto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contacto = contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", contacto=" + contacto + '}';
    }
    
    


    
    
    
    
    
  
    
    
}

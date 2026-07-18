/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fdura
 */
public class Empleado extends Persona implements Registrable {
    
    private int sueldo;

    public Empleado(int sueldo, String nombre, Rut rut, String correo, Direccion direccion) {
        super(nombre, rut, correo, direccion);
        this.sueldo = sueldo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return super.toString() + " | Sueldo: " + sueldo;
    }
    
    @Override
    public void registrar() {
        System.out.println("Empleado registrado correctamente.");
    }
    
    @Override
    public void mostrarDatos() {
        System.out.println(this);
    }
    
}

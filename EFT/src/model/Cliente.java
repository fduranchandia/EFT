/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Cliente extends Persona implements Registrable {
    
    private String categoria;

    public Cliente(String categoria, String nombre, Rut rut, String correo, Direccion direccion) {
        super(nombre, rut, correo, direccion);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
        return super.toString() + " | Categoria Cliente: " + categoria;
    }
    
    @Override
    public void registrar() {
        System.out.println("Cliente registrado correctamente.");
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(this);
    }
    
}

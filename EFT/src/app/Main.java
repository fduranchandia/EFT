/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import model.Persona;
import model.Direccion;
import model.Rut;
import utils.RutInvalidoException;
import model.Cliente;
import model.Empleado;
import data.GestorDatos;
/**
 *
 * @author fdura
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        
        gestor.cargarPersonas("personas.txt");
        
        System.out.println("===EMPLEADOS====");
        gestor.mostrarEmpleados();
        System.out.println("===CLIENTES====");
        gestor.mostrarClientes();
          
        
    }
    
}

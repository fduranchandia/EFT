/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

import model.Cliente;
import model.Empleado;
import model.Persona;
import model.Direccion;
import model.Rut;
 
/**
 *
 * @author fdura
 */
public class GestorDatos {
    
    private ArrayList<Persona> personas;
    
    public GestorDatos() {
        
       
        personas = new ArrayList<>();
    }   
    
    
    public void mostrarPersonas() {
        if (personas.isEmpty()) {
            System.out.println("No existen personas registradas");
            return;
                   
        }
        
        for (Persona persona : personas) {
            System.out.println(persona);
        }
        
    }
    
    
    public void mostrarEmpleados() {
        
        for (Persona persona : personas) {
            if (persona instanceof Empleado) {
                System.out.println(persona);
            }
        }
        
    }
    
    public void mostrarClientes() {
        
        for (Persona persona : personas) {
            if (persona instanceof Cliente) {
                System.out.println(persona);
            }
        }
        
    }
    
    public void cargarPersonas(String nombreTxt) {
        try (BufferedReader texto = new BufferedReader(new FileReader(nombreTxt))){
            
            String linea;
            while((linea = texto.readLine()) != null ) {
                
                String[] datos = linea.split(";");
                String tipo = datos[0];
                String nombre = datos[1];
                String rutTexto = datos[2];
                String correo = datos[3];
                
                Direccion direccion = new Direccion(datos[5], datos[6], datos[7], Integer.parseInt(datos[8]));
                
                Rut rut = new Rut(rutTexto);
                
                if (tipo.equalsIgnoreCase("CLIENTE")) {
                    String categoria = datos[4];
                    Cliente cliente = new Cliente(categoria, nombre, rut, correo, direccion);
                    personas.add(cliente);
                    
                    
                } else if (tipo.equalsIgnoreCase("EMPLEADO")) {
                    int sueldo = Integer.parseInt(datos[4]);
                    
                    Empleado empleado = new Empleado(sueldo, nombre, rut, correo, direccion);
                    
                    personas.add(empleado);
                    
                }
                
            }
                  
        } catch(Exception e){
            System.out.println("Error al cargar el archivo: " + e.getMessage());
            
        }
        
    }
    
    
}

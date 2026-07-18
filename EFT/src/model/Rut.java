/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import utils.RutInvalidoException;
        

/**
 *
 * @author fdura
 */
public class Rut {
    
    private String numero;
    
    public Rut(String numero) throws RutInvalidoException {
        
        String rutLimpio = numero.replace(".", "").trim().toUpperCase();
        
        if (!validarFormato(rutLimpio)) {
            
            throw new RutInvalidoException("El Rut Ingresado no tiene formato valido.");
        }
        this.numero = rutLimpio;
        
    }
    
    private boolean validarFormato(String rut) {
        
        return rut.matches("[0-9]{7,8}-[0-9K]");
    }
    
    public String getNumero() {
        return numero;
    }
    
    @Override
    public String toString() {
        return numero;
    }
    
}

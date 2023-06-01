/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author yair
 */
package Empleado;

/**
 *
 * @author 52744
 */
public class Empleado extends Persona.Persona
{
    private int idempleado;

    public Empleado(int idempleado, String nombre, String materno, String paterno, int edad, float estatura, float peso) {
        super(nombre, materno, paterno, edad, estatura, peso);
        this.idempleado = idempleado;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }
    
    public String imprimirDatos(){
        String nombre = null;
        return " datos desde la clase empleado: " + idempleado +" " + nombre ;
    }
    
    
}


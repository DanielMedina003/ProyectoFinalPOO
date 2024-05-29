
package com.mycompany.proyectofinalpoo;

public class Computador {
    
    private String Marca;
    private String Modelo;
    private double Precio;

    
    //Constructor de tres parametros 
    public Computador(String Marca, String Modelo, double Precio){
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Precio = Precio;
        
    }
    
    //
    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public double getPrecio() {
        return Precio;
    }
    
    @Override
    public String toString() {
        return "Marca: " + Marca + ", Modelo: " + Modelo + ", Precio: $" + Precio;
    }
    
}

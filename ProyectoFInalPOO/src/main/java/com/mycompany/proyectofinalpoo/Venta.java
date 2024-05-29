
package com.mycompany.proyectofinalpoo;

import java.util.ArrayList;
import java.util.List;

public class Venta {
   
    private List<Computador> computadoresVendidos;

    public Venta() {
        this.computadoresVendidos = new ArrayList<>();
    }

    public void agregarComputador(Computador computador) {
        computadoresVendidos.add(computador);
    }

    public List<Computador> getComputadoresVendidos() {
        return computadoresVendidos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Computador c : computadoresVendidos) {
            total += c.getPrecio();
        }
        return total;
    }
}

   

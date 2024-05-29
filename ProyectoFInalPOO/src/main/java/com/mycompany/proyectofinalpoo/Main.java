
package com.mycompany.proyectofinalpoo;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {
        
         JFrame frame = new JFrame("Venta de Computadores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        
        Venta venta = new Venta();
        
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        
        JLabel marcaLabel = new JLabel("Marca:");
        JTextField marcaField = new JTextField();
        JLabel modeloLabel = new JLabel("Modelo:");
        JTextField modeloField = new JTextField();
        JLabel precioLabel = new JLabel("Precio:");
        JTextField precioField = new JTextField();
        
        JButton agregarButton = new JButton("Agregar Computador");
        agregarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String marca = marcaField.getText();
                String modelo = modeloField.getText();
                double precio = Double.parseDouble(precioField.getText());
                Computador computador = new Computador(marca, modelo, precio);
                venta.agregarComputador(computador);
                
                textArea.append(computador.toString() + "\n");
                
                marcaField.setText("");
                modeloField.setText("");
                precioField.setText("");
            }
        });
        
        JButton totalButton = new JButton("Calcular Total");
        totalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = venta.calcularTotal();
                JOptionPane.showMessageDialog(frame, "Total de la venta: $" + total);
            }
        });
        
        inputPanel.add(marcaLabel);
        inputPanel.add(marcaField);
        inputPanel.add(modeloLabel);
        inputPanel.add(modeloField);
        inputPanel.add(precioLabel);
        inputPanel.add(precioField);
        inputPanel.add(agregarButton);
        inputPanel.add(totalButton);
        
        panel.add(scrollPane, BorderLayout.CENTER);
        panel.add(inputPanel, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.setVisible(true);
    }
    
}

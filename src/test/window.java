package test;

import java.awt.*;
import javax.swing.*;

public class window extends JFrame {

    Expendedor exp;
    public JPanel panel;

    public window() {
        setSize(600, 600);//Establece tamanho de la ventana
        setTitle("Expendedor de Bebidas 3000");
        setLocationRelativeTo(null);//Establece posicion de la ventana
        IniciarVentana();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void IniciarVentana() {
        Paneles();
    }

    private void Paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        Buttons();
        Etiquetas();
    }

    private void Etiquetas() {
        exp = new Expendedor(6, 500, panel);
        JLabel expendedor = new JLabel();
        ImageIcon exp = new ImageIcon("exp1.png");
        expendedor.setBounds(60, -15, 600, 600);
        expendedor.setIcon(new ImageIcon(exp.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        panel.add(expendedor);
    }

    private void Buttons() {
        JButton boton1 = new JButton();
        JButton boton2 = new JButton();
        JButton boton3 = new JButton();

        boton1.setText("COKE");
        boton1.setBounds(340, 90, 75, 30);
        boton1.setEnabled(true);
        panel.add(boton1);
        boton2.setText("SPRITE");
        boton2.setBounds(340,180, 75, 30);
        boton2.setEnabled(true);
        panel.add(boton2);
        boton3.setText("FANTA");
        boton3.setBounds(340, 135, 75, 30);
        boton3.setEnabled(true);
        panel.add(boton3);
    }
}

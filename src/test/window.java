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
        exp = new Expendedor(6, 500, panel);
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
        //Buttons();
        Etiquetas();
    }

    private void Etiquetas() {
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

        boton1.setText("QUEEE");
        boton1.setBounds(100, 300, 100, 30);
        boton1.setEnabled(true);
        panel.add(boton1);
        boton2.setText("RIKAAAAAA");
        boton2.setBounds(250, 300, 100, 30);
        boton2.setEnabled(true);
        panel.add(boton2);
        boton3.setText("COLAAAAA");
        boton3.setBounds(400, 300, 100, 30);
        boton3.setEnabled(true);
        panel.add(boton3);
    }
}

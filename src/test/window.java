package test;

import java.awt.*;
import javax.swing.*;

public class window extends JFrame {

    public JPanel panel;
    Bebida bebida;
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
        Etiquetas();
        Buttons();
    }

    private void Paneles() {
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        Etiquetas();
        Buttons();
    }

    private void Etiquetas() {
        ImageIcon imagen1 = new ImageIcon("cocacola.png");
        JLabel cocacola = new JLabel();
        cocacola.setBounds(110, 100, 300, 300);
        cocacola.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(cocacola);
        
        ImageIcon imagen2 = new ImageIcon("Sprite.png");
        JLabel sprite = new JLabel();
        sprite.setBounds(260, 100, 300, 300);
        sprite.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(sprite);
        
        ImageIcon imagen3 = new ImageIcon("fanta.png");
        JLabel fanta = new JLabel();
        fanta.setBounds(410, 100, 300, 300);
        fanta.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH)));
        panel.add(fanta);
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

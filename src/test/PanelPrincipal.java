package test;

import java.awt.*;
import javax.swing.*;

public class PanelPrincipal extends JPanel {//se ve en el centro de la ventana 

    private Comprador com;
    private Expendedor exp;

    public PanelPrincipal() {
        Expendedor exp = new Expendedor(3, 500);
        Moneda m = new Moneda1500();
        Comprador cf = new Comprador(m, 1, exp);
        this.setBackground(Color.white);
    }
}
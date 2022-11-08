package test;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class window extends JFrame implements ActionListener {

    Expendedor exp;
    public JPanel panel;
    Expendedor exp_principal;
    Comprador cliente_principal;
    JLabel Bebida_selected;
    JButton boton1,boton2,boton3,boton4,boton5;
    int opcion;

    public window() {
        setSize(900, 700);//Establece tamanho de la ventana
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
        Bebida_selected=new JLabel();
        JLabel Output_b=new JLabel();
        JLabel Output_m=new JLabel();

        exp = new Expendedor(6, 500, panel);
        JLabel expendedor = new JLabel();
        ImageIcon exp = new ImageIcon("C:/Users/Gaspi/Desktop/Udec/thirdjobs(pruebas2)/JFrame/src/exp1.png");
        expendedor.setBounds(60, -15, 600, 600);
        expendedor.setIcon(new ImageIcon(exp.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        panel.add(expendedor);

        Bebida_selected.setBounds(620,30,240,40);
        Bebida_selected.setOpaque(true);
        Bebida_selected.setBackground(Color.white);
        Bebida_selected.setText(" BEBIDA SELECCIONADA:        ");
        panel.add(Bebida_selected);
        
    }

    private void Buttons() {
        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();
        boton4 = new JButton();
        boton5 = new JButton();

        boton1.setText("COKE");//boton seleccionar cocacola
        ImageIcon foto1 = new ImageIcon("C:/Users/Gaspi/Desktop/Udec/thirdjobs(pruebas2)/JFrame/src/cokeboton2.jpg");
        boton1.setBounds(340, 90, 75, 30);
        boton1.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(boton1.getWidth()+12, boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setEnabled(true);
        panel.add(boton1);

        boton2.setText("SPRITE");//boton seleccionar sprite
        ImageIcon foto2 = new ImageIcon("C:/Users/Gaspi/Desktop/Udec/thirdjobs(pruebas2)/JFrame/src/spriteboton.png");
        boton2.setBounds(340,180, 75, 30);
        boton2.setIcon(new ImageIcon(foto2.getImage().getScaledInstance(boton2.getWidth()+12, boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setEnabled(true);
        panel.add(boton2);

        boton3.setText("FANTA");//boton seleccionar fanta
        ImageIcon foto3 = new ImageIcon("C:/Users/Gaspi/Desktop/Udec/thirdjobs(pruebas2)/JFrame/src/fantaboton.jpg");
        boton3.setBounds(340, 135, 75, 30);
        boton3.setIcon(new ImageIcon(foto3.getImage().getScaledInstance(boton3.getWidth()+12, boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton3.setEnabled(true);
        panel.add(boton3);

        boton4.setText("PAGAR");
        boton4.setBounds(389, 290, 15, 45);
        boton4.setOpaque(false);
        boton4.setContentAreaFilled(false);
        boton4.setBorderPainted(true);
        boton4.setEnabled(true);
        panel.add(boton4);

        boton5.setText("Agarrar Vuelto");
        boton5.setBounds(373, 359, 35, 35);
        boton5.setEnabled(true);
        panel.add(boton5);
    }
    //CONTROL DE LOS BOTONES
    @Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==boton1) {
            Bebida_selected.setText(" BEBIDA SELECCIONADA: COCA-COLA");
            opcion=0;
        }
        if(e.getSource()==boton2){
            Bebida_selected.setText(" BEBIDA SELECCIONADA: FANTA");
            opcion=1;
            
        }
        if(e.getSource()==boton3){
            Bebida_selected.setText(" BEBIDA SELECCIONADA: SPRITE");
            opcion=2;

        }
        if(e.getSource()==boton5){
            System.out.println("Estamos trabajando para entregar vuelto, vuelva más tarde.");
        }
        if(e.getSource()==boton4){

            switch(opcion){
                case 0:
                    System.out.println("Recibiendo Coca");
                    try {
                        exp_principal.comprarBebida(opcion);
                    } catch (PagoIncorrectoException e2) {
                        // TODO Auto-generated catch block
                        e2.printStackTrace();
                    } catch (PagoInsuficienteException e2) {
                        // TODO Auto-generated catch block
                        e2.printStackTrace();
                    } catch (NoHayBebidaException e2) {
                        // TODO Auto-generated catch block
                        e2.printStackTrace();
                    }
                    break;

                case 1: 
                    System.out.println("Recibiendo Fanta");    
                    try {
                        exp_principal.comprarBebida(opcion);
                    } catch (PagoIncorrectoException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (PagoInsuficienteException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (NoHayBebidaException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    break;

                case 2: 
                    System.out.println("Recibiendo Sprite");
                    try {
                        exp_principal.comprarBebida(opcion);
                    } catch (PagoIncorrectoException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (PagoInsuficienteException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    } catch (NoHayBebidaException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }

                    break;

                default: 
                    System.out.println("Seleccione una bebida");
                    break;
            }
        
        }

    }
}

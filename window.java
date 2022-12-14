
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class window extends JFrame implements ActionListener {

    Expendedor exp;
    public JPanel panel;
    Expendedor exp_principal;
    Comprador cliente_principal;
    JLabel Bebida_selected;
    JButton boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8;
    Moneda moneda_seleccionada;
    BorradorBebidas r;
    Bebida x;
    Deposito Sprite = new Deposito();
    int opcion = 6;

    public window() {
        setSize(900, 700);//Establece tamanho de la ventana
        setTitle("Expendedor de Bebidas 3000");
        setLocationRelativeTo(null);//Establece posicion de la ventana
        IniciarVentana();
        exp_principal = new Expendedor(6, 800, panel);
        cliente_principal = new Comprador(new Moneda1500(), 1, exp_principal);
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
        Bebida_selected = new JLabel();
        JLabel Output_b = new JLabel();
        JLabel Output_m = new JLabel();
        //exp = new Expendedor(6, 500, panel);
        JLabel expendedor = new JLabel();
        ImageIcon exp = new ImageIcon("exp1.png");
        expendedor.setBounds(60, -15, 600, 600);
        expendedor.setIcon(new ImageIcon(exp.getImage().getScaledInstance(600, 600, Image.SCALE_SMOOTH)));
        //panel.add(expendedor);

        Bebida_selected.setBounds(620, 30, 240, 40);
        Bebida_selected.setOpaque(true);
        Bebida_selected.setBackground(Color.white);
        Bebida_selected.setText(" BEBIDA SELECCIONADA:");
        panel.add(Bebida_selected);
    }

    private void Buttons() {
        boton1 = new JButton();
        boton1.addActionListener(this);
        boton2 = new JButton();
        boton2.addActionListener(this);
        boton3 = new JButton();
        boton3.addActionListener(this);
        boton4 = new JButton();
        boton4.addActionListener(this);
        boton5 = new JButton();
        boton5.addActionListener(this);
        boton6 = new JButton();
        boton6.addActionListener(this);
        boton7 = new JButton();
        boton7.addActionListener(this);
        boton8 = new JButton();
        boton8.addActionListener(this);

        boton1.setText("COKE");//boton seleccionar cocacola
        ImageIcon foto1 = new ImageIcon("cokeboton2.jpg");
        boton1.setBounds(340, 90, 75, 30);
        boton1.setIcon(new ImageIcon(foto1.getImage().getScaledInstance(boton1.getWidth() + 12, boton1.getHeight(), Image.SCALE_SMOOTH)));
        boton1.setEnabled(true);

        boton2.setText("SPRITE");//boton seleccionar sprite
        ImageIcon foto2 = new ImageIcon("spriteboton.png");
        boton2.setBounds(340, 180, 75, 30);
        boton2.setIcon(new ImageIcon(foto2.getImage().getScaledInstance(boton2.getWidth() + 12, boton2.getHeight(), Image.SCALE_SMOOTH)));
        boton2.setEnabled(true);

        boton3.setText("FANTA");//boton seleccionar fanta
        ImageIcon foto3 = new ImageIcon("fantaboton.jpg");
        boton3.setBounds(340, 135, 75, 30);
        boton3.setIcon(new ImageIcon(foto3.getImage().getScaledInstance(boton3.getWidth() + 12, boton3.getHeight(), Image.SCALE_SMOOTH)));
        boton3.setEnabled(true);

        boton4.setText("PAGAR");
        boton4.setBounds(389, 290, 15, 45);
        boton4.setOpaque(false);
        boton4.setContentAreaFilled(false);
        boton4.setBorderPainted(true);
        boton4.setEnabled(true);

        boton5.setText("Agarrar Vuelto");
        boton5.setBounds(373, 359, 35, 35);
        boton5.setEnabled(true);

        boton6.setText("100");
        boton6.setBounds(373, 359, 35, 35);
        boton6.setEnabled(true);

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);

    }

    //CONTROL DE LOS BOTONES
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {

            Bebida_selected.setText(" BEBIDA SELECCIONADA: COCA-COLA");
            opcion = 1;
        }
        if (e.getSource() == boton3) {
            Bebida_selected.setText(" BEBIDA SELECCIONADA: FANTA");
            opcion = 3;
        }
        if (e.getSource() == boton2) {
            Bebida_selected.setText(" BEBIDA SELECCIONADA: SPRITE");
            opcion = 2;
        }
        if (e.getSource() == boton5) {
            System.out.println("Estamos trabajando para entregar vuelto, vuelva m??s tarde.");
        }
        if (e.getSource() == boton4) {

            switch (opcion) {
                case 1:
                    System.out.println("Recibiendo Coca");

                    try {
                        exp_principal.comprarBebida(new Moneda1500(), opcion);
                    } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    break;

                case 3:
                    System.out.println("Recibiendo Fanta");
                    try {
                        exp_principal.comprarBebida(new Moneda1500(), opcion);
                    } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("Recibiendo Sprite");
                    try {
                        exp_principal.comprarBebida(new Moneda1500(), opcion);
                    } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayBebidaException e1) {
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

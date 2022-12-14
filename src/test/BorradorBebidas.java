package test;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BorradorBebidas extends JLabel implements MouseListener, MouseMotionListener {

    JLabel objetivo;
    int serial;

    public BorradorBebidas(JLabel a, int serie) {
        this.objetivo = a;
        this.serial = serie;
        a.addMouseListener(this);
        a.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent event) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        objetivo.setBounds(220, 450, 55, 55);
        System.out.println("Bebida retirada\n" + "Serie Bebida: " + serial);

    }

    @Override
    public void mousePressed(MouseEvent event) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

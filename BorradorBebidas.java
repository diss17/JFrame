
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class BorradorBebidas extends JLabel implements MouseListener, MouseMotionListener {

    JLabel objetivo;
    int serial;
    private int X,Y;

    public BorradorBebidas(JLabel a, int serie) {
        this.objetivo = a;
        this.serial = serie;
        a.addMouseListener(this);
        a.addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent event) {
        event.getComponent().setLocation((event.getX()+event.getComponent().getX())-X,(event.getY()+event.getComponent().getY())-Y);

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        objetivo.setVisible(false);


    }

    @Override
    public void mousePressed(MouseEvent event) {
		X = event.getX();
        Y = event.getY();   

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("testing");
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}

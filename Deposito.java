

import java.util.ArrayList;

class Deposito {

    //Arraylist que se encargan de añadir o quitar elementos tipo moneda o bebida segun corresponda
    private ArrayList<Bebida> b;
    private ArrayList m;

    public Deposito() {
        b = new ArrayList();
        m = new ArrayList();
    }

    public void addBebida(Bebida num) {
        b.add(num);
    }

    public Bebida getBebida() { 
        if (b.size() != 0) {
            return b.remove(0);
        } else {
            return null;
        }
    }

    public void addMoneda(Moneda x) {
        m.add(x);
    }

    public Moneda getMoneda() {
        if (m.size() <= 0) {
            return null;
        } else {
            Moneda a = (Moneda) m.remove(0);
            return a;
        }
    }
}

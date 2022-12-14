abstract class Moneda {

    public int valor;
    public String serie;

    public Moneda() {
        super();
    }
 
    public String getSerie() {
        return "Moneda de ";
    }

    public int getValor() {
        return valor;
    }
}
//Clases de los distintos tipos de monedas que heredan las propiedades de la clase Moneda
//Clase moneda de 1500.

class Moneda1500 extends Moneda {

    public Moneda1500() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "1500";
    }

    @Override
    public int getValor() {
        valor = 1500;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $1500 \n Serie: " + getSerie();
    }
}

//Clase moneda 1000.
class Moneda1000 extends Moneda {

    public Moneda1000() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "1000";
    }

    @Override
    public int getValor() {
        valor = 1000;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $1000 \n Serie: " + getSerie();
    }
}

//Clase moneda 500.
class Moneda500 extends Moneda {

    public Moneda500() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "500";
    }

    @Override
    public int getValor() {
        valor = 500;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $500\n Serie: " + getSerie();
    }
}

//Clase moneda 100.
class Moneda100 extends Moneda {

    public Moneda100() {
        super();
    }

    @Override
    public String getSerie() {
        return super.getSerie() + "100";
    }

    @Override
    public int getValor() {
        valor = 100;
        return super.getValor();
    }

    @Override
    public String toString() {
        return "Moneda de $100\n Serie: " + getSerie();
    }
}

class Moneda0 extends Moneda {

    public Moneda0() {
        super();
    }

    @Override
    public int getValor() {
        valor = 0;
        return super.getValor();
    }

}

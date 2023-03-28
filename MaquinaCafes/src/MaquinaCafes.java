import java.util.Arrays;

public class MaquinaCafes {
    //ATRIBUTOS
    private int numVasos = 50;
    // cada vaso cuenta con 200 ml capacidad
    private float agua = 5000;
    private float cafe = 1000;
    private float crema = 1500;

    @Override
    public String toString() {
        return "MaquinaCafes{" +
                "numVasos=" + numVasos +
                ", agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                '}';
    }

    public int getNumVasos() {
        return numVasos;
    }

    public void setNumVasos(int numVasos) {
        this.numVasos = numVasos;
    }

    public float getAgua() {
        return agua;
    }

    public void setAgua(float agua) {
        this.agua = agua;
    }

    public float getCafe() {
        return cafe;
    }

    public void setCafe(float cafe) {
        this.cafe = cafe;
    }

    public float getCrema() {
        return crema;
    }

    public void setCrema(float crema) {
        this.crema = crema;
    }

    public MaquinaCafes() {
    }

    public MaquinaCafes(int numVasos, float agua, float cafe, float crema) {
        this.numVasos = numVasos;
        this.agua = agua;
        this.cafe = cafe;
        this.crema = crema;
    }

    //METODOS
    public void americano() {
        if (this.agua < 180 || this.cafe < 15 || this.numVasos < 1) {
            System.out.println("¡Lo sentimos!... ya no contamos con recursos para preparar cafe. ");
        } else {
            this.agua = this.agua - 180;
            this.cafe = this.cafe - 15;
            this.numVasos--;
            System.out.println("En un momento esta tu cafe Americano... ¡por favor, se paciente!. ");
        }
    }

    public void expreso() {
        if (this.agua < 120 || this.cafe < 20 || this.numVasos < 1) {
            System.out.println("¡Lo sentimos!... ya no contamos con recursos para preparar cafe. ");
        } else {
            this.agua = this.agua - 120;
            this.cafe = this.cafe - 20;
            this.numVasos--;
            System.out.println("En un momento esta tu cafe Expreso... ¡por favor, se paciente!. ");
        }
    }

    public void capuchino() {
        if (this.agua < 100 || this.cafe < 14 || this.crema < 70 || this.numVasos < 1) {
            System.out.println("¡Lo sentimos!... ya no contamos con recursos para preparar cafe. ");
        } else {
            this.agua = this.agua - 100;
            this.cafe = this.cafe - 14;
            this.crema = this.crema - 70;
            this.numVasos--;
            System.out.println("En un momento esta tu cafe Capuchino... ¡por favor, se paciente!. ");
        }
    }

    public void cantidadDeposito() {
        for (String s : Arrays.asList("Cantidad de material en deposito: ", "Agua: " + this.agua + "ml", "Cafe: " + this.cafe + "g", "Crema: " + this.crema + "ml")) {
            System.out.println(s);
        }
    }
}
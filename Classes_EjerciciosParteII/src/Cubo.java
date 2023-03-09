import java.awt.*;
public class Cubo {
    private String variaciones;
    private String tamano;
    private Color color1;
    private Color color2;
    private Color color3;
    private Color color4;

    public Cubo() {
    }

    public Cubo(String variaciones, String tamano, Color color1, Color color2, Color color3, Color color4) {
        this.variaciones = variaciones;
        this.tamano = tamano;
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
    }

    public String getVariaciones() {
        return variaciones;
    }

    public void setVariaciones(String variaciones) {
        this.variaciones = variaciones;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Color getColor3() {
        return color3;
    }

    public void setColor3(Color color3) {
        this.color3 = color3;
    }

    public Color getColor4() {
        return color4;
    }

    public void setColor4(Color color4) {
        this.color4 = color4;
    }

    @Override
    public String toString() {
        return "Cubo{" +
                "variaciones='" + variaciones + '\'' +
                ", tamano='" + tamano + '\'' +
                ", color1=" + color1 +
                ", color2=" + color2 +
                ", color3=" + color3 +
                ", color4=" + color4 +
                '}';
    }

    public void jugar() {
        if (variaciones.equals("cuboide")){
            System.out.println("Para jugar guiate de sus dimensiones");
            System.out.println("DIMENSION: NxNxM y NxMxR");
        }
        if (variaciones.equals("morphhix")) {
            System.out.println("Para jugar guiate de sus dimensiones");
            System.out.println("DIMENSION: tetraedos");
        }
        if (variaciones.equals("pyramorphys")) {
            System.out.println("Para jugar guiate de sus dimensiones");
            System.out.println("DIMENSION: tiene ocho piezas con forma de tetraedro.");
        }
        if (variaciones.equals("mastermorphix")) {
            System.out.println("Para jugar guiate de sus dimensiones");
            System.out.println("DIMENSION: cubo de rubik 3x3 con 4 caras");
        }

    }
    public void moverDireccion(){
        System.out.println("1. Crea una cruz en la parte superior (repit 4 veces)");
        System.out.println("2. Completar la capa superior, y la segunda capa");
        System.out.println("3. Crea una cruz en la ultima cara");
        System.out.println("4. Extende la cruz a la ultima cara");
        System.out.println("5. Coloca los ultimos vertices sin orientar");
    }
}

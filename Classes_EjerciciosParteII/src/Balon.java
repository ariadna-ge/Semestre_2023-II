import java.awt.*;

public class Balon {
    private String tipo;
    private Color color;
    private String marca;

    public Balon() {
    }

    public Balon(String tipo, Color color, String marca) {
        this.tipo = tipo;
        this.color = color;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Balon{" +
                "tipo='" + tipo + '\'' +
                ", color=" + color +
                ", marca='" + marca + '\'' +
                '}';
    }

    public void lanzar(){
        if(tipo.equals("Futbol")){
            System.out.println("Patealo con el pie");
        }
        if(tipo.equals("Baloncesto")){
            System.out.println("Botalo con la mano");
        }
        if(tipo.equals("Voleibol")) {
            System.out.println("Utiliza los brazos");
        }
    }

    public void inflar(){
        System.out.println("Inflarlo en caso de que no se pueda botar");
    }

}
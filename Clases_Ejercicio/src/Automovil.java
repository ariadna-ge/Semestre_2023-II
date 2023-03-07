import java.awt.*;

public class Automovil {
    private String marca;
    private String subMarca;
    private double modelo;
    private Color color;

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, double modelo, Color color) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public double getModelo() {
        return modelo;
    }

    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", subMarca='" + subMarca + '\'' +
                ", modelo=" + modelo +
                ", color=" + color +
                '}';
    }

    public void abrir(){
        System.out.println("El carro esta abierto");
    }

    public void tiempo(){
        if (modelo >= 15){
            System.out.println("El auto es nuevo");
        } else{
            System.out.println("El auto es viejo");
        }
    }

    public void cerrar(){
        System.out.println("El carro esta cerrado");
    }
}

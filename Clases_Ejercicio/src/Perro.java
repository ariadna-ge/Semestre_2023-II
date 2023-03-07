import java.awt.*;

public class Perro {
    private String nombre;
    private String raza;
    private double edad;
    private double tamano;
    private Color color;

    public Perro() {
    }

    public Perro(String nombre, String raza, double edad, double tamano, Color color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamano = tamano;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamano=" + tamano +
                ", color=" + color +
                '}';
    }

    public void comiendo(){
        System.out.println("Esta comiendo");
    }
    public void vejez(){
        if (edad <= 7){
            System.out.println("Tu perro es joven");
        } else{
            System.out.println("Tu perro esta viejito");
        }
    }

    public void dormir(){
        System.out.println("Tu perro esta durmiendo");
    }
}

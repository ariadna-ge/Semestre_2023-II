import java.util.Scanner;
public class Monitor {
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    //constructor por defecto

    public Monitor() {
    }


    //constructor sobrecargado

    public Monitor(double pulgadas, String marca, String modelo, String tipo, double precio) {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "pulgadas=" + pulgadas +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void encender(){
        System.out.println("Encendido");
    }

    public void cambiar(){
        Scanner canal= new Scanner(System.in);
        String c;
        System.out.println("Indica la entrada en la que te vas a cambiar");
        c = canal.nextLine();
        System.out.println("Estas en la entrada "+c);
    }

    public void apagar(){
        System.out.println("Apagaste el monitor");
    }
}
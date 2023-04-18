import java.awt.*;
public class Automovil extends Vehiculo{
    protected String marca;
    protected String modelo;
    protected float anho;

    public Automovil() {
    }
    public Automovil(String tipoMotor, Color color, String tipoLlanta, String marca, String modelo, float anho) {
        super(tipoMotor, color, tipoLlanta);
        this.marca = marca;
        this.modelo = modelo;
        this.anho = anho;
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

    public float getAnho() {
        return anho;
    }

    public void setAnho(float anho) {
        this.anho = anho;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anho=" + anho +
                '}';
    }

    public void mostrarAutomovil(){
        System.out.println("La marca es: " +this.marca);
        System.out.println("El modelo es: "+this.modelo);
    }
    public void mostrarCondicion(){
        if (!(anho <= 2023)) {
            System.out.println("El vehiculo es considerado como antiguo");
        } else {
            System.out.println("El vehiculo es considerado como nuevo");
        }
    }


}

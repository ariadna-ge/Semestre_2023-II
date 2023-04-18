import java.awt.*;
import java.util.Arrays;

public class Taxi extends Automovil{
    protected int kilometraje;
    protected int tarifa;
    protected String matricula;

    public Taxi() {
    }
    public Taxi(String tipoMotor, Color color, String tipoLlanta, String marca, String modelo, float anho, int kilometraje, int tarifa, String matricula) {
        super(tipoMotor, color, tipoLlanta, marca, modelo, anho);
        this.kilometraje = kilometraje;
        this.tarifa = tarifa;
        this.matricula = matricula;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getTarifa() {
        return tarifa;
    }

    public void setTarifa(int tarifa) {
        this.tarifa = tarifa;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "kilometraje=" + kilometraje +
                ", tarifa=" + tarifa +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    public void recorrerDistancia(){
        System.out.println("Los kilometros recorridos fueron "+ this.kilometraje +"km");

    }
    public void cobrarViaje(){
        double costo = kilometraje * tarifa;
        double descuento = (costo / 100 ) * 3;
        double costoTotal = costo-descuento;
        for (String s : Arrays.asList("El costo por el viaje es de $" + costoTotal + " Gracias por viajar con nosotros!, buen dia.", "Si tienes algun reporte, indica que tu viaje fue con la matricula: "+this.matricula)) {
            System.out.println(s);
        }
    }

}

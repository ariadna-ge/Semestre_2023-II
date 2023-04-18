import java.awt.*;
public class Vehiculo {
    protected String tipoMotor;
    protected Color color;
    protected String tipoLlanta;

    public Vehiculo() {
    }

    public Vehiculo(String tipoMotor, Color color, String tipoLlanta) {
        this.tipoMotor = tipoMotor;
        this.color = color;
        this.tipoLlanta = tipoLlanta;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getTipoLlanta() {
        return tipoLlanta;
    }

    public void setTipoLlanta(String tipoLlanta) {
        this.tipoLlanta = tipoLlanta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "tipoMotor='" + tipoMotor + '\'' +
                ", color=" + color +
                ", tipoLlanta='" + tipoLlanta + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Encendiendo el auto con motor "+this.tipoMotor);
    }
    public void frenarAutomovil()
    {
        System.out.println("El auto se detuvo");
    }
}

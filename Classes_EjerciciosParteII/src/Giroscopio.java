public class Giroscopio {
    private String tipo;
    private float potencia;
    private float rango;

    public Giroscopio() {
    }

    public Giroscopio(String tipo, float potencia, float rango) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.rango = rango;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public float getRango() {
        return rango;
    }

    public void setRango(float rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                ", rango=" + rango +
                '}';
    }

    public void rotar(){
        System.out.println("Se encuentra girando");
    }
    public void orientar(){
        System.out.println("ELIGE LA CONEXION DE TU PREFERENCIA");
        System.out.println("1. Conexion a la interfaz de poder");
        System.out.println("2. Conexion a interfaz de comunicacion");
    }
}

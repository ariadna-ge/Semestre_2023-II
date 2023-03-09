public class Lampara {
    private float precio;
    private float tamano;
    private String forma;

    public Lampara() {
    }

    public Lampara(float precio, float tamano, String forma) {
        this.precio = precio;
        this.tamano = tamano;
        this.forma = forma;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getTamano() {
        return tamano;
    }

    public void setTamano(float tamano) {
        this.tamano = tamano;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "precio=" + precio +
                ", tamano=" + tamano +
                ", forma='" + forma + '\'' +
                '}';
    }

    public void encender(){
        System.out.println("Lampara encendida");
    }

    public void comprar() {
        double iva = 15;
        double ivaD = 20;
        if (tamano <= 15) {
            double costoTotal1 = precio + iva;
            System.out.println("PRECIO TOTAL");
            System.out.println("Producto comprado");
            System.out.println("El costo total fue de $" + costoTotal1);
        }
        if (tamano >= 16) {
            double costoTotal = precio + ivaD;
            System.out.println("PRECIO TOTAL");
            System.out.println("Producto comprado");
            System.out.println("El costo total fue de $" + costoTotal);
        }
    }

}

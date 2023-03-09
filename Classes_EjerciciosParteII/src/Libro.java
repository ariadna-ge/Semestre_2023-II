public class Libro {
    private String titulo;
    private String autor;
    private double precio;
    private int paginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, double precio, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", paginas=" + paginas +
                '}';
    }

    public void comprar(){
        System.out.println("PRECIO TOTAL");
        double iva= 20;
        double descuento= (precio*10)/100;
        double precioTotal= precio+iva-descuento;
        System.out.println("Producto comprado");
        System.out.println("El costo total fue de $"+precioTotal);
    }

    public  void leer(){
        if (paginas<=300){
            System.out.println("Puedes leer el libro en dos dias");
        } else{
            System.out.println("Tal vez necesitas de un mes para leerlo");
        }

    }
}

public class Pais {
    private String nombre;
    private String idioma;
    private float poblacion;

    public Pais() {
    }
    public Pais(String nombre, String idioma, float poblacion) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public float getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(float poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", idioma='" + idioma + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public void tratarLibre() {
        if (nombre.equals("Mexico") || nombre.equals("USA") || nombre.equals("Canada")) {
            System.out.println("Esta en el TLCAN");
        } else {
            System.out.println("No pertenece al tratado");
        }
    }
    public void poblar(){
        if (poblacion <= 18000000){
            System.out.println("El pais esta sobrepoblado");
        } else{
            System.out.println("EL pais no esta sobrepoblado");
        }

    }
}

public class Gato {
    private String nombre;
    private String raza;
    private float edad;

    public Gato() {
    }

    public Gato(String nombre, String raza, float edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
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

    public float getEdad() {
        return edad;
    }

    public void setEdad(float edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                '}';
    }

    public void ronronear(){
        System.out.println("Mrrr");
    }

    public void comer(){
        String comida="Pecado";
        if(comida.equals("Pecado")){
            System.out.println("Comer");
        } else {
            System.out.println("No puedo comer");
        }
    }
}

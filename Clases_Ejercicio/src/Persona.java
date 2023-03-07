public class Persona {
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public Persona() {
    }

    public Persona(int edad, String nombre, double estatura, double peso, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", estatura=" + estatura +
                ", peso=" + peso +
                ", genero='" + genero + '\'' +
                '}';
    }

    public void comer() {
        System.out.println("Esta comiendo");
    }

    public void indice() {
        double imc = peso / (estatura * estatura);
        if (imc <= 18.5) {
            System.out.println("Peso bajo");
        }
        if (imc <= 24.9) {
            System.out.println("Peso saludable");
        }
        if (imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        if (imc >= 30) {
            System.out.println("Obesidad");
        }
    }

    public void jugar() {
        if (edad >= 5) {
            System.out.println("Ya es muy grande para jugar");
        } else {
            System.out.println("Esta jugando");
        }

    }
}

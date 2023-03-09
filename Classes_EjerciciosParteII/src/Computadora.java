public class Computadora {
    private String marca;
    private String procesador;
    private  float memoria;
    private float espacioMemoria;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, float memoria, float espacioMemoria) {
        this.marca = marca;
        this.procesador = procesador;
        this.memoria = memoria;
        this.espacioMemoria = espacioMemoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public float getMemoria() {
        return memoria;
    }

    public void setMemoria(float memoria) {
        this.memoria = memoria;
    }

    public float getEspacioMemoria() {
        return espacioMemoria;
    }

    public void setEspacioMemoria(float espacioMemoria) {
        this.espacioMemoria = espacioMemoria;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", procesador='" + procesador + '\'' +
                ", memoria=" + memoria +
                ", espacioMemoria=" + espacioMemoria +
                '}';
    }

    public void almacenarInfo() {
        if (memoria <= 16) {
            if (memoria == 4) {
                if(espacioMemoria > 4) {
                    System.out.println("MEMORIA LLENA!");
                } else {
                    System.out.println("ARCHIVO ALMACENADO");
                }
            }
            if (memoria == 8) {
                if(espacioMemoria > 8) {
                    System.out.println("MEMORIA LLENA!");
                } else {
                    System.out.println("ARCHIVO ALMACENADO");
                }
            }

            if (memoria == 16) {
                if(espacioMemoria > 16) {
                    System.out.println("MEMORIA LLENA!");
                } else {
                    System.out.println("ARCHIVO ALMACENADO");
                }
            }
            System.out.println("RECUERDA: El almacenamiento esta limitado");
        } else {
            if (memoria == 32){
                if(espacioMemoria > 32) {
                    System.out.println("MEMORIA LLENA!");
                } else {
                    System.out.println("ARCHIVO ALMACENADO");
                }
            }
            if (memoria == 64){
                if(espacioMemoria > 64) {
                    System.out.println("MEMORIA LLENA!");
                } else {
                    System.out.println("ARCHIVO ALMACENADO");
                }
            }
            System.out.println("RECUERDA: Revisa constantemente el espacio ocupado");
        }

    }

    public void mostrarPantalla(){
        System.out.println("Bienvenido");
        System.out.println(marca.toUpperCase());
    }

}
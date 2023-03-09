import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Pais pa= new Pais("Mexico", "Español", 126000000);
        System.out.println(pa);
        pa.tratarLibre();
        pa.poblar();

        Giroscopio gi=new Giroscopio("Rotatorio", 5, 125);
        System.out.println(gi);
        gi.orientar();
        gi.rotar();

        Computadora com= new Computadora("Hp","Core i9-12900HK",64,33);
        System.out.println(com);
        com.almacenarInfo();
        com.mostrarPantalla();

        Cubo cu=new Cubo("cuboide", "2x4x6", Color.YELLOW, Color.BLUE, Color.GREEN, Color.RED);
        System.out.println(cu);
        cu.jugar();
        cu.moverDireccion();


        Libro lib= new Libro("JAVA A FONDO", "Pablo Augusto Sznajdleder", 350, 330);
        System.out.println(lib);
        lib.comprar();
        lib.leer();

        Balon ba=new Balon("Baloncesto", Color.ORANGE, "Wilson");
        System.out.println(ba);
        ba.lanzar();
        ba.inflar();

        Lampara la=new Lampara(300, 18, "Estrella");
        System.out.println(la);
        la.comprar();
        la.encender();

        Gato ga=new Gato("Michi", "British Shorthair", 2);
        System.out.println(ga);
        ga.ronronear();
        ga.comer();
    }
}
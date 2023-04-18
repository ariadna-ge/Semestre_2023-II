import java.awt.*;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Taxi taxi = new Taxi("V6-en linea", Color.BLUE, "Aluminio", "Volkswagen", "Jetta", 2023, 100, 3,"M485-P4");
        out.println(taxi);
        taxi.encender();
        taxi.mostrarAutomovil();
        taxi.frenarAutomovil();
        taxi.mostrarCondicion();
        taxi.recorrerDistancia();
        taxi.cobrarViaje();

    }
}
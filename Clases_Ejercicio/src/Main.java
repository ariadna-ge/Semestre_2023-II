import java.awt.*;

public class Main {
    public static void main(String[] args) {

       Persona per=new Persona(15, "Lizeth", 1.58, 56.0, "Femenino");
        System.out.println(per);
        per.comer();
        per.indice();
        per.jugar();

       Monitor mon = new Monitor(27.4, "Samsung", "SM10", "LED", 6500.0);
        System.out.println(mon);
        mon.encender();
        mon.cambiar();
        mon.apagar();

        Automovil au= new Automovil("BMW", "BMW M4", 2022, Color.red);
        System.out.println(au);
        au.abrir();
        au.tiempo();
        au.cerrar();

        Perro pe=new Perro("Dalok", "Husky", 1, 1.00, Color.black);
        System.out.println(pe);
        pe.comiendo();
        pe.vejez();
        pe.dormir();
    }
}
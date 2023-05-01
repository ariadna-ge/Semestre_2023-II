package poo2208;

import java.util.ArrayList;

public class CajaDriver {
    public static void main(String[] args) {
        Caja<String> miCaja = new Caja<>(new String[10]);
        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(2, "hi");
        System.out.println(miCaja);

        String temp = miCaja.get(0);

        System.out.println("-------------");
        CajaSinGenericos cjs= new CajaSinGenericos(new Object[10]);
        cjs.add(0, "hola");
        cjs.add(1, "adios");
        cjs.add(2, "hi");
        System.out.println(cjs);
        String temp2 = (String) cjs.get(0);

        System.out.println("-------comida-------");

        Caja <Comida> cajaComida = new Caja<>(new Comida[10]);
        cajaComida.add(0, new Comida("Yougurth", true));
        System.out.println(cajaComida.get(0));

        System.out.println("-----------------------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("zanahoria", false));
        comidas.add(new Comida("manzana", false));
        System.out.println(comidas.size());
        System.out.println(comidas.get(13));

        System.out.println("------------------------");
        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yougurth", true));
        comidas2.add(new Comida("Danonino", true));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bisteck", false));

        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));
        comidas2.add(3, new Comida("Naranja", false));
        System.out.println("------final-----");
        for (Comida comida: comidas2){
            System.out.println(comida);
        }
    }
}
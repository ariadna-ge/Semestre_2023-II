import java.util.Scanner;
public class Juego_Gato{
    public static void main(String[] args) {
        int c=0;
        int j=0;
        char value_car = '═';
        char value_car2 = '║';
        String cadena;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cadena: ");
        cadena = teclado.nextLine();
        //  System.out.println(cadena);

        char[][] matriz = new char[3][3];

        int columna;
        var fila=0;

        for(int i=0; i<cadena.length(); i++){
            columna= i/3;
            fila= i%3;
            matriz[fila][columna] = cadena.charAt(i);
        }

        //parte superior del marco
        while(c<10){
            System.out.print(value_car);
            c++;
        }
        System.out.println();

        for (char[] chars : matriz) {
            System.out.print(value_car2);
            for (int y = 0; y < chars.length; y++) {
                System.out.print(chars[y]);
                if (y != chars.length - 1) System.out.print("\t");
            }
            System.out.println(value_car2);
        }

        //parte inferior del marco
        while(j<10){
            System.out.print(value_car);
            j++;
        }
        System.out.println();

    }
}
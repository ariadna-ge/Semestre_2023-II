import java.util.Scanner;
public class Cadena
{
    public static void main(String[] args) {
        //entrada de cadena
        String texto;
        Scanner teclado = new Scanner(System.in);

        //salida de datos
        String nombre="";
        String profesion="";
        String pais="";

        //texto en pantalla
        System.out.println("CAPTURA DE TEXTO");
        System.out.println();
        System.out.println("Favor de ingresar nombre, profesión y nacionalidad");
        //lectura de la cadena
        texto=teclado.nextLine();

        //posiciones de los caracteres de la cadena obtenida
        int i = texto.indexOf(' ');
        int l = texto.lastIndexOf(' ');
        int t = texto.length();

        if(i >= 0){
            nombre= texto.substring(0,i);
        }
        if(l > i){
            profesion = texto.substring(i++, l);
            pais= texto.substring(l++, t);
        }

        //cambiar la cadena en mayusculas
        String may= nombre.toUpperCase();
        String may1= profesion.toUpperCase();
        String may2= pais.toUpperCase();

        //retorna la separacion de la cadena
        System.out.println();
        System.out.println("Nombre: "+may);
        System.out.println("Profesión: "+may1);
        System.out.println("País: "+may2);
        //System.out.println(texto);
    }
}
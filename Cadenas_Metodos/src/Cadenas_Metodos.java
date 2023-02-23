public class Cadenas_Metodos
{
    public static void main(String[] args) {
        //STRING
        /*Método length()*/
        String s = "Hola";
        int x = s.length(); // "longitud de una cadena"-cantidad de caracteres que lo componen
        System.out.println("La longitud de cadena es: "+x); //retorna: 4
        System.out.println();

        /*Método isEmpty()*/
        boolean b1=s.isEmpty(); //"cadena vacía"-no contiene ningún carácter
        System.out.println("Cadena vacia: "+b1); //retorna: false

        String s2= "";
        boolean b2=s2.isEmpty();
        System.out.println("Cadena vacia: "+b2); //retorna: true
        System.out.println();

        /*Método charAt()*/
        for(int i=0; i<s.length();i++){
            char c= s.charAt(i); //retorna carácter de determinada posición
            System.out.println(c);
        }
        System.out.println();

        /*Método equals()*/
        String z = "Hola";
        if(s.equals(z)){ //compara sus contenidos, retorna true!
            System.out.println("Si pasa por aqui!");
        }
        System.out.println();

        /*Método indexOf()*/
        String a= "Hola, como estas?";
        String s4="Hola, como estas? Estas como querias?";

        int p1= a.indexOf('a'); //posición de la primera ocurrencia de un determinado carácter
        int p3= s4.indexOf("como"); //posición de la primera ocurrencia de una subcadena
        int p4= s4.indexOf("estas");
        System.out.println("Posicion: "+p1);//retorna: 3
        System.out.println("Posicion de subcadena: "+p3); //retorna 6
        System.out.println("Posicion de subcadena: "+p4); //retorna 11

        /*Método lastIndexOf()*/
        int p2= a.lastIndexOf('a'); //posición de la última ocurrencia del carácter
        int p5= s4.lastIndexOf("como"); //posición de la última ocurrencia de una subcadena
        System.out.println("Posicion: "+p2); //retorna: 14
        System.out.println("Posicion de subcadena: "+p5); //retorna 24
        System.out.println();

        /*Método upperCase()*/
        String may= a.toUpperCase(); //mayúsculas
        System.out.println(may); //retorna: HOLA, COMO ESTAS?

        /*Método toLowerCase()*/
        String min= a.toLowerCase(); //minúsculas
        System.out.println(min); //retorna: hola, como estas?
        System.out.println();

        /*Método subString()*/
        String d= a.substring(0,4); //retorna: Hola
        String d1= a.substring(6,10); //retorna: como
        String d2= a.substring(11); //retorna: estas?
        System.out.println(d + " " + d1 + " " + d2);
        System.out.println();

        //INTEGER
        /*Método parseInt()*/
        //enteros
        String n = "1234";
        int e = Integer.parseInt(n);// retorna: 1234
        System.out.println(e);
        // flotantes
        String n2 = "1234.56";
        double f = Double.parseDouble(n2);// retorna: 1234.56
        System.out.println(f);

        /*Método toString()*/
        //enteros
        String t1 = Integer.toString(e); // retorna: "1234"
        System.out.println(t1);
        //flotantes
        String t2 = Double.toString(f);// retorna: "1234.56"
        System.out.println(t2);
        System.out.println();

        /*StringBuilder()*/
        StringBuilder sb=new StringBuilder();
        sb.append("Hola, ");  //concatenar cadenas
        sb.append("chau");
        System.out.println(sb); //SALIDA: Hola, chau
    }
}
//Sznajdleder, Pablo Augusto (2020). JAVA A FONDO - 4ª Edición. (p. 22-27) Alfaomega.
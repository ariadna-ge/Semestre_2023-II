public class Marco_Juego{
    public static void main(String[] args) {
        int tamaMar = 9;
        int c=0;
        int j=0;
        char value_car = '═';
        char value_car2 = '║';

        //parte superior del marco
        while(c<tamaMar){
            System.out.print(value_car);
            c++;
        }
        System.out.println();

        //laterales del marco
        for(int i=0; i<tamaMar; i++){
            System.out.print(value_car2);
            for(int k=0; k<tamaMar-2; k++){
                System.out.print(" ");
            }
            System.out.println(value_car2);
        }

        //parte inferior del marco
        while(j < tamaMar){
            System.out.print(value_car);
            j++;
        }

    }
}
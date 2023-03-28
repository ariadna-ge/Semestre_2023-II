public class MainCafetera {
    public static void main(String[] args) {
        MaquinaCafes coffeMachine = new MaquinaCafes();
        boolean depositoCantidad;
        depositoCantidad = true;

        if (depositoCantidad) {
            do {
                coffeMachine.americano();
                coffeMachine.expreso();
                coffeMachine.capuchino();
                coffeMachine.cantidadDeposito();

            System.out.println("Los depositos se encuentran limitados, ya no se pueden hacer mas cafes");
                if ((coffeMachine.getAgua() >= 180) && (coffeMachine.getCafe() >= 20) && (coffeMachine.getCrema() >= 70) && (coffeMachine.getNumVasos() >= 1))
                    depositoCantidad = true;
                else depositoCantidad = false;
            } while (depositoCantidad);
        }
    }
}
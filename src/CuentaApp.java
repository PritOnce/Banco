public class CuentaApp {
    public static void main(String[] args) {
        Cuenta cuenta1=new Cuenta("Estefania");
        Cuenta cuenta2=new Cuenta("Mario", 300);

        //Ingresar dinero
        cuenta1.ingresar(300);
        cuenta2.ingresar(400);

        //Retiramos dinero
        cuenta1.retirar(100);
        cuenta2.retirar(100);

        //Mostrar las cantidades
        System.out.println(cuenta1);
        System.out.println(cuenta2);
    }
}

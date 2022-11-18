public class Cuenta {
    private String titular;
    private double cantidad;

    //Creamos constructor
    public Cuenta(){

    }
    //Constructor objeto
    public Cuenta(Cuenta c){
        this.titular=c.titular;
        this.cantidad=c.cantidad;

    }
    public Cuenta(String titular){
        this.titular=titular;
        this.cantidad=0;

    }
    public Cuenta (String titular, double cantidad){
        this.titular=titular;
        //valor si es negativo o 0
        if (cantidad<0){
            this.cantidad=0;
        }else {
            this.cantidad=cantidad;
        }
    }

    //metodos o funciones
    public String getTitular (){
        return titular;
    }
    public void setTitular (String titular){
        this.titular=titular;
    }
    public double getCantidad(){
        return cantidad;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    //función que cargará dinero en la cuenta
    public void ingresar (double cantidad){
        if(cantidad>0){
            this.cantidad+=cantidad;
        }
    }
    public void retirar (double cantidad){
        if(this.cantidad-cantidad<0){
            this.cantidad=0;
        }
        else{
            this.cantidad-=cantidad;
        }
    }
    @Override
    public String toString(){
        return "El titular " + titular + " tiene " + cantidad + " en su cuenta";
    }
}

package activitat_5;

public class Main {

    
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;
	   //double valorActual;
	   //double valorAnterior;		
        
        miCuenta = new CCuenta("Juan López","1000-2365-85-123456789",2500,0);
       
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es "+ saldoActual );
   
        //Modificació
        System.out.println("Introducció de text");
    
    }
}

package poo.clases;

public class Cuenta {
    private double saldo;
    
    public void setSaldo(double saldo){
        if (saldo >= 0){
            this.saldo = saldo;
        }
    }
    
    public double getSaldo(){
        return saldo;
    }
    
}

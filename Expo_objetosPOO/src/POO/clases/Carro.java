package poo.clases;

public class Carro {
    Motor motor;
    
    public Carro(Motor motor){
        this.motor = motor;
    }
    
    public void mostrarMotor(){
        System.out.println("MOtor:" + motor.tipo);
    }
}

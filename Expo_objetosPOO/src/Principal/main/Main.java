package Principal.main;

import poo.clases.persona;
import poo.clases.Animal;
import poo.clases.Perro;
import poo.clases.Gato;
import poo.clases.Cuenta;
import poo.clases.Motor;
import poo.clases.Carro;

public class Main {
    public static void main(String[] args){
        
        //clase y objetos
        persona p = new persona();
        p.nombre = "Joshua";
        p.saludar();
        
        //Herencia y polimorfismo
        Animal a1 = new Perro();
        Animal a2 = new Gato();
        
        a1.hacerSonido();
        a2.hacerSonido();
        
        // Encapsulacion
        Cuenta c = new Cuenta();
        c.setSaldo(150);
        System.out.println("Saldo: "+ c.getSaldo());
        
        //Asociacion
        Motor m = new Motor();
        Carro car = new Carro(m);
        car.mostrarMotor();
        
    }
    //prueba git
}

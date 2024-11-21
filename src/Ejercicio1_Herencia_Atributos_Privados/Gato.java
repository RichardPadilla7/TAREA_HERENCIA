package Ejercicio1_Herencia_Atributos_Privados;

public class Gato extends Animal {

    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void HacerSonido(){
        super.HacerSonido();
        System.out.println("El gato maúlla: ¡Miau!");
    }
}

package Ejercicio1_Herencia_Atributos_Privados;

public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void HacerSonido() {
        super.HacerSonido();
        System.out.println("El perro ladra: ¡Guau, guau!");
    }
}



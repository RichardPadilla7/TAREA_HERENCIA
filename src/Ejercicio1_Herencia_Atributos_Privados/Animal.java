package Ejercicio1_Herencia_Atributos_Privados;

public class Animal {
    private String nombre;
    private int edad;

    //CONSTRUCTOR DEL PADRE
    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //METODO PADRE
    public void HacerSonido(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }


    public static void main(String[] args){

        Gato gato = new Gato("Alex",4);
        gato.HacerSonido();

        Perro perro = new Perro("Nico",4);
        perro.HacerSonido();

        // Cambiamos el nombre del gato
        gato.setNombre("Mindy");
        System.out.println("Nombre cambiado del gato a: " + gato.getNombre());
        gato.HacerSonido();

        // Cambiamos la edad del perro
        perro.setEdad(3);
        System.out.println("La edad del perro cambiado a: " + perro.getEdad());
        perro.HacerSonido();

    }
}

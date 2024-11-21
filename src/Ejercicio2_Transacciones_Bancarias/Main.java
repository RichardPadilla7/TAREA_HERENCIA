package Ejercicio2_Transacciones_Bancarias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objetos de los clientes
        Cliente cliente1 = new Cliente("Richard Padilla", "1753078839");
        Cliente cliente2 = new Cliente("Mia Gómez", "1712323334");

        // Objetos de cuentas bancarias
        CuentaCorriente cuentaCorriente = new CuentaCorriente("34YTU", cliente1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("BANK23", cliente2);

        int opcion;
        do {
            // Mostrar menú del tipo bancario que quiere realizar
            System.out.println("\n --- MENU ---");
            System.out.println("1. Ver informacion del cliente y saldo");
            System.out.println("2. Transferir entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();


            // Accion que hara cada opcion que se deplegara del menu
            switch (opcion) {
                case 1:
                    // En este apartado hara la seleccion para mostrar la infromacion del tipo de cuenta
                    System.out.println("\nCuenta Corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("\nCuenta Ahorro:");
                    cuentaAhorro.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("\nIngrese el monto a transferir de Cuenta Corriente a Cuenta Ahorro: ");
                    double montoTransferir = scanner.nextDouble();
                    if (cuentaCorriente.getSaldo() >= montoTransferir) {
                        cuentaCorriente.retirar(montoTransferir);
                        cuentaAhorro.depositar(montoTransferir);
                        System.out.println("Transferencia completada.");
                    } else {
                        System.out.println("Fondos insuficientes en la Cuenta Corriente.");
                    }
                    break;

                case 3:
                    // Este es el apartado donde se ingressara el dinero a las cuentas desde las clases cuentaa de ahorro y corriente
                    System.out.print("\nSelecciona cuenta (1: Corriente, 2: Ahorro): ");
                    int cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el Monto a retirar: ");
                    double montoRetirar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.retirar(montoRetirar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.retirar(montoRetirar);
                    } else {
                        System.out.println("Cuenta no valida.");
                    }
                    break;

                case 4:

                    // En esta seccion en cambio ya es para poder depositar
                    System.out.print("\nSelecciona cuenta (1: Corriente, 2: Ahorro): ");
                    cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el Monto a depositar: ");
                    double montoDepositar = scanner.nextDouble();
                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.depositar(montoDepositar);
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.depositar(montoDepositar);
                    } else {
                        System.out.println("Cuenta no válida.");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}

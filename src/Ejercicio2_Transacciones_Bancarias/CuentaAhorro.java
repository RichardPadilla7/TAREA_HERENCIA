package Ejercicio2_Transacciones_Bancarias;

// Clase hija que representa una cuenta de ahorro, derivada de CuentaBancaria
public class CuentaAhorro extends CuentaBancaria {
    private double saldoMinimo = 100; // Saldo minimo

    // Utiliza el constructor de la clase padre (CuentaBancaria)
    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500, numeroCuenta, cliente); // El saldo inicial es 500
    }

    // Sobrescritura para implementar la lógica específica para realizar un retiro en una cuenta de ahorro
    @Override
    public void retirar(double monto) {
        //Verifica que el saldo de retiro no sea menor al saldo mínimo permitido
        if (getSaldo() - monto >= saldoMinimo) {
            setSaldo(getSaldo() - monto); // Actualiza el saldo
            System.out.println("Retiro realizado. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("No se puede realizar el retiro. Saldo insuficiente.");
        }
    }
}

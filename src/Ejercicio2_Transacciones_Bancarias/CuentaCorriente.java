package Ejercicio2_Transacciones_Bancarias;

// Clase hija que representa una cuenta corriente, derivada de CuentaBancaria
public class CuentaCorriente extends CuentaBancaria {
    private double comision = 0.02; // En la comision sera del 2% del monto a retirar

    // Utiliza el constructor de la clase base (CuentaBancaria)
    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(1000, numeroCuenta, cliente); // El saldo inicial es 1000
    }

    // Sobrescritura que incluye el cálculo de la comisión asociada al monto retirado
    @Override
    public void retirar(double monto) {
        double montoConComision = monto + (monto * comision);   // Calcula el monto total incluyendo la comisión

        // Verifica si el saldo es suficiente
        if (getSaldo() >= montoConComision) {
            setSaldo(getSaldo() - montoConComision); // Actualiza el saldo restando el monto y la comisión
            System.out.println("Retiro realizado con comisión. Nuevo saldo: $" + getSaldo());
        } else {
            System.out.println("Fondos insuficientes para realizar el retiro.");
        }
    }
}

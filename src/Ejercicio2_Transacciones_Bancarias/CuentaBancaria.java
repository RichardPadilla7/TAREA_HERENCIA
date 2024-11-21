package Ejercicio2_Transacciones_Bancarias;
public abstract class CuentaBancaria {
    // Atributos de la clase
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente; //Cliente asociado a la cuenta

    // Constructor
    public CuentaBancaria(double saldoInicial, String numeroCuenta, Cliente cliente) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    // Métodos
    public double getSaldo() {
        return saldo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Metodo personalizado para depositar a la cuenta
    public void depositar(double monto) {
        saldo = saldo + monto; // Incrementa el saldo con el monto depositado
        System.out.println("Depósito realizado. Nuevo saldo: $" + saldo);
    }

    // Este sera un método abstracto para retirar dinero, este se implementara desde clases derivadas
    public abstract void retirar(double monto);

    // Muestra información de la cuenta, incluyendo datos del cliente desde cuenta de ahorro p de corriente
    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Número de Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
    }

    //Este sera un campo protegiddo para poder retirar el saldo o modificarlo
    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

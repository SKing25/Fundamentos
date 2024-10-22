public class Cuenta {
    protected int numeroCuenta;
    protected int añoApertura;
    protected Titular titular;
    protected double saldo;

    public Cuenta(int numeroCuenta, int añoApertura, Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.añoApertura = añoApertura;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getAñoApertura() {
        return añoApertura;
    }

    public void setAñoApertura(int añoApertura) {
        this.añoApertura = añoApertura;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + numeroCuenta + " - Año de apertura: " + añoApertura + " - Titular: " + titular.getNombreApellido() +
        " - Saldo: " + saldo;
    }
}

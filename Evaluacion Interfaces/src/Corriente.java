import java.time.LocalDate;

public class Corriente extends Cuenta implements IRetiro, IDeposito{
    private LocalDate fechaMovimiento;
    private long valorMovimiento;

    public Corriente(int numeroCuenta, int añoApertura, Titular titular, long valorMovimiento) {
        super(numeroCuenta, añoApertura, titular);
        this.fechaMovimiento = LocalDate.now();
        this.valorMovimiento = valorMovimiento;
    }

    @Override
    public void retiro(long valor) {
        this.saldo -= valor;
        this.valorMovimiento = -valor; 
        
    }

    @Override
    public void deposito(long valor) {
        this.saldo += valor;
        this.valorMovimiento = valor;
        
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public long getValorMovimiento() {
        return valorMovimiento;
    }

    public void setValorMovimiento(long valorMovimiento) {
        this.valorMovimiento = valorMovimiento;
    }

    @Override
    public String toString() {
        return super.toString() + " - Fecha del ultimo movimiento: " + fechaMovimiento + " - Valor del ultimo movimiento: " + valorMovimiento +
        " - Tipo de cuenta: Corriente";
    }
}

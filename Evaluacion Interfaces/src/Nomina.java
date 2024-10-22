import java.time.LocalDate;

public class Nomina extends Cuenta implements IRetiro{
    private String empresa;
    private LocalDate fechaRetiro;

    public Nomina(int numeroCuenta, int añoApertura, Titular titular, String empresa) {
        super(numeroCuenta, añoApertura, titular);
        this.empresa = empresa;
        this.fechaRetiro = LocalDate.now();
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public LocalDate getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(LocalDate fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    @Override
    public void retiro(long valor) {
        this.saldo -= valor;
    }

    @Override
    public String toString() {
        return super.toString() + " - Empresa: " + empresa + " - Fecha del ultimo retiro: " + fechaRetiro + " - Tipo de cuenta: Nomina";
    }
}

package herenciaBanco;

public class CuentaCorriente extends cuenta{
    public CuentaCorriente(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean extraer(double monto) {
        this.setSaldo(getSaldo()-monto);
        return true;
    }
}

package herenciaBanco;

public class CuentaAhorro extends cuenta {
    public CuentaAhorro(int numero, double saldo) {
        super(numero, saldo);
    }

    @Override
    public boolean extraer(double monto) {
        boolean resultado=false;
        if(getSaldo() >= monto){
            setSaldo(getSaldo()-monto);
            resultado=true;
        }
        return resultado;
    }
}

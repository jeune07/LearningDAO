package herenciaBanco;

public class Main {
    public static void main(String[] args) {

        cuenta nuevoCuenta = new CuentaAhorro(1,500);
        nuevoCuenta.setSaldo(1000);
        nuevoCuenta.extraer(50000.00);
        System.out.println(nuevoCuenta.getSaldo());



        cuenta nuevaEmpresa =new CuentaCorriente(1,900);
        nuevaEmpresa.setSaldo(400);
        nuevaEmpresa.extraer(800000000);
        System.out.println(nuevaEmpresa.getSaldo());

    }


}

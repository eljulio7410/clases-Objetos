public class Main {
    public static void main(String[] args) {

//        Estudiante est = new Estudiante();
//        est.tipo = "Estudiante";
//        est.nombre = "Jose";
//        est.apellido = "Suarez";
//        est.edad = 21;
//        est.carrera = "medicina";
//
//        Estudiante egresado = new Estudiante();
//        egresado.tipo = "Egresado";
//        egresado.nombre = "Juan";
//        egresado.apellido = "Flores";
//        egresado.edad = 21;
//        egresado.carrera = "psicologia";
//
//        est.info();
//        System.out.println("-----------------------------");
//        egresado.info();

        CuentaBancaria cuenta1 = new CuentaBancaria("258", "jose", 1500);
        CuentaBancaria cuenta2 = new CuentaBancaria("001", "david", 1000);

        cuenta1.depositar(220);
        cuenta1.imprimir();
        cuenta2.depositar(1100);
        cuenta2.imprimir();

        cuenta2.transferir(cuenta1, 200);
        cuenta2.imprimir();
        cuenta1.imprimir();

    }
}

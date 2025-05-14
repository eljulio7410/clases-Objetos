public class Main {
    public static void main(String[] args) {

        Estudiante est = new Estudiante();
        est.tipo = "Estudiante";
        est.nombre = "Jose";
        est.apellido = "Suarez";
        est.edad = 21;
        est.carrera = "medicina";

        Estudiante egresado = new Estudiante();
        egresado.tipo = "Egresado";
        egresado.nombre = "Juan";
        egresado.apellido = "Flores";
        egresado.edad = 21;
        egresado.carrera = "psicologia";

        est.info();
        System.out.println("-----------------------------");
        egresado.info();
    }
}

public class Main {
    public static void main(String[] args) {

        Estudiante est = new Estudiante();
        
        est.nombre = "Jose";
        est.apellido = "Suarez";
        est.edad = 21;
        est.carrera = "medicina";

        est.info();
    }
}

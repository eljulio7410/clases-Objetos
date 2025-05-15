public class Estudiante {
    String tipo;
    String nombre;
    String apellido;
    int edad;
    String carrera;

    public void info(){
        System.out.println("tipo = " + this.tipo);
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
        System.out.println("edad = " + this.edad);
        System.out.println("carrera = " + this.carrera);
    }


}


public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 25);
        persona1.setEsActivo(false);
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Es estudiante: " + persona1.isEsActivo());

        Estudiante estudiante1 = new Estudiante("Maria", 20, "Universidad XYZ");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Es estudiante: " + estudiante1.isEsActivo());
        System.out.println("Universidad: " + estudiante1.getUniversidad());
        
        Docente docente1 = new Docente("Fernando", 28, "Los andes", "Aplicaciones moviles");
        System.out.println("Nombre: " + docente1.getNombre());
        System.out.println("Edad: " + docente1.getEdad());
        System.out.println("Es estudiante: " + docente1.isEsActivo());
        System.out.println("Universidad: " + docente1.getUniversidad());
        System.out.println("Materia: " + docente1.getMateria());
    }
}





public class Estudiante extends Persona{
    private String universidad;

    public Estudiante(String nombre, int edad, String universidad) {
        super(nombre, edad);
        this.universidad = universidad;
        setEsActivo(true);
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
}

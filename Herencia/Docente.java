public class Docente extends Persona{
    private String universidad;
    private String materia;

    public Docente(String nombre, int edad, String universidad, String materias) {
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

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }
}
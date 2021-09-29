package ejerciciouniversidad;

public class Alumno extends Persona {
    private String carrera;
    private int semestre;

    public Alumno(int id, String nombres, String apellidoPaterno,
            String apellidoMaterno, int edad, String carrera, int semestre) {
        super(id, nombres, apellidoPaterno, apellidoMaterno, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Carrera: %s\n"
                + "Semestre: %d\n",
                carrera,
                semestre);
    }
    
}

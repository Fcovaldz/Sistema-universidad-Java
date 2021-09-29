package ejerciciouniversidad;

public class Persona {
    protected final int id;
    protected final String nombres;
    protected final String apellidoPaterno;
    protected final String apellidoMaterno;
    protected int edad;

    public Persona(int id, String nombres, String apellidoPaterno,
            String apellidoMaterno, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return String.format(
                "Id: %s\n"
                + "Nombre(s): %s\n"
                + "Apellido paterno: %s\n"
                + "Apellido materno: %s\n"
                + "Edad: %d\n",
                id, nombres,
                apellidoPaterno,
                apellidoMaterno,
                edad);
    }
}

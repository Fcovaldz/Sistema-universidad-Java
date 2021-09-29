package ejerciciouniversidad;

public class Empleado extends Persona {
    protected String departamento;

    public Empleado(int id, String nombres, String apellidoPaterno,
            String apellidoMaterno, int edad, String departamento) {
        super(id, nombres, apellidoPaterno, apellidoMaterno, edad);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Departamento: %s\n", departamento);
    }
}

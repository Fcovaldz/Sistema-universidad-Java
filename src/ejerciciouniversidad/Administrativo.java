package ejerciciouniversidad;

public class Administrativo extends Empleado {
    private double salario;

    public Administrativo(int id, String nombres, String apellidoPaterno,
            String apellidoMaterno, int edad, String departamento,
            double salario) {
        super(id, nombres, apellidoPaterno, apellidoMaterno, edad, departamento);
        this.salario = salario;
    }

    public double ingresos() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format("Ingresos: %.2f\n", salario);
    }
}

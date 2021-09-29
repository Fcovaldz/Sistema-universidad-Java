package ejerciciouniversidad;

public class Docente extends Empleado {
    private static double tarifaPorHora = 155.0;
    private int horasTrabajadas;

    public Docente(int id, String nombres, String apellidoPaterno,
            String apellidoMaterno, int edad, String departamento,
            int horasTrabajadas) {
        super(id, nombres, apellidoPaterno, apellidoMaterno, edad, departamento);
        this.horasTrabajadas = horasTrabajadas;
    }

    public static double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public static void setTarifaPorHora(double tarifaPorHora) {
        Docente.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double ingresos() {
        return horasTrabajadas * tarifaPorHora;
    }
    
    @Override
    public String toString() {
        return super.toString() + String.format(
                "Tarifa por hora: %.2f\n"
                + "Horas trabajadas: %d\n"
                + "Ingresos: %.2f\n",
                tarifaPorHora,
                horasTrabajadas,
                ingresos());
    }
}

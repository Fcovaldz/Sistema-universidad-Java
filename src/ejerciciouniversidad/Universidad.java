package ejerciciouniversidad;

import java.util.Scanner;

public class Universidad {
    private int contadorPersonal;
    private final Persona[] personal;
    
    public Universidad(int cantidadMaximaPersonal) {
        contadorPersonal = 0;
        personal = new Persona[cantidadMaximaPersonal];
    }
    
    public void altaPersonal(int tipo) {
        if (contadorPersonal == personal.length) {
            System.out.println("La universidad ha alcanzado su limite de personal!!");
            return;
        }
        
        Persona persona;
        switch (tipo) {
            case 1:
                persona = capturaDocente();
                break;
            case 2:
                persona = capturaAdministrativo();
                break;
            default:
                persona = capturaAlumno();
                break;
        }
        
        personal[contadorPersonal - 1] = persona;
        
        System.out.printf("Personal dado de alta, su id es: %d\n", contadorPersonal);
    }
    
    public void listarPersonal() {
        System.out.println("** LISTADO DE PERSONAL **");
        for (Persona p : personal)
            System.out.println(p);
    }
    
    public void listarDocentes() {
        System.out.println("** LISTADO DE DOCENTES **");
        for (Persona p : personal) {
            if (p instanceof Docente)
                System.out.println(p);
        }
    }
    
    public void listarAdministrativos() {
        System.out.println("** LISTADO DE ADMINISTRATIVOS **");
        for (Persona p : personal) {
            if (p instanceof Administrativo)
                System.out.println(p);
        }
    }
    
    public void listarAlumnos() {
        System.out.println("** LISTADO DE ALUMNOS **");
        for (Persona p : personal) {
            if (p instanceof Alumno)
                System.out.println(p);
        }
    }
    
    public void mostrarPersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el id: ");
        Persona p = personal[sc.nextInt() - 1];
        
        System.out.println(p);
    }
    
    private Docente capturaDocente() {
        String nombres, apellidoPaterno, apellidoMaterno, departamento;
        int edad, horasTrabajadas;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre(s): ");
        nombres = sc.nextLine();
        System.out.print("Introduzca el apellido paterno: ");
        apellidoPaterno = sc.nextLine();
        System.out.print("Introduzca el apellido materno: ");
        apellidoMaterno = sc.nextLine();
        System.out.print("Introduzca la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el departamento: ");
        departamento = sc.nextLine();
        System.out.print("Introduzca las horas trabajadas: ");
        horasTrabajadas = sc.nextInt();
        
        return new Docente(++contadorPersonal, nombres, apellidoPaterno,
                apellidoMaterno, edad, departamento, horasTrabajadas);
    }
    
    private Administrativo capturaAdministrativo() {
        String nombres, apellidoPaterno, apellidoMaterno, departamento;
        int edad;
        double salario;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre(s): ");
        nombres = sc.nextLine();
        System.out.print("Introduzca el apellido paterno: ");
        apellidoPaterno = sc.nextLine();
        System.out.print("Introduzca el apellido materno: ");
        apellidoMaterno = sc.nextLine();
        System.out.print("Introduzca la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca el departamento: ");
        departamento = sc.nextLine();
        System.out.print("Introduzca el salario: ");
        salario = sc.nextDouble();
        
        return new Administrativo(++contadorPersonal, nombres, apellidoPaterno,
                apellidoMaterno, edad, departamento, salario);
    }
    
    private Alumno capturaAlumno() {
        String nombres, apellidoPaterno, apellidoMaterno, carrera;
        int edad, semestre;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre(s): ");
        nombres = sc.nextLine();
        System.out.print("Introduzca el apellido paterno: ");
        apellidoPaterno = sc.nextLine();
        System.out.print("Introduzca el apellido materno: ");
        apellidoMaterno = sc.nextLine();
        System.out.print("Introduzca la edad: ");
        edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Introduzca la carrera: ");
        carrera = sc.nextLine();
        System.out.print("Introduzca el semestre: ");
        semestre = sc.nextInt();
        
        return new Alumno(++contadorPersonal, nombres, apellidoPaterno,
                apellidoMaterno, edad, carrera, semestre);
    }
}

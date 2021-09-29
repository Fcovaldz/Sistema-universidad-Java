package ejerciciouniversidad;

import java.util.Scanner;

/*
Escriba una jerarquia de herencia para las clases Persona, Empleado, Alumno,
Docente y Administrativo de una universidad. Cree un sistema que permita llevar
un registro de todo el personal de la universidad, este sistema debera permitir
dar de alta y consultar su información general y por tipo.
*/

public class EjercicioUniversidad {

    public static void main(String[] args) {
        int opc;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca la cantidad maxima de personal: ");
        Universidad universidad = new Universidad(sc.nextInt());
        
        do {
            System.out.println("** MENU **");
            System.out.println("1......Alta Docente");
            System.out.println("2......Alta Administrativo");
            System.out.println("3......Alta Alumno");
            System.out.println("4......Listar Docentes");
            System.out.println("5......Listar Administrativos");
            System.out.println("6......Listar Alumnos");
            System.out.println("7......Listar Todo El Personal");
            System.out.println("8......Listar Personal");
            System.out.println("9......Salir");
            System.out.print("Introduzca la opcion que desea ejecutar: ");
            opc = sc.nextInt();
            
            switch (opc) {
                case 1:
                case 2:
                case 3:
                    universidad.altaPersonal(opc);
                    break;
                    
                case 4:
                    universidad.listarDocentes();
                    break;
                    
                case 5:
                    universidad.listarAdministrativos();
                    break;
                    
                case 6:
                    universidad.listarAlumnos();
                    break;
                    
                case 7:
                    universidad.listarPersonal();
                    break;
                    
                case 8:
                    universidad.mostrarPersona();
                    break;
                    
                case 9:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida!!");
                    break;
            }
        } while (opc != 9);
        
        
    }

}

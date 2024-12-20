package Vectores;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Principal registro = new Principal();



        while (true) {

            System.out.println("MENU");
            System.out.println("1. Agregar cliente");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");

            int opcion = scanner.nextInt();
            scanner.nextLine();


            if (opcion == 1) {
                for (int i = 0; i < 3; i++){
                    System.out.println("Ingrese su cedula");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese su nombre");
                    String nombre = scanner.nextLine();

                    // llama a la funcion para agregar cliente
                    registro.agregarCliente(cedula, nombre);

                }


            } else if (opcion == 2) {
                registro.mostrarCliente();


            } else if (opcion == 3) {
                System.out.println("Salir");
                break;


            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }


        }
        scanner.close();

    }


}

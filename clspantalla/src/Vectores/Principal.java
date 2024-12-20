package Vectores;

public class Principal {

    //Arreglo
    int[] cedula = new int[3];
    String[] nombre = new String[3];

    //contador
    int totalingresos = 0;

    public void agregarCliente(int cedula, String nombre) {


        if (totalingresos < 3) {
            this.cedula[totalingresos] = cedula;
            this.nombre[totalingresos] = nombre;
            totalingresos++;   //contador +1

            System.out.println("Cliente agregado");


        } else {
            System.out.println("No se puede agregar mas informacion");
        }

    }


    public void mostrarCliente() {

        if (totalingresos == 0) {
            System.out.println("No hay mas clientes ");


        } else {

            for (int i = 0; i < totalingresos; i++) {
                System.out.println("cedula: " + cedula[i] + "nombre: " + nombre[i]);
            }


        }


    }
}
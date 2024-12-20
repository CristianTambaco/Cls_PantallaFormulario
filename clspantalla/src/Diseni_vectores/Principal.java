package Diseni_vectores;

import javax.swing.*;

public class Principal {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

            public void run() {

                //Crear una instancia del formulario
                Formulario formulario = new Formulario();

                //Establecer propiedades de la ventana
                formulario.setTitle("Formulario de Registro de Clientes");
                formulario.setSize(400,300);
                formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Hacer visible el formulario
                formulario.setVisible(true);

            }
        });
    }
}

package Practicas;

import javax.swing.*;

public class Acceso_contraseña {
    public static void main(String[] args) {


        String predefinida = JOptionPane.showInputDialog("Introduce nueva contraseña");
        String password = "";


        while (password.equals(predefinida)==false){

            password = JOptionPane.showInputDialog("introduce la contraseña");

            if (password.equals(predefinida)==false){

                System.out.println("Acceso denegado ingrese de nuevo la contraseña");
            }

        }

        System.out.println("Contraseña correcta");
    }


}

package Practicas.constantes.Estructuras;

import javax.swing.*;

public class comprueba_mail {
    public static void main(String[] args) {

        int arroba = 0;
        boolean punto = false;

        String mail = JOptionPane.showInputDialog("Introduce mail");

        for (int i = 0; i < mail.length(); i++) {

            if (mail.charAt(i) == '@') {
                arroba++;
            }
            if (mail.charAt(i)=='.'){
                punto=true;
            }

        }
        if (arroba==1 && punto==true){
            System.out.println("Aceptado");
        }else {
            System.out.println("Denengado");
        }
    }
}

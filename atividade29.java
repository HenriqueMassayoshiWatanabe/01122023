package exJ2;
import java.util.*;
public class atividade29 {
    public static void main(String[] args) {
         String[] cursos = {"Java","JavaScript","JavaFX","JavaX","","Javé"};
         int segundoContando = 5;
        for (short c = 1; c <= segundoContando; c++){
     
        try {
                System.out.println("Contando... Foram " + c + " segundos.");
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Ops! o contador falhour. Erro: " + e);
            }
        }

        System.out.println("Os cursos são:");

        for (short n = 0; n < cursos.length; n++) {
            System.out.println(cursos[n]);
        }
    }
}

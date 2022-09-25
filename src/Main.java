import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variables
        int edad;
        String nombreConsola;
        int cambioParaGit;

        Scanner EscaneadorInt = new Scanner(System.in);
        Scanner EscaneadorChar = new Scanner(System.in);



        System.out.println("Hola como te llamas: ");
        nombreConsola = EscaneadorChar.next();

        System.out.println("\nCual es tu edad: ");
        edad = EscaneadorInt.nextInt();

        System.out.println("\nBienvenido/a " +nombreConsola +" su edad es " +edad);

    }//main
}//class main
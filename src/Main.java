import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int choice;
        int numero;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("Ingrese (1) para tirar dado, otro para salir: ");
            choice = scanner.nextInt();
            if(choice==1){
                numero = random.nextInt(1,7);
                mostrarDado(numero);
            }else{
                break;
            }
        }
        System.out.println("-----------\nExiting....\n-----------");
        scanner.close();
    }

    static void mostrarDado(int numero){
        switch (numero){
            case 1 -> System.out.println("""
                                         ╔═══════════╗
                                         ║           ║
                                         ║     O     ║
                                         ║           ║
                                         ╚═══════════╝
                                         """);
            case 2 -> System.out.println("""
                                         ╔═══════════╗
                                         ║         O ║
                                         ║           ║
                                         ║ O         ║
                                         ╚═══════════╝
                                         """);
            case 3 -> System.out.println("""
                                         ╔═══════════╗
                                         ║         O ║
                                         ║     O     ║
                                         ║ O         ║
                                         ╚═══════════╝
                                         """);
            case 4 -> System.out.println("""
                                         ╔═══════════╗
                                         ║ O       O ║
                                         ║           ║
                                         ║ O       O ║
                                         ╚═══════════╝
                                         """);
            case 5 -> System.out.println("""
                                         ╔═══════════╗
                                         ║ O       O ║
                                         ║     O     ║
                                         ║ O       O ║
                                         ╚═══════════╝
                                         """);
            case 6 -> System.out.println("""
                                         ╔═══════════╗
                                         ║ O   O   O ║
                                         ║           ║
                                         ║ O   O   O ║
                                         ╚═══════════╝
                                         """);
        }
    }
}
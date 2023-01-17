import java.util.Scanner;

public class ExercicioFatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" Fatorial: ");
        int numero = scan.nextInt();

        int multiplicao = 1;

        System.out.println(numero + "! = ");
        for(int i = numero ; i >= 1; i --){
        multiplicao = multiplicao * i;
        }
        System.out.println(multiplicao);
    }
}

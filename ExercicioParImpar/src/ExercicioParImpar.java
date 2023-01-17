import java.util.Scanner;

public class ExercicioParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int count = 0;
        int numero;
        int quantidadeDePares = 0;
        int quantidadeDeImparas = 0;

        System.out.println("Quantidade de numeros: ");
        quantidadeNumeros = scan.nextInt();

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            count++;

        if (numero % 2 == 0) quantidadeDePares++;
            else quantidadeDeImparas++;

        }while (count < quantidadeNumeros);

        System.out.println("Quantidade Par: " + quantidadeDePares);
        System.out.println("Quantidade Ímpar: " + quantidadeDeImparas);
        
    }
}

import java.util.Scanner;

public class lista01_exercicio03 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero1 = input.nextInt();

        System.out.println("Digite um numero: ");
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;

        System.out.println("A soma dos numeros é:" + soma);
    }
}

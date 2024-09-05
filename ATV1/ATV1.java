import java.util.Scanner;

public class ATV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Os números digitados foram: " + numero1 + " e " + numero2);

        scanner.close();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv07;
import java.util.Scanner;
/**
 *
 * @author uepa
 */
public class Atv07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo as dimensões da caixa
        System.out.print("Digite o comprimento da caixa: ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura da caixa: ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura da caixa: ");
        double altura = scanner.nextDouble();

        // Calculando o volume
        double volume = comprimento * largura * altura;

        // Imprimindo o resultado
        System.out.println("O volume da caixa é: " + volume);

        scanner.close();
    }
}
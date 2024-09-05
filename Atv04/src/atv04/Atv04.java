/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv04;

import java.util.Scanner;

/**
 *
 * @author uepa
 */

public class Atv04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número com três casas decimais: ");
        double numero = scanner.nextDouble();

        // Convertendo para inteiro e isolando a parte inteira
        int numeroInteiro = (int) numero;

        // Obtendo o algarismo das dezenas
        int dezena = (numeroInteiro / 10) % 10;

        System.out.println("O algarismo das dezenas é: " + dezena);

        scanner.close();
    }
}
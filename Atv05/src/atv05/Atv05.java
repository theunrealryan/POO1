/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv05;
import java.util.Scanner;

/**
 *
 * @author uepa
 */
public class Atv05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Convertendo Celsius para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");

        scanner.close();
    }
}
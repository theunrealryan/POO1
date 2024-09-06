/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv08;

import java.util.Scanner;
/**
 *
 * @author ryan
 */
public class Atv08 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o cateto oposto: ");
        double catetoOposto = scanner.nextDouble();

        System.out.print("Digite o cateto adjacente: ");
        double catetoAdjacente = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2));

        System.out.println("A hipotenusa é: " + hipotenusa);
    }
    
    
    
}
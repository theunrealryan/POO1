//author: Ryan Ricardo de Souza

package atv08;
import java.util.Scanner;

public class Atv08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // Entrada de dados do triângulo retângulo (cateto oposto e adjacente)
        System.out.print("Digite o cateto oposto: ");
        double catetoOposto = scanner.nextDouble();
        while (catetoOposto <= 0) {
            System.out.println("O cateto oposto deve ser positivo. Tente novamente:");
            catetoOposto = scanner.nextDouble();
        }

        System.out.print("Digite o cateto adjacente: ");
        double catetoAdjacente = scanner.nextDouble();
        while (catetoAdjacente <= 0) {
            System.out.println("O cateto adjacente deve ser positivo. Tente novamente:");
            catetoAdjacente = scanner.nextDouble();
        }


        // Calculando a hipotenusa
        double hipotenusa = Math.sqrt(Math.pow(catetoOposto, 2) + Math.pow(catetoAdjacente, 2)); //método Math.sqrt (raiz quadrada) e Math.pow (potenciação)

        // Entreada de dados trigonométricos
        System.out.print("Digite um ângulo em radianos: ");
        double anguloRadianos = scanner.nextDouble();
        while (anguloRadianos < 0 || anguloRadianos > 2 * Math.PI) {
            System.out.println("Ângulo inválido. Deve estar entre 0 e 2π. Tente novamente:");
            anguloRadianos = scanner.nextDouble();
        }
        
        // Calculando de radianos para seno, cosseno e tangente
        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);

        // Imprimindo os resultados
        System.out.println("Hipotenusa: " + hipotenusa);
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
    }
}

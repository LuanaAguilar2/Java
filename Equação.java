//Equação
package Atividade3;

import java.util.Scanner;

public class Equacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Informe os coeficientes da equação ax^2 + bx + c = 0:");
            System.out.print("a: ");
            double a = scanner.nextDouble();
            System.out.print("b: ");
            double b = scanner.nextDouble();
            System.out.print("c: ");
            double c = scanner.nextDouble();
            if (a == 0 && b == 0 && c != 0) 
            {
                System.out.println("Coeficientes informados incorretamente.");
            } 
            else if (c == 0) 
            {
                System.out.println("Igualdade confirmada: 0 = 0");
            } 
            else if (a == 0 && b != 0) 
            {
                System.out.println("Esta é uma equação de primeiro grau.");
                double raiz = -c / b;
                System.out.println("Raiz real da equação: " + raiz);
            } 
            else 
            {
                double delta=b*b-4*a* c;
                if (delta < 0) 
                {
                    System.out.println("Esta equação não possui raízes reais.");
                } 
                else if (delta == 0)
                {
                    System.out.println("Esta equação possui duas raízes reais iguais.");
                    double raiz = -b / (2 * a);
                    System.out.println("Raiz real da equação: " + raiz);
                } 
                else 
                {
                    System.out.println("Esta equação possui duas raízes reais diferentes.");
                    double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
                    System.out.println("Raiz real 1 da equação: " + raiz1);
                    System.out.println("Raiz real 2 da equação: " + raiz2);
                }
            }
            System.out.println("Deseja calcular outra equação? (sim/não)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("sim")) 
            {
                break;
            }
        }
        scanner.close();
    }
}

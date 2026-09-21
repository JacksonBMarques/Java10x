package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha um personagem: ");
        System.out.println(" 1 - NARUTO ");
        System.out.println(" 2 - SASUKE ");
        System.out.println(" 3 - SAKURA ");

        int escolhaDoUsusario = scanner.nextInt();

        System.out.println("Você digitou o número: " + escolhaDoUsusario);

        switch (escolhaDoUsusario) {
            case 1:
                System.out.println("O usuário escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu Sasuke Uchiha");
                break;
            case 3:
            System.out.println("O usuário escolheu Sakura Haruno");
            break;

            default:
                System.out.println("resposta inválida");

        }

        scanner.close();
    }
}

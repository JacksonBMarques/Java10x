package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        //Abrir Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        //Receber nome
        System.out.println("Escreva aqui o nome do Ninja: ");
        String nomeDoNinja =  caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        //Receber Idade
        System.out.println("Escreva aqui a idade no Ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " Anos");

        //Tratamento de dados
        if (idadeDoNinja >=18){
            System.out.println("Esse ninja pode fazer missões fora da vila");
        }else {
            System.out.println("Esse ninja é muito novo ainda, precisa terinar mais antes de sair da Vila");
        }

        //Fechar Scanner
        caixaDeTexto.close();

    }

}

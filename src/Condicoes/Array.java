package Condicoes;

public class Array {
    public static void main(String[] args) {

        String[] ninja = new String[6];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata hyuuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[4]);
// redeclarar array
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Kakashi Hatake";
        ninja[5] = "Tsunade Senju";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[4]);

        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade[0]);
        System.out.println(idade[1]);

        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        String nomeDoNinja1 = "Gaara do deserto";
        String nomeDoNinja2 = "Rock Lee";

        String ninja1 = "Naruto Uzumaki";
        String ninja2 = "Sasuke Uchiha";
        String ninja3 = "Sakura Haruno";
        System.out.println(ninja1);
        System.out.println(ninja2);
        System.out.println(ninja3);
    }


}

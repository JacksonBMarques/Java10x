package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

       /* while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("o Naruto Fez "+ numeroDeClones +" Clone");

            if (numeroDeClones > numeroMaximoDeClones){
                System.out.println("o naruto gatou todo o chakra e morreu");
            }
        }*/

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("o Naruto Fez "+ i +" Clone");
            if (i >= numeroMaximoDeClones){
                System.out.println("o naruto gastou todo o chakra e morreu");
            }
        }

    }
}

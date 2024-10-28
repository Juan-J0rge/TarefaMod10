package PastaTarefas;

import java.util.Scanner;

public class TrfNota {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Insira as 4 notas: ");
            int nota1 = s.nextInt();
            int nota2 = s.nextInt();
            int nota3 = s.nextInt();
            int nota4 = s.nextInt();

            int juncao = nota1 + nota2 + nota3 + nota4;

            double media = juncao/4.0;

            System.out.println("Sua media é: " + media);

            if (media >= 7) {
                System.out.println("Você estaaprovado!");
            } else if (media >= 5 && media <= 7) {
                System.out.println("Você esta de recuperação");
            } else {
                System.out.println("Você esta reprovado");
            }

            System.out.println("Deseja ver novamente a media?(SIM/NÃO?)");

            resposta = s.next();

        } while (resposta.equalsIgnoreCase("SIM"));

        s.close();
    }
}

package estrutura_if;

import java.util.Scanner;

public class ternario {
    public static void main(String[] args) {

        /* condição ternaria
         * if ternário: condicao ? expressao 1 : expressao 2;
         * if = ?, else = :
         * */

        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        /* if (idade >= 18){
         System.out.println("você pode assistir o filme")
        } else{
         System.out.println("você não pode assistir o filme")
        }
       */

        String mensagem = (idade >= 18) ? "Você pode assistir o filme" : "Você não tem idade pra ver esse filme";

        scanner.close();
    }
}

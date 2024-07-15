package estrutura_if;

import java.util.Scanner;

public class checadorIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade:");
        idade = scanner.nextInt();

        /*condição if*/
        if (idade >= 18){
            System.out.println("Você pode assistir o filme");
        }
        /*condição else*/
        else{
            System.out.println("Você não tem idade pra ver esse filme");
        }

        scanner.close();
    }
}

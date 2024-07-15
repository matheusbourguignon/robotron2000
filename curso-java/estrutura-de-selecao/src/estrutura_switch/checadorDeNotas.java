package estrutura_switch;

import java.io.Console;

public class checadorDeNotas {
    public static void main(String[] args) {
        Console console = System.console();

        String nota;

        System.out.println("Informe a nota(A,B,C,D): ");
        nota = console.readLine();

        switch (nota) {

            case "A":
                System.out.println("Nota maxima");
                break;
            case "B":
                System.out.println("Nota excelente");
                break;
            case "C":
                System.out.println("Nota na media");
                break;
            case "D":
                System.out.println("Nota baixa");
                break;
            case "F":
                System.out.println("Você ficou em recuperação");
            default:
                System.out.println("Fim de semestre");

        }
    }
}

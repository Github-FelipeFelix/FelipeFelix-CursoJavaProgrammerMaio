import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner entradaDeDados = new Scanner(System.in);

        String nome;
        String idade;
        String esporte;
        String respostaEspecifica;

        System.out.println("Digite o nome do atleta:");
        nome = entradaDeDados.nextLine();

        System.out.println("Digite a idade do atleta:");
        idade = entradaDeDados.nextLine();

        System.out.println("Você pratica futebol ou vôlei?");
        esporte = entradaDeDados.nextLine();

        if (esporte.equalsIgnoreCase("futebol")) {
            System.out.println("Qual é a sua perna mais forte?");
            respostaEspecifica = entradaDeDados.nextLine();
            System.out.println("O jogador de futebol " + nome + ", com idade " + idade + ", tem a perna mais forte: " + respostaEspecifica);
        } else if (esporte.equalsIgnoreCase("volei")) {
            System.out.println("Qual é o seu braço mais forte?");
            respostaEspecifica = entradaDeDados.nextLine();
            System.out.println("O jogador de vôlei " + nome + ", com idade " + idade + ", tem o braço mais forte: " + respostaEspecifica);
        } else {
            System.out.println("Esporte não reconhecido.");
        }

        entradaDeDados.close();
    }
}

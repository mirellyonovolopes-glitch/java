import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Cria o Scanner para ler o que o usuário digitar
        Scanner leitor = new Scanner(System.in);

        // Cria um vetor que pode guardar 5 alunos
        Aluno[] alunos = new Aluno[5];

        // Repetição para cadastrar os 5 alunos
        for (int i = 0; i < alunos.length; i++) {

            // Cria um novo objeto Aluno
            alunos[i] = new Aluno();

            // Pede o nome do aluno
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            alunos[i].nome = leitor.nextLine();

            // Pede a idade do aluno
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            alunos[i].idade = leitor.nextInt();

            // Limpa o Enter que ficou no Scanner
            leitor.nextLine();
        }

        // Mostra o título
        System.out.println();
        System.out.println("----- Alunos Cadastrados -----");

        // Percorre o vetor e mostra os alunos
        for (int i = 0; i < alunos.length; i++) {

            // Chama o método apresentar()
            alunos[i].apresentar();
        }

        // Fecha o Scanner
        leitor.close();
    }
}


// Classe que representa um aluno
class Aluno {

    // Atributos do aluno
    String nome;
    int idade;

    // Método responsável por mostrar os dados do aluno
    public void apresentar() {

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("-------------------------");
    }
}

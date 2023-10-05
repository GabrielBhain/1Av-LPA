// Este algoritmo pode ser melhorado adicionando tratamento de erros e oriientando ele a objetos
// Mas como isso não foi proposto para a avaliação optei por deixa-lo mais simples
// Basta não informar caracteres nas atribuições das int e double
package av1;

import java.util.Scanner;

public class Av1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variáveis para o resumo da turma
        int totalTurma = 0;
        double somaMediasTurma = 0;

        System.out.println("Informe o nome da turma:");
        String nomeTurma = scanner.nextLine();

        System.out.println("Informe o número de disciplinas:");
        int numDisciplinas = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Loop para cada disciplina
        for (int disciplina = 1; disciplina <= numDisciplinas; disciplina++) {
            // Variáveis para o resumo da disciplina
            int totalDisciplina = 0;
            double somaMediasDisciplina = 0;
            double maiorMediaDisciplina = -1;
            double menorMediaDisciplina = 11;
            int reprovados = 0;
            int aguardandoFinal = 0;
            int aprovados = 0;

            System.out.println("Informe o nome da disciplina " + disciplina + ":");
            String nomeDisciplina = scanner.nextLine();

            System.out.println("Informe o número de alunos na disciplina " + disciplina + ":");
            int numAlunos = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            // Loop para cada aluno na disciplina
            for (int aluno = 1; aluno <= numAlunos; aluno++) {
                System.out.println("Informe as notas do aluno " + aluno + " na disciplina " + disciplina + ":");
                double nota1 = scanner.nextDouble();
                double nota2 = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha

                // Calcule a média do aluno
                double mediaAluno = (nota1 + nota2) / 2;

                // Atualize as variáveis da disciplina
                totalDisciplina++;
                somaMediasDisciplina += mediaAluno;

                if (mediaAluno < 4) {
                    reprovados++;
                } else if (mediaAluno >= 4 && mediaAluno < 7) {
                    aguardandoFinal++;
                } else {
                    aprovados++;
                }

                if (mediaAluno > maiorMediaDisciplina) {
                    maiorMediaDisciplina = mediaAluno;
                }

                if (mediaAluno < menorMediaDisciplina) {
                    menorMediaDisciplina = mediaAluno;
                }
            }

            // Calcule a média da disciplina
            double mediaDisciplina = somaMediasDisciplina / totalDisciplina;

            // Atualize as variáveis da turma
            totalTurma++;
            somaMediasTurma += mediaDisciplina;

            // Imprima o resumo da disciplina
            System.out.println("--------------------------------");
            System.out.println("Resumo da disciplina");
            System.out.println("Disciplina: " + nomeDisciplina);
            System.out.println("Quantidade de alunos: " + totalDisciplina);
            System.out.println("Média geral: " + mediaDisciplina);
            System.out.println("Maior média: " + maiorMediaDisciplina);
            System.out.println("Menor média: " + menorMediaDisciplina);
            System.out.println("Quantidade de alunos reprovados: " + reprovados);
            System.out.println("Quantidade de alunos na final: " + aguardandoFinal);
            System.out.println("Quantidade de alnos aprovados: " + aprovados);
            System.out.println("--------------------------------");
        }

        // Calcule a média geral da turma
        double mediaGeralTurma = somaMediasTurma / totalTurma;

        // Imprima o resumo da turma
        System.out.println("--------------------------------");
        System.out.println("Resumo da turma");
        System.out.println("Turma: " + nomeTurma);
        System.out.println("Quantidade de disciplinas: " + totalTurma);
        System.out.println("Média geral da turma: " + mediaGeralTurma);
        System.out.println("--------------------------------");

        scanner.close();
    }
}
public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Camille", "Felipe", "Gabriel", "Júlia", "Marcos" };

        // for (int i = 0; i < alunos.length; i++) {
        // System.out.println("O aluno no indice x = " + (i + 1) + " é " + alunos[i]);
        // }

        for (String aluno : alunos) {
            System.out.println("O nome do aluno é: " + aluno);
        }
    }
}

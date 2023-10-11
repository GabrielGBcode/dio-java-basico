public class ResultadoEscolarV3 {
    public static void main(String[] args) {
        int nota = 6;
        String res = nota >= 7 ? "Aprovado!" : nota >= 5 && nota < 7 ? "Recuperação!" : "Reprovado!";
        System.out.println(res);
    }
}

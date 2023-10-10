public class Operadores {
    public static void main(String[] args) {

        System.out.println("Concatenação");
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // 13

        // Operadores Unários

        System.out.println("Unários");

        int num = 5;
        System.out.println(num);

        num = -num;
        System.out.println(num);

        num = num * -1;
        System.out.println(num);

        // Operadores de Repetições

        System.out.println("Repetições");

        num++; // 6
        System.out.println(++num); // 7

        num--; // 6
        System.out.println(--num); // 5

        boolean variavel = true;
        System.out.println(!variavel); // false

        // Operador Ternário

        int a, b;
        a = 5;
        b = 3;

        // String res = "";

        // if (a == b) {
        // res = "Verdadeiro";
        // } else {
        // res = "Falso";
        // }

        String res = a == b ? "verdadeiro" : "falso";

        System.out.println(res);

        // Operadores Relacionais

        int num1 = 1;
        int num2 = 2;

        boolean simNao = num1 == num2;

        System.out.println("NúmeroUm é igual a numeroDois? " + simNao);

        simNao = num1 != num2;

        System.out.println("NúmeroUm é igual a numeroDois? " + simNao);

        // Operadores Lógicos

        boolean cond1 = true;
        boolean cond2 = true;

        if (cond1 && cond2) {
            System.out.println("Ok");
        } else if (cond1 || cond2) {
            System.out.println("Quase ok");
        } else {
            System.out.println("Nada ok");
        }
    }
}

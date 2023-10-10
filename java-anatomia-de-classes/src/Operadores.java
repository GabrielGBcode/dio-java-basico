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

        // Unários
        System.out.println("Unários");

        int num = 5;
        System.out.println(num);

        num = -num;
        System.out.println(num);

        num = num * -1;
        System.out.println(num);

        // Repetições

        System.out.println("Repetições");

        num++; // 6
        System.out.println(++num); // 7

        num--; // 6
        System.out.println(--num); // 5

        boolean variavel = true;
        System.out.println(!variavel); // false

    }
}

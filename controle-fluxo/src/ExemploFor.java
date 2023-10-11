import java.util.Random;

public class ExemploFor {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(21);
        System.out.println("Vamos contar carneirinhos??");
        for (int c = 1; c <= (num); c++) {
            System.out.println("Carneirinhos: " + c);
        }
        System.out.println("Dormiu...");

    }
}

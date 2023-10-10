public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal atual: " + smartTV.canal);
        System.out.println("Volume: " + smartTV.volume);

        System.out.println("===============================");

        smartTV.ligar();
        System.out.println("Novo Status: TV ligada? " + smartTV.ligada);

        smartTV.desligar();
        System.out.println("Novo Status: TV ligada? " + smartTV.ligada);

        System.out.println("===============================");

        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume: " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("Volume: " + smartTV.volume);

        System.out.println("===============================");

        smartTV.passarCanal();
        System.out.println("O canal atual é: " + smartTV.canal);
        smartTV.mudarDeCanal(42);
        System.out.println("O canal atual é: " + smartTV.canal);
        smartTV.voltarCanal();
        System.out.println("O canal atual é: " + smartTV.canal);

    }
}

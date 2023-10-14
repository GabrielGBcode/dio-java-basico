package Veiculos;

public class Carro extends Veiculo {

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("VRUMM VRUUUUUMM!");
    }

    private void confereCombustivel() {
        System.out.println("Combustível ok!");

    }

    private void confereCambio() {
        System.out.println("Câmbio no lugar!");

    }
}

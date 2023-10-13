package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("123.456.789.00", "Marcos");

        marcos.setEndereco("Jalam Borrola");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf());
    }
}

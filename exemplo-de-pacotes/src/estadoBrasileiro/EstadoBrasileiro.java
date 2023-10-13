package estadoBrasileiro;

public enum EstadoBrasileiro {
    MARANHAO("MA", "Maranhão", 21),
    PIAUI("PI", "Piauí", 22),
    CEARA("CE", "Ceará", 23),
    MINAS_GERAIS("MG", "Minas Gerais", 31),
    ESPIRITO_SANTO("ES", "Espírito Santo", 32),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 33),
    SAO_PAULO("SP", "São Paulo", 35);

    private String nome;
    private String sigla;
    private int ibge;

    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}

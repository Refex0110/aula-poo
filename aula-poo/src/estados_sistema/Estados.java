package estados_sistema;
public enum Estados {
    //criando um objeto já definindo suas caracteristicas
    SAO_PAULO("SP", "São Paulo",11),
    RIO_JANEIRO("RJ","Rio de Janeiro",12),
    PIAUI("MA","Piauí",13),
    MARANHAO("MA","Maranhão",14),
    CEARA("CE", "Ceará",15);

    private String nome;
    private String sigla;
    private int ibge;
    //construtor
    //atributos relevantes apenas para existência
    private Estados(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }
    public int getIbge() {
        return ibge;
    }
    public String getNome() {
        return nome;
    }
    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
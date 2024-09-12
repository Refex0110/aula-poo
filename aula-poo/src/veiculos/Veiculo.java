package veiculos;
//herança
public abstract class Veiculo {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
     }
    //tudo que for veiculo precisa ligar de alguma forma
    //tem, que ligar de alguma forma, como?
    //cria o método, no entando, será diferente para cada objeto
    public abstract void ligar();
}

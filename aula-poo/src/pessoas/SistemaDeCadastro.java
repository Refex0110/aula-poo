package pessoas;
public class SistemaDeCadastro {
    public static void main(String[] args) {
        Pessoa rafael = new Pessoa
        ("123", "Rafael");

        rafael.setEndereco("Amelio Mungo");
        System.out.println(rafael.getNome() + "\n" + rafael.getCpf() + "\n");
        
    }
}

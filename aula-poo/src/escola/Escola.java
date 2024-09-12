package escola;

public class Escola {
	public static void main(String[] args) {
		Aluno rafael = new Aluno();
		/*rafael.nome = "Rafael";
		rafael.idade = 18;*/
        rafael.setNome("Rafael Padovan");
        rafael.setIdade(12);
		System.out.println(rafael.getNome() + " " + rafael.getIdade());
	}
}

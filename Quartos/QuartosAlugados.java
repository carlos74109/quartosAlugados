package Quartos;

public class QuartosAlugados {
	
	public String email;
	public String nome;
	public int quarto;
	
	
	
	
	public QuartosAlugados(String email, String nome, int quarto) {
		super();
		this.email = email;
		this.nome = nome;
		this.quarto = quarto;
	}




	@Override
	public String toString() {
	
		return "Nome: " + nome + ", Email: " + email + ", Quarto: " + quarto ;
	}
	
}

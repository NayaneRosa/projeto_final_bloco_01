package Model_Repository;

public class Doce extends Produtos {

	private String Doce = "Doce";
	public Doce (int id, int tipo, String nome, float preco) {
		super(id, tipo, nome, preco);
		this.Doce = nome;
	}
	public String getDoce() {
		return Doce;
	}
	public void setDoce(String nome) {
		this.Doce = nome;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O tipo do "+this.getTipo()+ " é "+ this.getDoce());
	}
}

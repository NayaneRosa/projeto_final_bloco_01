package Model_Repository;

public class Produtos {
	
	private int id, tipo;
	private String nome;
	private float preco;


	public Produtos(int id, int tipo, String nome, float preco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public float getPreco() {
		return preco;
	}


	public void visualizar() {
		String tipo = "";
		switch(this.tipo) {
		case 1:
			tipo = "Doce";
			break;
		case 2: 
			tipo = "Bebida";
			break;
		default:
		
		System.out.println("ID do produto: " + this.getId());
		System.out.println("Tipo do produto: "+tipo);
		System.out.println("Nome do produto: "+this.getNome());
		System.out.println("Preço do produto: "+this.getPreco());
		
		}
	}

	
		
	}


	
	

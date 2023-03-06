package projetos;

public class Pessoa {
	private int age;
	private String nome;
	private boolean doente;
	
	public void fazerAniversario() {
		this.setAge(this.age+1);
	}
	
	public void adoecer() {
		setDoente(true);
	}
	/**
	 * @return the doente
	 */
	public boolean isDoente() {
		return doente;
	}


	/**
	 * @param doente the doente to set
	 */
	public void setDoente(boolean doente) {
		this.doente = doente;
	}


	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}

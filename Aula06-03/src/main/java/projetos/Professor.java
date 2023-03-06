package projetos;

public class Professor extends Pessoa {
	private float salario;
	private int aulasARepor;
	
	public void adoecer() {
		super.adoecer();
		this.setAulasARepor(this.getAulasARepor() + 1);
	}
	
	/**
	 * @return the salario
	 */
	public float getSalario() {
		return salario;
	}
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(float salario) {
		this.salario = salario;
	}
	/**
	 * @return the descontoSalarial
	 */

	public int getAulasARepor() {
		return aulasARepor;
	}

	public void setAulasARepor(int aulasARepor) {
		this.aulasARepor = aulasARepor;
	}

	
	
}

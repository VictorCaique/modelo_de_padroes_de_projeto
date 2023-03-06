package projetos;

public class Funcionario extends Pessoa {
	private String cpf;
	private int cargaHorariaDiaria;
	private float horasTrabalhadas;
	private boolean dayOff;
	private String funcao;
	
	public void fazerAniversario() {
		super.fazerAniversario();
		setDayOff(true);
	}
	public void baterPonto() {
		setHorasTrabalhadas(getCargaHorariaDiaria()+getHorasTrabalhadas());
	}
	public float getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(float horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the cargaHorariaDiaria
	 */
	public int getCargaHorariaDiaria() {
		return cargaHorariaDiaria;
	}
	/**
	 * @param cargaHorariaDiaria the cargaHorariaDiaria to set
	 */
	public void setCargaHorariaDiaria(int cargaHorariaDiaria) {
		this.cargaHorariaDiaria = cargaHorariaDiaria;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public boolean isDayOff() {
		return dayOff;
	}
	public void setDayOff(boolean dayOff) {
		this.dayOff = dayOff;
	}
	
	
}

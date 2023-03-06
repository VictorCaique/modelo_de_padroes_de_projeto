package projetos;

public class Aluno extends Pessoa{
	private float notaMedia;
	private String grade;
	private int faltasJustificadas;
	
	
	
	public void adoecer() {
		super.adoecer();
		faltasJustificadas++;
	}
	
	/**
	 * @return the notaMedia
	 */
	public float getNotaMedia() {
		return notaMedia;
	}
	/**
	 * @param notaMedia the notaMedia to set
	 */
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/**
	 * @return the faltasJustificadas
	 */
	public int getFaltasJustificadas() {
		return faltasJustificadas;
	}
	/**
	 * @param faltasJustificadas the faltasJustificadas to set
	 */
	public void setFaltasJustificadas(int faltasJustificadas) {
		this.faltasJustificadas = faltasJustificadas;
	}
	
	
	
}

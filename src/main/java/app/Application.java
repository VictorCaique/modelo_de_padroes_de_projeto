package app;

// IMPORTANDO AS INTERFACES Button, Checkbox E GUIFactory
import button.Button;
import checkbox.Checkbox;
import factories.GUIFactory;

// DECLARANDO A CLASSE Application
public class Application {
	// DECLARANDO O ATRIBUTO PRIVADO button DO TIPO Button.
	private Button button;
	// DECLARANDO O ATRIBUTO PRIVADO checkbox DO TIPO Checkbox.
	private Checkbox checkbox;
	
	// DECLARANDO O MÉTODO CONSTRUTOR DA CLASSE PASSANDO COMO PARÂMETRO A INSTÂNCIA factory DA CLASSE GUIFactory
	public Application(GUIFactory factory) {
		// ATRIBUINDO AO ATRIBUTO button UMA NOVA INSTÂNCIA DE MacOSButton OU WindownsButton QUE RETORNARÁ DO MÉTODO createButton().
		button = factory.createButton();
		// ATRIBUINDO AO ATRIBUTO checkbox UMA NOVA INSTÂNCIA DE MacOSCheckbox OU WindownsCheckbox QUE RETORNARÁ DO MÉTODO createCheckbox().
		checkbox = factory.createCheckbox();
	}
	
	// DECLARANDO O MÉTODO paint() QUE IMPRIMIRA AS IMAGENS PRESENTES NOS MÉTODOS button.paint(); E checkbox.paint();
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}

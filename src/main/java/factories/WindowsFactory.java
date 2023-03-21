package factories;

//IMPORTANDO AS INTERFACES Button E Checkbox E AS CLASSES WindowsButton E WindowsCheckbox
import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

//DECLARANDO A CLASSE WindowsFactory QUE ESTÁ IMPLEMENTANDO A INTERFACE GUIFactory.
public class WindowsFactory implements GUIFactory {
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE WindowsButton.
	public Button createButton() {
		return new WindowsButton();
	}
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE WindowsCheckbox.
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

package factories;

// IMPORTANDO AS INTERFACES Button E Checkbox E AS CLASSES MacOSButton E MacOSCheckbox
import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

// DECLARANDO A CLASSE MacOSFactory QUE ESTÁ IMPLEMENTANDO A INTERFACE GUIFactory.
public class MacOSFactory implements GUIFactory {
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE MacOSButton.
	public Button createButton() {
		return new MacOSButton();
	}
	
	// IMPLEMENTANDO O MÉTODO createButton() FAZENDO ELE RETORNAR UMA NOVA INSTÂNCIA DA CLASSE MacOSCheckbox.
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}

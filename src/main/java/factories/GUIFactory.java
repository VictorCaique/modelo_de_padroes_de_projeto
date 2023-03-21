package factories;

// IMPORTANDO AS INTERFACES Button E Checkbox
import button.Button;
import checkbox.Checkbox;

// DECLARANDO A INTERFACE CHAMADA GUIFactory
public interface GUIFactory {
	// DECLARANDO O MÉTODO createButton() QUE RETORNARÁ UM OBJETO Button A SER IMPLEMENTADO;
	Button createButton();
	// DECLARANDO O MÉTODO createCheckbox() QUE RETORNARÁ UM OBJETO Checkbox A SER IMPLEMENTADO;
	Checkbox createCheckbox();
}

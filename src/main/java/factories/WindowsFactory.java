package factories;

import button.Button;
import button.WindowsButton;
import checkbox.Checkbox;
import checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
	public Button createButton() {
		return new WindowsButton();
	}
	
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
}

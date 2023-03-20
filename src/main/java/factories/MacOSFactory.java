package factories;

import button.Button;
import button.MacOSButton;
import checkbox.Checkbox;
import checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {
	public Button createButton() {
		return new MacOSButton();
	}
	
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}
}

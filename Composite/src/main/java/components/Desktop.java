package components;

import java.util.ArrayList;

public class Desktop extends BaseComponent {

	ArrayList<BaseComponent> comp = new ArrayList<BaseComponent>();
	private int i;
	
	public Desktop(String name, float value) {
		super(name, value);
		this.i = 0;
	}

	public Desktop(String name, ArrayList<BaseComponent> comp) {
		super(name);
		this.comp = comp;
	}
	
	public float getValue() {
		if(comp.get(0) != null) {
			return comp.get(0).getValue() + this.getValue(1);
		}else {
			return 0; 
		}
	}
	
	public float getValue(int i) {
		if(comp.size()-1 > i) {
			return comp.get(i).getValue() + this.getValue(i+1);
		}else {
			return comp.get(i).getValue(); 
		}
	}

}

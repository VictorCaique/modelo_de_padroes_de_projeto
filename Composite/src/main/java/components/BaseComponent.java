package components;

public abstract class BaseComponent {
	private String name;
	private float value;
	
	public BaseComponent(String name) {
		super();
		this.name = name;
	}
	
	public BaseComponent(String name, float value) {
		super();
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}
	
	
	
}

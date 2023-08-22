import java.util.ArrayList;

import components.BaseComponent;
import components.Cpu;
import components.Desktop;
import components.Ram;
import components.Ssd;


public class Main {
	public static void main(String[] args) {
		Ssd ssd = new Ssd("Seagate SSD M.2 1TB", (float) 309.99);
		Cpu cpu = new Cpu("AMD Ryzen 7 3600G", (float) 720);
		Ram ram = new Ram("HyperX 2x8gb", (float) 249.99);
		
		ArrayList<BaseComponent> comp =  new ArrayList<BaseComponent>();
		comp.add(ssd);
		comp.add(cpu);
		comp.add(ram);
		
		Desktop dt = new Desktop("Pc Level 1", comp);
		
		System.out.println(dt.getValue());
	}
}

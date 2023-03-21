package app;

// IMPORTANDO AS CLASSES MacOSFactory E WindownsFactory E A INTERFACE GUIFactory
import factories.GUIFactory;
import factories.MacOSFactory;
import factories.WindowsFactory;

// DECLARANDO A CLASSE Demo.
public class Demo {
	// DECLARANDO O MÉTODO ESTÁTICO configureApplication() QUE RETORNARÁ UM OBJETO Application.
	private static Application configureApplication() {
		// DECLARANDO A VARIAVEL app DO TIPO Application
		Application app;
		// DECLARANDO A VARIAVEL factory DO TIPO GUIFactory
		GUIFactory factory;
		// DECLARANDO A VARIAVEL osNAME DO TIPO String QUE RECEBERÁ O VALOR DA PROPIEDADE DO SISTEMA "os.name" EM MINUSCULO.
		String osName = System.getProperty("os.name").toLowerCase();
		
		// SE A VARIAVEL "os.name" CONTER A String "mac" A VARIAVEL factory IRÁ RECEBER UMA NOVA INSTÂNCIA DO OBJETO MacOSFactory.
		if(osName.contains("mac")) {
			factory = new MacOSFactory();
		} 
		// SENÃO A VARIAVEL factory IRÁ RECEBER UMA NOVA INSTÂNCIA DO OBJETO WindowsFactory.
		else {
			factory = new WindowsFactory();		
		}
		
		// A VARIAVEL app RECEBE UMA NOVA INSTÂNCIA DO OBJETO Application PASSANDO A VARIAVEL factory COMO PARAMETRO
		app = new Application(factory);
		// RETORNA A VARIÁVEL app.
		return app;
	}
	
	// DECLARANDO O MÉTODO main.
	public static void main(String[] args) {
		// DECLARANDO A VARIÁVEL app QUE RECEBERÁ UMA NOVA INSTÂNCIA DO OBJETO Application QUE RETORNARÁ DO MÉTODO configureApplication().
		Application app = configureApplication();
		// IMPRIMIRÁ AS IMAGENS PRESENTES NOS MÉTODOS button.paint(); E checkbox.paint();
		app.paint();
	}
}

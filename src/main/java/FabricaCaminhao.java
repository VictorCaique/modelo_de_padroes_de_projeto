
public class FabricaCaminhao implements FabricaTransporte {
	public Transporte criarTransporte() {
		return new Caminhao();
	}
}


public class FabricaNavio implements FabricaTransporte{
	public Transporte criarTransporte() {
		return new Navio();
	}
}

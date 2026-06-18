package mediator;

public class ATC implements ATCMediator {
    private Flight flight;
    private Runway runway;
	private SupportTeam supportTeam;
    public boolean land;

	@Override
	public void registerRunway(Runway runway) {
		this.runway = runway;
	}

	@Override
	public void registerFlight(Flight flight) {
		this.flight = flight;
	}

	public void registerSupportTeam(SupportTeam supportTeam) {
		this.supportTeam = supportTeam;
	}

	@Override
	public boolean isLandingOk() {
		return land;
	}

	@Override
	public void setLandingStatus(boolean status) {
		land = status;
	}

	@Override
	public void solicitarPouso(Flight flight) {
		System.out.println(
			"Voo " + flight.getFlight() +
			" solicitando autorização para pouso."
		);

		if(runway.notificarStatus().equals("inseguro")) {
			System.out.println("Pista insegura. Acionando equipe de apoio.");
			supportTeam.varredura();
		}

		if(runway.notificarStatus().equals("disponivel")) {
			System.out.println("Pouso autorizado.");
			runway.setStatus("indisponivel");
			setLandingStatus(true);
		}
	}

	@Override
	public void atualizar(String contexto) {
		if(contexto.equals("verStatus")) {
			runway.getStatus();
		}
		
		if(contexto.equals("pousou")) {
			runway.setStatus("inseguro");
			setLandingStatus(true);
		}

		if(contexto.equals("varredura")) {
			supportTeam.varredura();
		}

		if(contexto.equals("varreduraCompleta")) {
			runway.setStatus("disponivel");
		}
	}
}

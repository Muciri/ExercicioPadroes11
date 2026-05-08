import java.lang.Thread;

public class Semaforo {
	private String numTombamento = null;
	State estado;
	
	public Semaforo(String numTombamento) {
        this.numTombamento = numTombamento;

		State estado = new VerdeState();
		estado.setSemaforo(this);

		this.estado = estado;
	}

	public Semaforo(String numTombamento, State estado) {
		this.numTombamento = numTombamento;

		estado.setSemaforo(this);
		this.estado = estado;
	}
	
	public String getNumTombamento() {
		return numTombamento;
	}

	public void setNumTombamento(String numTombamento) {
		this.numTombamento = numTombamento;
	}
	
	public Sinal getEstadoAtual() {
		return estado.getSinal();
	}

	public void mudarEstadoAtual(State estado) {
		this.estado = estado;
	}

	public void exibir() {
		estado.exibir();
	}

	public void efetuarTransicao() {
		estado.efetuarTransicao();
	}
	
	public void showVisorRegressivo() {
		for (int i = estado.getTempoTransicao(); i >0 ; i--) {
			System.out.println(i + " segundo(s)");
			try {
				// 1000 milisegundos equivale a 1 segundo
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void start() {
		this.start(10);
	}

	public void start(int time_in_seconds) {
		while(time_in_seconds > 0) {
			System.out.println("Tempo restante da simulacao: " + time_in_seconds + " segundos");
			System.out.println( getEstadoAtual() + " : " + estado.getTempoTransicao() + " segundos.");
			exibir();
			time_in_seconds -= estado.getTempoTransicao();
			showVisorRegressivo();
			efetuarTransicao();
			System.out.println();
		}
	}
	
	public String toString() {
		String s = "";
		s += "Numero Tombamento: " + numTombamento + "\n";
		s += "Tempo de permanencia em cada estagio:\n";
		s += Sinal.VERMELHO + " : " + new VermelhoState().getTempoTransicao() + " segundos\n";
		s += Sinal.AMARELO + " : " + new AmareloState().getTempoTransicao() + " segundos\n";
		s += Sinal.VERDE + " : " + new VerdeState().getTempoTransicao()+ " segundos\n";
		return s;
	}
}

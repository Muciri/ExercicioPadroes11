/*
public enum Cor {
	//
	VERMELHO("\u001B[31m","vermelho"),
	PRETO("\u001B[30m", "preto"), 
	RESET("\u001B[0m", "reset");
	
	private final String ansiCode;
	private final String value;

	Cor(String ansiCode, String cor) {
		this.ansiCode = ansiCode;
		this.value = cor;
	}
	public String ansiCode() {
		return this.ansiCode;
	}
	
	public String getValue() {
		return this.value;
	}
}

 */

public enum Cor {
	// Cores padrão do Uno com seus respectivos códigos ANSI
	VERMELHO("\u001B[31m", "vermelho"),
	VERDE("\u001B[32m", "verde"),
	AMARELO("\u001B[33m", "amarelo"),
	AZUL("\u001B[34m", "azul"),

	// Utilitários para cartas curinga ou resetar a cor do terminal
	PRETO("\u001B[30m", "preto"),
	RESET("\u001B[0m", "reset");

	private final String ansiCode;
	private final String value;

	Cor(String ansiCode, String cor) {
		this.ansiCode = ansiCode;
		this.value = cor;
	}

	public String ansiCode() {
		return this.ansiCode;
	}

	public String getValue() {
		return this.value;
	}
}

package br.edu.univas.vo;

public class Veiculo {
	
	private String cor;
	private int anoFabicaçao;
	private int anoModelo;
	private Motor motor;
	private int velocidadeAtual;
	
	public int acelerar;
	public int frear;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAnoFabicaçao() {
		return anoFabicaçao;
	}
	public void setAnoFabicaçao(int anoFabicaçao) {
		this.anoFabicaçao = anoFabicaçao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public int getAcelerar() {
		return acelerar;
	}
	public void setAcelerar(int acelerar) {
		this.acelerar = acelerar;
	}
	public int getFrear() {
		return frear;
	}
	public void setFrear(int frear) {
		this.frear = frear;
	}
	
	
}

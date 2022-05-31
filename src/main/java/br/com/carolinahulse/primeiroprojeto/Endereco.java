package br.com.carolinahulse.primeiroprojeto;
public class Endereco {
	private String bairro;
	private int numero;
	
	public Endereco(String bairro, int numero) {
		this.bairro = bairro;
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Endereco [bairro=" + bairro + ", numero=" + numero + "]";
	}
}
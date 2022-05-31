package br.com.carolinahulse.primeiroprojeto;
import java.time.LocalDate;
public class Pessoa {
	private String nomeCompleto;
	private LocalDate dataNascto;
	private Endereco endereco;
	
	public Pessoa(String nomeCompleto, LocalDate dataNascto, Endereco endereco) {
		this.nomeCompleto = nomeCompleto;
		this.dataNascto = dataNascto;
		this.endereco = endereco;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public LocalDate getDataNascto() {
		return dataNascto;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	@Override
	public String toString() {
		return "Pessoa [nomeCompleto=" + nomeCompleto + ", dataNascto=" + dataNascto + ", endereco=" + endereco + "]";
	}
}
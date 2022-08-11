package Polimorfismo;

import java.time.LocalDate;

public class Pessoa {
	//Atributos
	private String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getNascimento() {
		return nascimento;
	}
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	private LocalDate nascimento;
}

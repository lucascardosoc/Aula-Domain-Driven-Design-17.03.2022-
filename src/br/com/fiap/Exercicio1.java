package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int idade;

		idade = Integer.valueOf(JOptionPane.showInputDialog(
				"Digite a sua idade para que seja possível verificar se você pode ou não tirar a habilitação."));
		if (idade >= 18) {
			System.out.println("Você pode tirar a habilitação.");
		} else {
			System.out.println("Você não pode tirar a habilitação ainda.");
		}
	}

}

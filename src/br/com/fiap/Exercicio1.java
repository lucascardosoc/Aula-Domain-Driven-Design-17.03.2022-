package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int idade;

		idade = Integer.valueOf(JOptionPane.showInputDialog(
				"Digite a sua idade para que seja poss�vel verificar se voc� pode ou n�o tirar a habilita��o."));
		if (idade >= 18) {
			System.out.println("Voc� pode tirar a habilita��o.");
		} else {
			System.out.println("Voc� n�o pode tirar a habilita��o ainda.");
		}
	}

}

package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio2 {

	public static void main(String[] args) {
		char cnh;

		cnh = JOptionPane.showInputDialog(
				"Digite qual a categoria da sua CNH para que seja poss�vel verificar qual ve�culo voc� est� apto de dirigir ou pilotar")
				.charAt(0);

		switch (cnh) {

		case 'a':
			System.out.println("Sua categoria est� apta para pilotar moto.");
			break;

		case 'b':
			System.out.println("Sua categoria est� apta para dirigir carro.");
			break;

		default:
			System.out.println("Op��o inv�lida.");
			break;
		}
	}

}

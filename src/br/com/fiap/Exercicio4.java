package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		char tipoSanguineoDoador;
		char tipoSanguineoReceptor;

		tipoSanguineoDoador = JOptionPane.showInputDialog("Qual o tipo sanguíneo do doador?").charAt(0);

		tipoSanguineoReceptor = JOptionPane.showInputDialog("Qual o tipo sanguíneo do receptor?").charAt(0);

		if (tipoSanguineoDoador == tipoSanguineoReceptor) {
			System.out.println("É possível receber transfusão de sangue.");
		} else {
			System.out.println("Não é possível receber transfusão de samgue.");
		}

	}

}

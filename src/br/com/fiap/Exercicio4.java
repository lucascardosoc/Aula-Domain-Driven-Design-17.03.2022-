package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {

		char tipoSanguineoDoador;
		char tipoSanguineoReceptor;

		tipoSanguineoDoador = JOptionPane.showInputDialog("Qual o tipo sangu�neo do doador?").charAt(0);

		tipoSanguineoReceptor = JOptionPane.showInputDialog("Qual o tipo sangu�neo do receptor?").charAt(0);

		if (tipoSanguineoDoador == tipoSanguineoReceptor) {
			System.out.println("� poss�vel receber transfus�o de sangue.");
		} else {
			System.out.println("N�o � poss�vel receber transfus�o de samgue.");
		}

	}

}

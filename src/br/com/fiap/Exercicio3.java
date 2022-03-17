package br.com.fiap;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {

		double peso;
		double altura;
		double imc;
		double imcIdeal = 18.5;
		double imcIdeal2 = 24.9;

		peso = Double.valueOf(JOptionPane.showInputDialog("Qual o seu peso?"));

		altura = Double.valueOf(JOptionPane.showInputDialog("Qual a sua altura?"));

		imc = peso / (altura * altura);

		System.out.println("Seu IMC é " + imc);

		if (imc > imcIdeal && imc < imcIdeal2) {
			System.out.println("Seu IMC é ideal.");
		} else {
			System.out.println("Seu IMC não é ideal.");
		}
	}

}

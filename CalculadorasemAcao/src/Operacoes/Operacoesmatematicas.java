package Operacoes;

public class Operacoesmatematicas {
	public double soma(double a, double b) {
		double total = a + b;
		return total;
	}
	
	public double subtracao(double a, double b) {
		double total = a - b;
		return total;
	}

	public double multiplicacao(double a, double b) {
		double total = a * b;
		return total;
	}
	public double divisao(double a, double b) {
		double total = a/b;
		return total;
	}
	public double potenciazaçao(double a, double b) {
		double total=Math.pow(a, b);
		return total;
	}
	
}
package cap3.br.com.alura.solid.service;

public class TabelaDePrecoPadrao implements TabelaDePreco {
	public double descontoPara(double valor) {
		if (valor > 5000)
			return 0.03;
		if (valor > 1000)
			return 0.05;
		return 0;
	}
}
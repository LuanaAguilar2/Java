//calcular energia
package atividade;

public class CalcularEnergia {

	public enum Genero {
	        masculino, feminino
	    }

	    public double calcularNecessidadeEnergia(Genero genero, int idade, double peso, double fatorAtividade) {
	        double tmb = calcularTMB(genero, idade, peso);
	        return tmb * fatorAtividade;
	    }

	    private double calcularTMB(Genero genero, int idade, double peso) {
	        switch (genero) {
	            case masculino:
	                if (idade >= 10 && idade <= 18) {
	                    return 17.5 * peso + 651;
	                } else if (idade >= 18 && idade <= 30) {
	                    return 15.3 * peso + 679;
	                } else if (idade > 30 && idade <= 60) {
	                    return 8.7 * peso + 879;
	                } else if (idade > 60) {
	                    return 13.5 * peso + 487;
	                }
	                break;
	            case feminino:
	                if (idade >= 10 && idade <= 18) {
	                    return 12.2 * peso + 746;
	                } else if (idade >= 18 && idade <= 30) {
	                    return 14.7 * peso + 496;
	                } else if (idade > 30 && idade <= 60) {
	                    return 8.7 * peso + 829;
	                } else if (idade > 60) {
	                    return 10.5 * peso + 596;
	                }
	                break;
	        }
	        throw new IllegalArgumentException("Idade fora do intervalo permitido");
	    }

		public static double calcularTMB(int i, int j) {
			// TODO Auto-generated method stub
			return 0;
		}
	}


//Calculo de peso ideal
package atividade;

public class Peso {
	public static double IMC(double altura, double peso) {
		double imc= peso/ (altura*altura);
		return imc;
	}
	public static String classificaPeso(double imc) {
		if (imc < 20)
		{
			return "abaixo do peso";
		}
		else if (imc >= 20 && imc <= 25)
		{
			return "peso ideal";
		}
		else if (imc > 25 && imc <= 30)
		{
			return " sobre peso";
		}
		else if (imc > 30 && imc <= 40)
		{
			return "obeso";
		}
		else {
			return "obeso mórbido";
		}
	}
	public static double PesoIdealCriança(int idade) {
		double pesoidealC= (idade *2)+9;
		return pesoidealC;	
	}
	
	public static double PesoIdealAdulto(double altura, String genero) {
		double imc_desejado1=0;
	if (genero.equalsIgnoreCase("Masculino"))
	{
		imc_desejado1 = 22;
	}
	else if (genero.equalsIgnoreCase("Feminino")) 
	{
		imc_desejado1= 21;
	}
	double pesoidealA= imc_desejado1*(altura*altura);
	return pesoidealA;
	}
	public static double PesoIdealIdoso(int idade, double altura, String genero) {
        double imcPercentil50 = 0;
        
            if (genero.equalsIgnoreCase("masculino")) 
            {
            if (idade >= 65 && idade <= 69) 
            {
                imcPercentil50 = 24.3;            
            } 
            else if (idade >= 70 && idade <= 74) 
            {
                imcPercentil50 = 25.1;
            } 
            else if (idade >= 75 && idade <= 79) 
            {
                imcPercentil50 = 23.9;
            } 
            else if (idade >= 80 && idade <= 84) 
            {
                imcPercentil50 = 23.7;
            } 
            else if (idade > 85) 
            {
                imcPercentil50 = 25.1;
            }
        } 
            else if (genero.equalsIgnoreCase("feminino")) 
            {
            if (idade >= 65 && idade <= 69) 
            {
                imcPercentil50 = 26.5;
            } 
            else if (idade >= 70 && idade <= 74) 
            {
                imcPercentil50 = 26.3;
            } 
            else if (idade >= 75 && idade <= 79) 
            {
                imcPercentil50 = 26.1;
            } 
            else if (idade >= 80 && idade <= 84) 
            {
                imcPercentil50 = 25.5;
            } 
            else if (idade > 85) 
            {
                imcPercentil50 = 23.6;
            }
            else 
            {
            	throw new IllegalArgumentException("A idade não se enquadra nos critérios de idades");
            }
        }
        double pesoIdealIdoso = imcPercentil50 * (altura * altura);
        return pesoIdealIdoso;
    }
	public static String classificaPeso(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

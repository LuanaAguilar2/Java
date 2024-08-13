//Calculo de temperatura
package temperaturas;

public class temperatura1 
{
	public static double CelsusParaF (double C)
	{
		double R=0; 
		R=C*1.8+32; 
		return R; 
}
	public static double CelsusParaK (double C) 
	{
		double R=0; 
		R=C+273.15; 
		return R; 
	}
	public static String classificatemp(double C) 
	{
		String R= " "; 

		if (C < 0) 
		{
			R="Negativo"; 
		}
		else if (C>0)
		{
			R="Positivo"; 
		}
		else 
		{
			return R;
		}
		return R;
	}
	public static boolean valida(double C, double F) 
	{
		boolean valida; 

		double F1= C*1.8+32; 

		if(F1==F)
		{
			valida=true; 
		}
		else 
		{
			valida=false; 
		}
		return valida;
	}
}

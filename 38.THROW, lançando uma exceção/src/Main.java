

public class Main {

	public static void main(String[] args) {
		
		int nota1,nota2,res;
		nota1=30;
		nota2=60;
	
		//gera uma execao com msg pesonalisada
//throw new IllegalArgumentException("erro");						
		
		
		if (nota1>50||nota2>50) {
			throw new IllegalArgumentException("erro");						
		}else {
			res=(nota1+nota2);	
			System.out.print(res);
		}
		
			
	}

}

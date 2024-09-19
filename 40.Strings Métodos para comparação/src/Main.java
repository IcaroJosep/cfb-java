
public class Main {

	public static void main(String[] args) {
		
// == vs equals************************************************************************************************************
							
			//==//-----------------------------------------------------------------
							System.out.println("\nUTILISANDO ==   //---------------------");
		/*Objetos String: Quando você usa o operador new para criar uma string, 
		 * um novo objeto String é alocado na heap, mesmo que o valor seja 
		 * o mesmo de uma string já existente no pool.*/
		String S1=new String("java");
		/*String Pool: É uma área especial da memória onde strings literais 
		 *(aquelas declaradas diretamente no código, como "java") são armazenadas
		 * apenas uma vez. Se você declarar várias strings com o mesmo valor literal,
		 * todas elas farão referência à mesma string no pool.*/
		String S2="java";
		String S3="java";
		
		System.out.printf("\n%s",(S1==S2)?"sao iguais\n":"nao sao iguais\n");
		System.out.printf("\n%s",(S2==S3)?"sao iguais\n":"nao sao iguais\n");
		/* comclusao a comparacao é feita comparando endereço na memoria */
		
		   //equals//----------------------------------------------------------------
							System.out.println("\nUTILISANDO equals//---------------------");
							/*metodo q compara diretamente o valor do array comtido no obj string*/
		System.out.printf("\n%s",S1.equals(S2)?"sao iguais\n":"nao sao iguais\n");
		
//equalsIgnoreCase *********************************************************************************************************
							System.out.println("\nUTILISANDO equalsIgnorCase//-------------");
		/*este metodo ignora se a letras maisculas ou minscula e fas a comparacao*/					
		String S4 = new String("IcarO");							
		String S5 = new String("icaro");
		
		System.out.printf("\n%s",S4.equals(S5)?"sao iguais\n":"nao sao iguais\n");
		System.out.printf("\n%s",S4.equalsIgnoreCase(S5)?"sao iguais\n":"nao sao iguais\n");
		
//compareTO
		/* comparação é feita caractere por caractere, utilizando a codificação Unicode.
		 * Isso significa que letras maiúsculas são consideradas menores que minúsculas.*/
							System.out.println("\nUTILISANDO compareTO//-------------------");
		String s6="ABCD";
		String s7="abcd";
		
		if(s6.compareTo(s7)<0) {
			System.out.println("s6 < s7");
		}else if(s6.compareTo(s7)==0) {
			System.out.println("s6 = s7");
		}else if(s6.compareTo(s7)>0) {
			System.out.println("s6 > s7");
		}
		///////////////////// s8 tem uma letra a mais
		String s8="abcde";	
		
		if(s7.compareTo(s8)<0) {
			System.out.println("s7 < s8"); 
		}
		
		
//regionMatches
		 					System.out.println("\nUTILISANDO regionMatches//---------------");
		/*permite a comparacao de uma parte da string*/
		String s9 ="icaro josep";
		String s10="icaro j. r. machado";
		
		if(s9.regionMatches(true, 0,s10, 0, 5)) {
			System.out.println("iguais");
		}
		
	}
}

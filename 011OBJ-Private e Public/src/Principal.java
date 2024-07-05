
public class Principal {
	
	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		
		
	/* num é posivel ser acesedo e modificado 
	 * diretamente por ser public. */
		j1.num=10;
		System.out.println(j1.num);
	
	/*num2 é nesesario usso dos get's e set's 
	 * por ser privado.*/
		j1.setNum2(20);	
		System.out.println(j1.getNum2());
				
	}

}


public interface SerVivo {
	
	/* Embora atributos possam ser 
	 *declarados nas interfaces. 
	 *N�o se utiliza devido rigidez
	 *da manipula��o ap�s sua 
	 *declara��o em uma interface. 
	 *a utiliza��o da declara��o de 
	 *atributos � comumente declarado 
	 *na classe
	 */
	public boolean vivo=true;
	
	
	/*ass: de metodos*/
	public void mover();
	public void comes(int massa);
	public void info();
}
   	
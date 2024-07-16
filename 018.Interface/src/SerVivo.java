
public interface SerVivo {
	
	/* Embora atributos possam ser 
	 *declarados nas interfaces. 
	 *Não se utiliza devido rigidez
	 *da manipulação após sua 
	 *declaração em uma interface. 
	 *a utilização da declaração de 
	 *atributos é comumente declarado 
	 *na classe
	 */
	public boolean vivo=true;
	
	
	/*ass: de metodos*/
	public void mover();
	public void comes(int massa);
	public void info();
}
   	
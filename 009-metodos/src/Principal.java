

public class Principal {
/* METODOS:
 * 		
 * 		"METODOS SAO COISAS Q AS CLKASES FAZEM !"
 * 
 * -Senpre se endica o modificador de acesso ex:(public);
 * -A classe principal(MAIN), que cont�m o main, geralmente deve ter como objetivo principal iniciar e orquestrar a execu��o do programa.
 *Incluir m�todos n�o est�ticos (STATIC) com outras funcionalidades desvia o foco dessa responsabilidade principal, tornando o c�digo menos coeso e organizado,
 *E tamb�m a para chamar um metodo nao estatico gera a nessecidade da instanciacao de um obj *
 * -para a criacao do metodo tbm � necess�rio declarar o tipo de retorno .
 * 
 *-Sobrecarga de m�todos (method overloading)
 *   METODOS tbm podem ussar o mesmo nome des de q seus parametros sejao diferentes 
 * 	    Par�metros:
 *			O n�mero de par�metros pode ser diferente.
 *			O tipo dos par�metros pode ser diferente.
 *			A ordem dos par�metros pode ser diferente.
 *		Tipo de retorno:
 *			O tipo de retorno pode ser diferente.
 */
		public static void main(String[] args) {
			soma(3,3);
			System.out.printf("\na soma de 3 + 3 � : %f",soma(3f,3f));
			System.out.printf("\na soma de 3 + 3 + 3 � : %f",soma(3f,3.0f,3f));
			//COM LISTA DE PARAMETROS
			System.out.printf("\na soma de 9+7+8+10 � : %d",soma(9,7,8,10));
			
			
		}
	
		public static void soma(int y,int x) {
			int soma =y+x;
			System.out.printf("a soma de %d + %d � : %d",y,x,soma);
		}
		public static float soma(float y,float x) {
			float res=y+x;
			return res;
		}
		public static float soma(float y,float x,float w) {
			float res=y+x+w;
			return res;
		}
		
		///com lista de parametros
		/*
O m�todo em quest�o, public static int soma(int... n), � chamado de m�todo de varargs (variadic arguments) em Java. Varargs permitem que voc� especifique um n�mero vari�vel de argumentos do mesmo tipo na defini��o do m�todo.

Caracter�sticas:

Nome: soma

Tipo de retorno: int (retorna um valor inteiro)

Lista de par�metros: int... n

int: Tipo de dado dos argumentos
...: Varargs indica que pode haver um n�mero vari�vel de argumentos
n: Nome do array que armazenar� os argumentos passados
Funcionamento:

Quando voc� chama o m�todo soma, pode passar um ou mais valores inteiros como argumentos:

Java
soma(10); // Um argumento
soma(20, 30); // Dois argumentos
soma(40, 50, 60); // Tr�s argumentos*/
		public static int soma(int... n) {
			int res = 0;
				for(int i:n) {
					res+=i;
				}
			return res;
		}
}

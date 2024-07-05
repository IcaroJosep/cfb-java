

public class Principal {
/* METODOS:
 * 		
 * 		"METODOS SAO COISAS Q AS CLKASES FAZEM !"
 * 
 * -Senpre se endica o modificador de acesso ex:(public);
 * -A classe principal(MAIN), que contém o main, geralmente deve ter como objetivo principal iniciar e orquestrar a execução do programa.
 *Incluir métodos não estáticos (STATIC) com outras funcionalidades desvia o foco dessa responsabilidade principal, tornando o código menos coeso e organizado,
 *E também a para chamar um metodo nao estatico gera a nessecidade da instanciacao de um obj *
 * -para a criacao do metodo tbm é necessário declarar o tipo de retorno .
 * 
 *-Sobrecarga de métodos (method overloading)
 *   METODOS tbm podem ussar o mesmo nome des de q seus parametros sejao diferentes 
 * 	    Parâmetros:
 *			O número de parâmetros pode ser diferente.
 *			O tipo dos parâmetros pode ser diferente.
 *			A ordem dos parâmetros pode ser diferente.
 *		Tipo de retorno:
 *			O tipo de retorno pode ser diferente.
 */
		public static void main(String[] args) {
			soma(3,3);
			System.out.printf("\na soma de 3 + 3 é : %f",soma(3f,3f));
			System.out.printf("\na soma de 3 + 3 + 3 é : %f",soma(3f,3.0f,3f));
			//COM LISTA DE PARAMETROS
			System.out.printf("\na soma de 9+7+8+10 é : %d",soma(9,7,8,10));
			
			
		}
	
		public static void soma(int y,int x) {
			int soma =y+x;
			System.out.printf("a soma de %d + %d é : %d",y,x,soma);
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
O método em questão, public static int soma(int... n), é chamado de método de varargs (variadic arguments) em Java. Varargs permitem que você especifique um número variável de argumentos do mesmo tipo na definição do método.

Características:

Nome: soma

Tipo de retorno: int (retorna um valor inteiro)

Lista de parâmetros: int... n

int: Tipo de dado dos argumentos
...: Varargs indica que pode haver um número variável de argumentos
n: Nome do array que armazenará os argumentos passados
Funcionamento:

Quando você chama o método soma, pode passar um ou mais valores inteiros como argumentos:

Java
soma(10); // Um argumento
soma(20, 30); // Dois argumentos
soma(40, 50, 60); // Três argumentos*/
		public static int soma(int... n) {
			int res = 0;
				for(int i:n) {
					res+=i;
				}
			return res;
		}
}

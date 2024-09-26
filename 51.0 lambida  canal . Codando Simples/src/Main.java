/*link da aula : https://www.youtube.com/watch?v=8Ve4WPDxkpc
 * 
 * obs:
 * */

@FunctionalInterface
interface Taxi{ 
/*as interfaces funcionais para lambda podem ter apenas um metodo
 * este metodo � public e abstratc por padrao
 * o metodo poder ter qual quer retorno inclusive void*/
	double reservar();
}



public class Main {

	public static void main(String[] args) {
		
		/*neste ponto a instanciacao da interface funcional
		 * onde lambda esta sobre escrevendo o metodo reserva() edando um retorno*/
		Taxi taxi =()->{
				System.out.println("taxi reservado");
				return 80.20;
		};
		
		/*neste ponto a a chamada da funcao lambida atraves da interface intanciada de Taxi
		 * que da o seu retorno double*/
		System.out.println(taxi.reservar());
	
		

	}

}//// leia esta pohha filho de uma puta !!!!!!!!!!!!!!!

/*As express�es lambda em Java foram introduzidas para simplificar o 
*c�digo, eliminando a necessidade de criar classes an�nimas para implementar 
*interfaces funcionais. Elas permitem que voc� escreva fun��es de forma mais concisa e leg�vel.
*
*			Aqui est�o os pontos principais do seu entendimento:
*
*Elimina��o de Classes An�nimas:
*As lambdas substituem a necessidade de criar
*classes an�nimas para implementar m�todos de interfaces funcionais.
*
*Uso de Interfaces Funcionais:
*As lambdas requerem uma interface funcional,
*que pode ser uma interface personalizada ou uma das muitas interfaces funcionais
*fornecidas pela biblioteca padr�o do Java, como BiFunction, Runnable, Consumer, etc.
*
*Reutiliza��o de Interfaces Existentes:
*Voc� pode reutilizar interfaces funcionais 
*existentes, como BiFunction e Runnable, para aproveitar as lambdas.
**/

//minha observacao
/*
 * esta merda foi criada para eliminar a nesecidade da criacao de uma clase 
 * 
 * ex: sem ela seria necesario criar uma classe para poder implementar a inteface
 * e entao chamar a funcao da classe
 * 
 * as intefaces funcionais permitem q tu crie diretamente uma variavel sobre a interface 
 * e na fariavel sobre escreva seu metodo
 * 
 * quanto a runnble ,bifunctional, Consumer e outras pohhas .. 
 * sao interfaces funcionais ja existentes q podem ser reaproveitadas
 *
 * 
 * */









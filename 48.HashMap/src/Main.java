import java.util.*;
import java.util.Map.Entry;


public class Main {
/*coleçao HashMap
 * Esta colecao faz uso de chave valor
 * ket/value 
 * 
 * */
	
	public static void main(String[] args) {
		
		
/////////pesoal	//////////////////////////////////////////
		
	/*	HashMap<Integer, Pessoa> a = new HashMap<>();
		Scanner in =new Scanner(System.in);
		System.out.print("inicio");
			
			//inicializacao
		Pessoa i = new Pessoa(in.nextInt(), in.nextLine());
			
		a.put(i.cpf, i);	
		
		for(Entry<Integer,Pessoa> it: a.entrySet()) {
			
            System.out.println("CPF: " + it.getKey() + ", Nome: " + it.getValue().nome);
        
		}
		System.out.print("fim");
	*/	
		
		
	  
/////////// chat gpt ////////////////////////////////////
		
	  /*HashMap<Integer, Pessoa> pessoas = new HashMap<>();
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o CPF e o nome da pessoa: ");
        int cpf = in.nextInt();
        String nome = in.nextLine();
        Pessoa pessoa = new Pessoa(cpf, nome);
        pessoas.put(cpf, pessoa);

        // Iterando sobre os valores do HashMap e imprimindo os dados de cada pessoa
        for (Map.Entry<Integer, Pessoa> entry : pessoas.entrySet()) {
            int cpfPessoa = entry.getkey();
            String nomePessoa = entry.getValue().nome;
            System.out.println("CPF: " + cpfPessoa + ", Nome: " + nomePessoa);
        }
        */
		
////// aula cfb cursos /////////////////////////////////////
		
		HashMap<Integer,String> carros = new HashMap<Integer, String>(); 
		
		carros.put(1, "polo");
		carros.put(2, "hrv");
		carros.put(3, "golf");
		carros.put(4, "camaro");
		carros.put(5, "mustang");
		carros.put(6, "cruze");
		
		System.out.println(carros);// iprimira todo o array de key/value
								   //{1=polo, 2=hrv, 3=golf, 4=camaro, 5=mustang, 6=cruze}
		
		System.out.println();
		
		//imprime valor da chave especifica
		System.out.println(carros.get(3));
		
		System.out.println();
		
		//imp todos os valores
		for (Entry<Integer, String> p : carros.entrySet()) {
			System.out.println(p.getValue());
		}
	
		
		System.out.println();
		
		//remove
		
		carros.remove(5);
		for (Entry<Integer, String> p : carros.entrySet()) {
			System.out.println(p.getValue());
		}
		
		
		
		
		
      }

}

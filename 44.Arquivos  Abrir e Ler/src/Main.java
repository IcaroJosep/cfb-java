
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.io.IOException;
import java.nio.file.*;
import java.util.List;
//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Path arquivo = Paths.get("C:\\Users\\icaro\\Documents\\pastaTexte\\texto.txt") ;	
		
		try{
			List<String> linhas = Files.readAllLines(arquivo);
			for(String linha:linhas) {
				System.out.println(linha);
			}
		}catch(Exception e){
			System.out.println("nao foi posivel ler o arquivo");
		}
		
	/*	try (
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(arquivo.toFile()))) {
			Scanner in = new Scanner(System.in);
            bufferedWriter.write(in.nextLine());
            bufferedWriter.newLine();
            bufferedWriter.write(in.nextLine());
            in.close();
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }finally {
        	System.out.println("fim");
		}
	*/	
	
		
			
	}
}

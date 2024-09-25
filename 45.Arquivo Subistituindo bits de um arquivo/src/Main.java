import java.nio.file.*;


public class Main {
	/*na operacao a ser apresentada avera a subistituicao de bist 
	 * pegando parte dos bits de um arquivo e colocando-o em outro*/
	static public void main(String[] args) {
		
		Path img1 = Paths.get("C:\\Users\\icaro\\Documents\\pastaTexte\\img1.png");
		Path img2 = Paths.get("C:\\Users\\icaro\\Documents\\pastaTexte\\img2.png");

		//ao final ele copiara ima imagem para outra
		try {
			//tranforma a img1 em um array de bits
			byte[] bytesImg1 = Files.readAllBytes(img1);
			//trascreve os bits da imagem 1 sobre os bits da imagem 2
			Files.write(img2, bytesImg1);	
		}catch(Exception e) {
			
			
		}
				
		
	}
}

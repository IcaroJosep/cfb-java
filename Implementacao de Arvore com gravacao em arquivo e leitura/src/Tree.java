import java.io.*;
class Tree{
  No root;
  int size;
  Tree(){
    this.root = null;
    this.size = 0;
  }
  void inserir(String nome,String cpf){
    if (root == null) {
        root = new No(nome, cpf);
      System.out.printf("Inserido %s com cpf %s\n",nome,cpf);
    }else{
      root.incerir(nome, cpf);
    }
  }
  
  public void imprimirEmOrdem() {
      imprimirEmOrdem(root);
  }

  private void imprimirEmOrdem(No no) {
      if (no != null) {
          imprimirEmOrdem(no.direito);
          System.out.printf("\ncpf: %s nome: %s ",no.pessoa.cpf,no.pessoa.nome); // Imprime os dados da pessoa (ajuste conforme necessário)
          imprimirEmOrdem(no.esquerda);
      }
  }
  
  
  public void salvarArvore() throws IOException {
      FileOutputStream fos = new FileOutputStream("minha_arvore.dat");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(root);
      oos.close();
  }

  public void carregarArvore() throws IOException, ClassNotFoundException {
      FileInputStream fis = new FileInputStream("minha_arvore.dat");
      ObjectInputStream ois = new ObjectInputStream(fis);
      root = (No) ois.readObject();
      ois.close();
  }
}
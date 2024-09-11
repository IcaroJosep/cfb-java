import java.io.Serializable;

class No implements Serializable {
  Pessoa pessoa;
  No esquerda;
  No direito;
  No(String nome, String cpf) {
    this.pessoa = new Pessoa(nome, cpf);
    this.esquerda = null;
    this.direito = null;
  }
  void incerir(String nome, String cpf) {
        if(compara(pessoa,cpf) == true){
          if (direito == null) {
            this.direito = new No(nome, cpf);
            System.out.printf("Inserido %s com cpf %s\n",nome,cpf);
          } else {
            this.direito.incerir( nome, cpf);
          }
        }else if(compara(pessoa,cpf) == false){
          if (esquerda == null) {
            this.esquerda = new No(nome, cpf);
            System.out.printf("Inserido %s com cpf %s\n",nome,cpf);
          } else {
            this.esquerda.incerir( nome, cpf);
          }
        }
  }
  
  
  
  static boolean compara(Pessoa pAtual, String cpf) {
    if (pAtual.cpf.compareTo(cpf) == 1) {
      // cpf da pessoa atual é maior que o cpf passado por parametro
      return true;
    }
    return false;
  }
}
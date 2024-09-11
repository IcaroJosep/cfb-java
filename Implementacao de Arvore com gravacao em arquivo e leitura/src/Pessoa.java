import java.io.Serializable;

class Pessoa implements Serializable{
  String nome,cpf;
  
  Pessoa(String nome,String cpf){
    this.nome = nome;
    this.cpf = cpf;
  }
}

public class Vegetal  {
	private boolean vivo; 
	private int massa;
	
	public Vegetal(int massa){
		this.vivo=true;
		this.massa=massa;
	}
	public int getMassa() {
		return this.massa;
	}
	public void setVivo(boolean vivo) {
		this.vivo=vivo;
	}
	public void info() {
		 System.out.println("\n------------------------------");
		 System.out.printf("\ntipo......:%s",getClass().toString());
		 System.out.printf("\nvivo......:%s",vivo?"sim":"nao");
		 System.out.printf("\nmassa.....:%d",massa); 
	}

}

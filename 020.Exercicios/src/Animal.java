/*a interface SerVivo foi ezplicada na aula anterior*/
public abstract class Animal implements SerVivo {
	private boolean vivo;
	private int massa;//pesso
	private int x ,y;//para movimento.
	private int vel;
	private int forca;
	
	public Animal(int vel,int massa,int forca){
		this.vel=vel;
		this.vivo = true;
		this.massa = massa;
		this.x=0;
		this.y=0;
		this.forca=forca;
	}
	
///////////VIVO////////////////////
	public void setVivo(boolean vivo) {
		this.vivo=vivo;
	}
	public boolean getVivo() {
		return this.vivo;
	}
/////////FOR�A/////////////	
	public void setForca(int forca) {
		this.forca=forca;
	}
	public int getForca() {
		return this.forca;
	}
////////MASSA//////////////
	public void setMassa(int massa) {
		this.massa=massa;
	}
	public int getMassa() {
		return this.massa;
	}
//////////MOVER///////////////
	/*este metodo so permite a movimenta�ao diagonal
	 *pos � so demostrativo*/
 	public void mover() {
 		if(this.vivo) {
 			this.x+=this.vel;
 			this.y+=this.vel;
 		}else {
 			System.out.println("----------------------------");
 			System.out.println(this.getClass().toGenericString()+"eta morto nao pode mover");
 			System.out.println("----------------------------");
 		
 		}
	}
////////ATACAR/////////////////
 	public void atacar(Animal a) {
 		if(this.vivo) {
 			if(this.forca>a.getForca()) {
 				this.forca+=a.getMassa();
 				a.setVivo(false);
 			}else {
 				this.vivo=false;
 			}
 		}else {
 			System.out.println("----------------------------");
 			System.out.println(this.getClass().toGenericString()+"eta morto nao pode atacar");
 			System.out.println("----------------------------");
 		}
 		
 	}
////////COMER////////
	public void comes(int massa) {
		if(this.vivo) {
 			this.forca+=massa;
 		}else {
 			System.out.println("----------------------------");
 			System.out.println(this.getClass().toGenericString()+"eta morto nao pode comer");
 			System.out.println("----------------------------");
 		
 		
 		}
	}

///////////INFO/////////////	

	public void info() {
		 System.out.println("\n----------------------------");
		 System.out.printf("\ntipo......:%s",getClass().toString());
		 System.out.printf("\nvivo......:%s",vivo?"sim":"nao");
		 System.out.printf("\nmassa.....:%d",massa);
		 System.out.printf("\nvelocidade:%d",vel);
		 System.out.printf("\nfor�a.....:%d",forca);	 
	}
	
}

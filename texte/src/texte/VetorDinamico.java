package texte;

public class VetorDinamico {
	Integer i ;
	VetorDinamico b;
	
	public VetorDinamico() {
		this.i= null;
		this.b=null;
	}
	
	private void setI (Integer i) {
		this.i=i;
	}
	
	public void add(int i) {
		if(this.i == null){
		  this.setI(i);
	    }else if(this.b!=null) {
			this.b.add(i);;
		}else{
			b=new VetorDinamico();
			this.b.setI(i);
			}
		
	}
	
	public void imp(int a) {		
		if(a==1){
		 System.out.print(this.i); 
		}
		
		if(this.b!=null) {
			this.b.imp(a);
		}
		
		if(a==2) {
			System.out.print(this.i);  		
		}
	}
	
	
	
	
}

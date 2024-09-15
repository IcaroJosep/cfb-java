

public abstract class Main {

	public static void main(String[] args) {
	
	System.out.print(soma(1,5,47,8,3));
		
	}
	
	public static Integer soma(Integer... n) {
		Integer res=0;
		for(int a:n) {
			res+=a;
		}	
		return res;
	}


}

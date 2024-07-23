
public class Principal {

	public static void main(String[] args) {
	//	int[] nums={5,7,4,2,3}; com inicializacao dinamica
		
		int[] nums = new int[5];// mesmo sem ter sido inicializado o
								 //	java inicializa altomaticamente com zero
		System.out.println(nums[1]);
		
	//inicializando 
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		nums[3]=4;
		nums[4]=5;
	
		for(int i :nums) {
			System.out.print(i);
		}
		
		/*for(int i=4 ;i>=0;i--) {
			System.out.print(nums[i]);
		}*/
		
		

	}

}

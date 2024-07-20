
public class Aranha extends Animal {
	private int veneno;
	
	
	public Aranha(int veneno, int vel, int massa, int forca) {
		super(vel, massa, forca);
		this.veneno=veneno;
	}
	@Override
	public void atacar(Animal a) {
		if (this.getVivo()) {
			
			if (this.getForca() > a.getForca()) {
				this.setForca(this.getForca() + a.getMassa());
				a.setVivo(false);
			} else if (this.getForca() < a.getForca()) {

				if (this.veneno > a.getForca()) {
					this.setForca(this.getForca() + a.getMassa());
					a.setVivo(false);
				} else {
					this.setVivo(false);
				}
			} else {
				this.setVivo(false);
			}
		} else {
			System.out.println("----------------------------");
			System.out.println(this.getClass().toGenericString() + "eta morto nao pode atacar");
			System.out.println("----------------------------");
		}

	}
	public void info() {
		super.info();
		System.out.printf("\nveneno....:%d",this.veneno);
	}
	
}

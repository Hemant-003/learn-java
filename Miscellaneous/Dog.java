public class Dog extends AnimalInheritance{
	private int teeth;
	private int eyes;
	private String tail;
	public Dog(String name,int weight,int size,int eyes, int tail,int teeth){
		this.teeth=teeth;
		this.eyes=eyes;
		this.tail=tail;
	super(name, 1,1,weight,size);
		

	}
}
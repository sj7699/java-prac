public class Human implements Valuable {
	private String name;
	private int age;
	public Human(String name,int age)
	{
		this.name= name;
		this.age=age;
	}
	public String toString()
	{
		return String.format("Human name:%s\n registered age: %d\n",this.name,this.age);
	}
	public double EstimateValue(int month)
	{
		return Double.POSITIVE_INFINITY;
	}
}

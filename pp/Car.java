public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name,double price)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return String.format("car name: %s \n initial price: %.2f \n",this.name,this.price);
	}
	public double EstimateValue(int month)
	{
		return this.price*0.8*(Math.pow((0.99),month));
	}
}

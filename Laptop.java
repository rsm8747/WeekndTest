
package WeekendTest;

public class Laptop implements Comparable<Laptop>
{
	String model_no;String brand;float price;int ram;
	Laptop(){}
	Laptop(String model_no,String brand,float price,int ram)
	{
		this.model_no = model_no;
		this.brand = brand;
		this.price = price;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [model_no=" + model_no + ", brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}
	public int hashCode()
	{
		int ans = model_no.hashCode() + brand.hashCode() + (int)price + (ram * 2);
		return ans;
	}
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(this == obj)
			return true;
		if(this.getClass() != obj.getClass())
			return false;
		Laptop l = (Laptop)obj;
		if(this.model_no == l.model_no && this.brand == l.brand && this.price == l.price && this.ram == l.ram)
			return true;
		else
			return false;
	}
	public int compareTo(Laptop l)
	{
		if(this.ram > l.ram)
			return -1;
		else if(this.ram < l.ram)
			return 1;
		else
		{
			return (int)(this.price - l.price);
		}
	}
}
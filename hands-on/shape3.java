package OOPs;

abstract class Shape3
{
	public abstract void calculateArea();
    public abstract void calculatePerimeter();
}
class Rectangle3 extends Shape3
{
	public void calculateArea()
	{
		System.out.println("Area of rectangle is:1*b");
	}
    public void calculatePerimeter()
    {
    	System.out.println("Perimeter of rectangle is:2(Length+Width)");
    }
}
class Triangle3 extends Shape3
{
	public void calculateArea()
	{
		System.out.println("Area of Triangle is:(Hieight*Base)/2");
	
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of rectangle is:2(A+B+c)");
	}
}
class Circles extends Shape3
{
	public void calculateArea()
	{
		System.out.println("Area of circle is: πr^2 ");
	}
	public void calculatePerimeter()
	{
		System.out.println("Perimeter of circle is: 2πr");
	}
	
}
class Shape3Main
{
	public static void main(String[] args)
	{
		Rectangle3 k=new Rectangle3();
		k.calculateArea();
		k.calculatePerimeter();
		
		Circles b=new Circles();
		b.calculateArea();
		b.calculatePerimeter();
		
		Triangle3 c=new Triangle3();
		c.calculateArea();
		c.calculatePerimeter();
	
		
       
		
		
	}
}
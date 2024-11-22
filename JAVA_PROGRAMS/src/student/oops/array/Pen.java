package student.oops.array;

public class Pen {
String brand;
int price;
public Pen(String brand, int price)
{
	this.brand=brand;
	this.price=price;
	
}
public void display()
{
	System.out.println("BRAND IS "+brand);
	System.out.println("Price"+price);
}
public static void main(String[] args) {
	Pen p1=new Pen("Cello",25);
	Pen p2=new Pen("Doms",30);
	Pen p3=new Pen("Camlin",40);
	/*Pen a[]=new Pen[3];
	a[0]=p1;
	a[1]=p2;
	a[2]=p3;*/
	Pen a[]= {p1,p2,p3};
	for(Pen p:a)
	{
		p.display();
	}
}
}

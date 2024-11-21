4) b) Design, Develop and Implement a Java program to compute the surface area and volume of cylinder, cone and sphere. Create an abstract class “Solid” and the classes cylinder, cone and sphere have to inherit the common properties form the class “Solid”.

 public abstract class Solid {
	
	double r, h;
	abstract void surfaceArea();
	abstract void volume();
	void readRadius()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		r=sc.nextDouble();

	}
	
	void readHeight()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		h=sc.nextDouble();

	}
	
}

public class Cone extends Solid{
	
		
	void surfaceArea()
	{
		double area = (3.14 * r)*(r * Math.sqrt(r*r + h*h));	
		System.out.println("Surface area of cone is "+area);
	}
	
	
	void volume()
	{
		double volume = 3.14 * r * r * (h/3);
		System.out.println("Volume of cone is "+volume);
	}

}
public class Cylinder extends Solid {
	
	
	
	void surfaceArea()
	{
		//System.out.println(r+" "+h);
		double area = 3.14 * r * r * h;
		System.out.println("Surface area of cylinder is " +area);
	}
	
	void volume()
	{
		double volume = (2 * 3.14 * r * h) + (2 * 3.14 * r * r);
		System.out.println("Volume of cylinder is "+volume);
	}
}


public class Sphere extends Solid {
	
		
	void surfaceArea()
	{
		double area = 4 * 3.14 * r * r;
		System.out.println("Surface area of sphere is  "+area);
	}
	
	void volume()
	{
		double volume  = 4.0/3 * 3.14 * r * r * r;
		System.out.println("Volume of sphere is "+volume);
	}
	
}

public class MySolid {
	
	public static void main(String args[]) {
		
		Solid s=new Cylinder();
		s.readRadius();
		s.readHeight();
		s.surfaceArea();
		s.volume();

		s=new Cone();
		s.readRadius();
		s.readHeight();
		s.surfaceArea();
		s.volume();
		
		s=new Sphere();
		s.readRadius();
		s.surfaceArea();
		s.volume();


		
	}

}

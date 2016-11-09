package mipackage;

public class Rectangulo{
	double base;
	double altura;
	double area;
	String color;
	
	Rectangulo(String color, double base, double altura)
	{
		
		this.base=base;
		this.altura=altura;
		this.color=color;
	}
	
	Rectangulo()
	{
		base = 5;
		altura = 3;
	}
	
	String getColor(){
		return color;
	}
	
	void setColor(String color){
		this.color=color;
	}
	
	double getBase(){
		return base;
	}
	
	double getAltura(){
		return altura;
	}
	
	
	void setBase(double base){
		this.base=base;
	}
	
	void setAltura(double altura){
		this.altura=altura;
	}
	
	double getArea(){
		return area;
	}
	
	void setArea(double area){
		this.area=base*altura;
	}
}


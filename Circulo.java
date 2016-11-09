package mipackage;

public class Circulo {

	double radio;
	double area;
	String color;
	
	Circulo(String color, double radio){
		this.radio=radio;
		this.color=color;
	}
	
	Circulo()
	{
		radio = 3;
		area = 0;
	}
	
	double getRadio(){
		return radio;
	}
	
	void setRadio(double radio){
		this.radio=radio;
	}
	
	String getColor(){
		return color;
	}
	
	void setColor(String color){
		this.color=color;
	}
	
	double getArea(){
		return area;
	}
	
	void setArea(double area){
		this.area=3.14*radio;
	}
}

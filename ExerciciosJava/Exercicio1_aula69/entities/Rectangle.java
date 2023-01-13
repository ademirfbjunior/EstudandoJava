package entities;


public class Rectangle {

	public double width;
	public double height;
	
	
	public double Area(){
		
		double calcArea = width * height;
		
		return calcArea;
		
	}
	
	public double Perimeter() {
		
		double calcPerimeter = 2*(width+height);
		
		return calcPerimeter;
	}
	
	public double Diagonal() {
		
		double calcDiagonal = Math.sqrt(Math.pow(height,2) + Math.pow(width, 2));
		
		return calcDiagonal;
	}
	
}

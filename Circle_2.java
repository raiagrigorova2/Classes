package Classes;

//������������ ����� Circle �� ���� 10,
//���� ��������� ������ radius private  � ��������
//setter � getter �� ������, ��� ��� ���  ���� - setRadius, getRadius.
public class Circle_2 {
	private double radius;
	
	public Circle_2(){radius = 1;}
	
	public Circle_2(double newRadius){
		if(newRadius > 0){
			radius = newRadius;
			return;
		}
		System.out.println("Radius must be a positive number");
		return;
	}
	
	public double getPerimeter(){
		return 2 * Math.PI * radius;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
	
	public void setRadius(double newRadius) {
		if(newRadius > 0){
			radius = newRadius;
			return;
		}
		System.out.println("Radius must be a positive number");
		return;
	}
	
	public double getRadius() {
		return radius;
	}
}
package Classes;

public class RegularPolygon {
	/*
	 * * Private ���� �� ����� int � ��� n, ����� �������� ���� �� �������� �
	 * �������� ��� �������� �� ������������ 3.
	 * 
	 * Private double ���� �� ����� � ��� sideLength, ����� ��������� ��������� ��
	 * ��������. ������� �� ������������ 1.
	 * 
	 * Private double ���� � �����, �������� x, ����� �������� x-������������ ��
	 * ������� �� ��� �������� �� ������������ 0.
	 * 
	 * Private double ���� � �����, �������� �, ����� �������� �-������������ ��
	 * ������� �� ��� �������� �� ������������ 0.
	 */
	private int n;
	private double sideLength;
	private double x;
	private double y;

	/*
	  ����������� ��� ���������, ����� ������� ������������ ��� ��������� ��
	  ������������.
	 */
	RegularPolygon(){
		n = 3;
		sideLength = 1;
		x = 0;
		y = 0;
	}
	/*
	  �����������, ����� ������� �������� ������������ � ��������� ���� ������ �
	  ������� �� ��������, ���������� � (0, 0).
	 */
	RegularPolygon(int n, double sideLength){
		if(n >= 3 && sideLength > 0) {
			this.n = n;
			this.sideLength = sideLength;
			x = 0;
			y = 0;
		}
		else {
			System.out.println("Invalid data");
		}
	}
	
	/*
	 �����������, ����� ������� �������� ������������ � ��������� ���� ������,
	 ������� �� �������� � ���������� x � y.
	 */
	RegularPolygon(int n, double sideLength, double x, double y ){
		if(n >= 3 && sideLength > 0) {
			this.n = n;
			this.sideLength = sideLength;
			this.x = x;
			this.y = y;
		}
		else {
			System.out.println("Invalid data");
		}
	}
	
	
	/*
	  �������� �� ������ - �������� � ��������� (getter/setter) �� ������ ������ �
	  �����.
	 */
	
	public int getN() {return n;}
	public double getSideLength() {return sideLength;}
	public double getX() {return x;}
	public double getY() {return y;}
	
	public void setN(int n) {
		if(n > 3) {
			this.n = n;
		}
		else {
			System.out.println("N must be >= 3");
		}
		return;
	}
	
	
	public void setSideLength(double sideLength) {
		if(sideLength > 0) {
			this.sideLength = sideLength;
		}
		else {
			System.out.println("The side length must be > 0");
		}
		return;
	}
	
	public void setX(double x) {
		this.x = x;
		return;
	}
	
	public void setY(double y) {
		this.y  = y;
		return;
	}
	
	/*
	 * ������� getPerimeter (), ����� ����� ���������� �� ��������.
	 */
	public double  getPerimeter () {return n * sideLength;}
	
	
	/*
	  ������� getArea (), ����� ����� ������ ��
	  ��������. 
	  ��������� �� ������������� �� ������ �� �������� ������������ �
	 */
	public double getArea () {return (Math.pow(sideLength, 2) * n) / (4 * Math.tan(Math.PI / n));}
	
			 	 

	

}

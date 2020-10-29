package Classes;

public class Fan {
//	�������� ���� �� ��� Fan, ����� �� ������������ ����������. ������ �������:
//		��� ��������� � ��� SLOW, MEDIUM � FAST ��� ��������� 1, 2 � 3 �� ������������ �� ��������� �� �����������.
//		Private ���� �� ����� int � ��� speed, ����� �������� ��������� �� ����������� (�� ������������ � SLOW).
//		Private ������ ���� �� ����� switchedOn, ����� ������ ���� ������������ � ������� (�� ������������ � false).
//		Private double ���� �� �����, �������� ������, ����� �������� ������� �� ����������� (�� ������������ � 5).
//		Private ���� � String ����� � ��� color, ����� �������� ����� �� ����������� (�� ������������ � ���).
//		�������� � ��������� (getter/setter) �� �������� ������ � �����.
//		����������� ��� ���������, ����� ������� ���������� �� ������������.

	public final int SLOW = 1;
	public final int MEDIUM = 2;
	public final int FAST = 3;
	
	private int speed;
	private boolean switchedOn;
	private double radius;
	private String color;
	
	Fan(){
		speed = SLOW;
		switchedOn = false;
		radius = 5;
		color = "Blue";
	}
	
	public void setSpeed(int newSpeed) {
		if(speed > 0 && speed <= 3) {speed = newSpeed;}
		else System.out.println("The speed must be a positive integer");
		return;
	}
	
	public void setState(boolean newState) {
		switchedOn = newState;
		return;
	}
	
	public void setRadius (double newRadius) {
		if(newRadius > 0) {radius = newRadius;}
		else System.out.println("The radius must be a positive double");
	}
	
	public void setColor(String newColor) {
		color = newColor;
		return;
	}
	
	public int getSpeed() {return speed;}
	public boolean getState() {return switchedOn;}
	public double getRadius() {return radius;}
	public String getColor() {return color;}
	
//	����� � ��� toString (), ����� ����� �������� �� ����������� ��� ������� �� ���. ��� ������������ 
//	� �������, ������� ����� ���������, ����� � ������� �� ����������� � ���� ���������� ���.
//	��� ������������ �� � �������, ������� ����� ����� � ������� �� ����������� ������ ��� ���� 
//	������������� � �������� � ���� ���������� ���.
	
	public String toString () {
		String s = "";
		if(switchedOn) {
			s += String.valueOf(speed) + " " + color + " " + String.valueOf(radius);
		}
		else {
			s += color + " " + String.valueOf(radius) + " The fan is turned off";
		}
		
		return s;
	}
	

}

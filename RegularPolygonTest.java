package Classes;

public class RegularPolygonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ������� ��������, ����� ������� ��� ������ RegularPolygon, ���������
		 * � ������� �� ������� �����������, ����������� RegularPolygon (6, 4) �
		 * ����������� RegularPolygon (10, 4, 5.6, 7.8). �� ����� ����� �������� �������
		 * ��������� � ����.
		 */
		
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		System.out.println("Object 1 : " + r1.getPerimeter() + " " + r1.getArea());
		System.out.println("Object 2 : " + r2.getPerimeter() + " " + r2.getArea());
		System.out.println("Object 3 : " + r3.getPerimeter() + " " + r3.getArea());
		
	}

}

package Classes;

public class FanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ������� ��������, ����� ������� ��� ������ �� ����� Fan. �������
		 * ���������� �������, ������ 10, ���� ����, � �������� ������ �����. �������
		 * ������ �������, ������ 5, ���� ��� � ��������� ������ �����. ��������
		 * �������� � ���������, ���� �������� ������ toString.
		 */
		Fan f1 = new Fan();
		Fan f2 = new Fan();
		
		f1.setSpeed(f1.FAST);
		f1.setRadius(10);
		f1.setColor("Yellow");
		f1.setState(true);
		
		f2.setSpeed(f2.MEDIUM);
		f2.setRadius(5);
		f2.setColor("Blue");
		f2.setState(false);
		
		System.out.println(f1.toString() + "\n" + f2.toString());
		
	}

}

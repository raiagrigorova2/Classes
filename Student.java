package Classes;

public class Student {
//	�������� ����� ������ � ������ ��� � ������ �����.
//	���� ����� ��� ��� ������������ - ������, � - � ����� � ������.
//	�������� �����, ����� ��������� ���� ���� ������ � � ����� �� ���������
//	(��������� - ������, ������ ��� - boolean) . �������� ����� �� ������� 
//	(5 �� ����). ��������� ������ ��� ��������� �������� �� �����������.
//	�������� �����, ����� ������ ���� ��������� ����� �� ������� � ������� � ��������� ����� �� 
//	���, ����� �� ������� ���������.
	public String name;
	public double averageGrade;
	public final double SCHOLAR_GRADE = 5.5;
	
	
	Student(){};
	
	Student(String n, double avrg){
		name = n;
		averageGrade = avrg;
	}
	
	public boolean scholarship() {
		if(averageGrade >= 5.5) {return true;}
		
		return false;
	}
	
	
}

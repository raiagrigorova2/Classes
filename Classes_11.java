package Classes;

import java.util.Scanner;

public class Classes_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�������� ����� ������ � ������ ��� � ������ �����.
//		���� ����� ��� ��� ������������ - ������, � - � ����� � ������.
//		�������� �����, ����� ��������� ���� ���� ������ � � ����� �� ���������
//		(��������� - ������, ������ ��� - boolean) . �������� ����� �� ������� 
//		(5 �� ����). ��������� ������ ��� ��������� �������� �� �����������.
//		�������� �����, ����� ������ ���� ��������� ����� �� ������� � ������� � ��������� ����� �� 
//		���, ����� �� ������� ���������.
		Scanner sc = new Scanner(System.in);
		final int SZ = 5;
		
		Student arr[] = new Student[SZ];
		
		System.out.println("Enter data for " + SZ + " students. (name and average grade)");
		
		for(int i = 0; i < SZ; i++) {
			arr[i] = new Student();
			
			arr[i].name = sc.next();
			arr[i].averageGrade = sc.nextDouble();
		}
		
		for(int  i = 0; i < SZ; i++) {
			if(arr[i].scholarship()) {
				System.out.println("Student number " + (i + 1) +
						"  name: " + arr[i].name + 
						"  grade: " + arr[i].averageGrade);
			}
		}
		
		
		
	}

}

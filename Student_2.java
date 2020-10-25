package Classes;
//������������ ����� Student �� ���� 11 
//���� ��������� �������� �� private � ��������� getter-� � setter-�.


public class Student_2 {

	private String name;
	private double averageGrade;
	private final double SCHOLAR_GRADE = 5.5;
	
	
	Student_2(){};
	
	Student_2(String n, double avrg){
		name = n;
		averageGrade = avrg;
	}
	
	public boolean scholarship() {
		if(averageGrade >= SCHOLAR_GRADE) {return true;}
		
		return false;
	}
	
	public void setName (String newName) {
		this.name = newName;
		return;
	}
	
	public void setAverageGrade(double newGrade) {
		this.averageGrade = newGrade;
		return;
	}
	
	public double getAverageGrade() {
		return averageGrade;
	}
	
	public String getName() {
		return name;
	}
	
	
}
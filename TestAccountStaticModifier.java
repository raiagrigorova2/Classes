package Classes;

public class TestAccountStaticModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * �������� ������� ��������, ����� ������� ����� Account � id �� ������a 1122 ,
		 * ����� �� 20 000 ������ � ������� ������ ������� �� 4,5%. ����������� ������
		 * �� ��������� �� �� ��������� $ 2500, ����������� ������ �� �������, �� ��
		 * ���������� $ 3000 � ����������� ������� �� ��������, ��������� ����� �
		 * ������, ������ � �������� ���� ������.
		 */
		AccountStaticModifier a = new AccountStaticModifier(1122,20_000);
		AccountStaticModifier.setYearInterestRate(4.5);
		a.withdraw(2500);
		a.deposit(3000);
		
		System.out.println("Balance: " + a.getBalance() +
				" Monthly interest rate: " + AccountStaticModifier.getMonthlyInterestRate()
				+ " Monthly interest: " + a.getMonthlyInterest()
				+ " Date created: " + a.getDateCreated());

	}

}

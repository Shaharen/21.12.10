package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		RegularEmployee regular = new RegularEmployee("201101", "�ں���", 4000, 800);

		// ���� ���
		System.out.println(regular.print());
		// �� �޿� ���
		System.out.println(regular.getMoneyPay() + "����");

		TempEmployee temp = new TempEmployee("201505", "��ȯ", 3000);

		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "����");

		PartTimeEmployee part = new PartTimeEmployee("201606", "����", 50000, 1);

		System.out.println(part.print());
		System.out.println(part.getMoneyPay() + "��");
		
		Manager manager = new Manager("200101", "����", 5000, 1000);
		
		System.out.println(manager.print());
		System.out.println(manager.getMoneyPay() + "����");
		
	}

}

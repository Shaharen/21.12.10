package Exam04;

public class PartTimeEmployee extends Employee {
	// �ڽ� Ŭ���������� ������ ��ӹ��� �߻�޼ҵ尡 �����Ǿ����

//	String empno; // ���
//	String name; // �̸�
//	int pay; // �ϴ�
	int workDay; // �ϼ�

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);
//		this.empno = empno;
//		this.name = name;
//		this.pay = pay;
		this.workDay = workDay;
	}

	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

//	@Override
//	public String print() {
//		return empno + " : " + name + " : " + pay;
//	}

}

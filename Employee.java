package Exam04;

public abstract class Employee {
	// ����Ǵ� �ʵ�
	String empno; // ���
	String name;// �̸�
	int pay;// ����, �ϴ�
	
	// �߻�Ŭ���� ������
	public Employee(String empno, String name, int pay) {
		
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();

//	public abstract String print();
	
	public String print(){
		return empno + " : " + name + " : " + pay;
	}
	
}

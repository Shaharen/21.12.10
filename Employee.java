package Exam04;

public abstract class Employee {
	// 공통되는 필드
	String empno; // 사번
	String name;// 이름
	int pay;// 연봉, 일당
	
	// 추상클래스 생성자
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

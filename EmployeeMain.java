package Exam04;

public class EmployeeMain {

	public static void main(String[] args) {
		RegularEmployee regular = new RegularEmployee("201101", "박병관", 4000, 800);

		// 정보 출력
		System.out.println(regular.print());
		// 월 급여 출력
		System.out.println(regular.getMoneyPay() + "만원");

		TempEmployee temp = new TempEmployee("201505", "승환", 3000);

		System.out.println(temp.print());
		System.out.println(temp.getMoneyPay() + "만원");

		PartTimeEmployee part = new PartTimeEmployee("201606", "수민", 50000, 1);

		System.out.println(part.print());
		System.out.println(part.getMoneyPay() + "원");
		
		Manager manager = new Manager("200101", "동원", 5000, 1000);
		
		System.out.println(manager.print());
		System.out.println(manager.getMoneyPay() + "만원");
		
	}

}

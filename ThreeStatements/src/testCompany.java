
public class testCompany {
	
	public static void main(String Args[]){
		/*
		Company testCompany = new Company(1300, 100, 200, 1100, 500, 600);
		System.out.println(testCompany);
		testCompany.changeDepreciation(10);
		System.out.println(testCompany);
		*/
		
		IncomeStatement test = new IncomeStatement(1300, 100 ,200);
		test.printTable();
		
		BalanceSheet sheet = new BalanceSheet(500, 400, 100);
		sheet.printTable();
		
		CashFlowStatement state = new CashFlowStatement(100,600);
		state.printTable();
	}

}

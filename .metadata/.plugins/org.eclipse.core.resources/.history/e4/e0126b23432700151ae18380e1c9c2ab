
public class Company {
	
	
	public IncomeStatement currentCompanyIS;
	public IncomeStatement endCompanyIS;
	
	public BalanceSheet  currentCompanyBS;
	public BalanceSheet endCompanyBS;
	
	public CashFlowStatement currentCompanyCF;
	public CashFlowStatement endCompanyCF;
	
	public Company(int cash, double taxRate){
		currentCompanyIS = new IncomeStatement(0,0,0);
		currentCompanyBS = new BalanceSheet(cash,0,0);
		currentCompanyCF = new CashFlowStatement(cash,0);
		currentCompanyIS.setTaxRate(taxRate);
		
	}
	
	
	

	
	public void printTable(){
		update();
		currentCompanyIS.printTable();
		currentCompanyBS.printTable();
		currentCompanyCF.printTable();
	}
	
	public void update(){
		 recalculate();		
		//Update net Income
		currentCompanyCF.setNetIncome(currentCompanyIS.getNetIncome());
		recalculate();
		currentCompanyBS.setCash(currentCompanyCF.getEndCash());
		
		
	}
	
	
	public void recalculate(){
		currentCompanyIS.update();
		currentCompanyBS.update();
		currentCompanyCF.update();
		
	}
	
	//Changes in the income statement
	/*
	public void changeRevenue(int change){
		endCompanyIS.setRevenue(endCompanyIS.getRevenue() + change);
		update();
	}
	
	public void changeOperatingExpenses(int change){
		endCompanyIS.setOperatingExpenses(endCompanyIS.getOperatingExpenses() + change);
		update();
	}
	
	public void changeDepreciation(int change){
		endCompanyIS.setDepreciation(endCompanyIS.getDepreciation() + change);
		update();
	}
	public void changeStockBasedCompensation(int change){
		endCompanyIS.setStockBasedCompensation(endCompanyIS.getStockBasedCompensation() + change);
		update();
	}
	
	public void changeAmortizationOfIntangibles(int change){
		endCompanyIS.setAmortizationOfIntangibles(endCompanyIS.getAmortizationOfIntangibles() + change);
		update();
	}
	
	public void changeInterestIncome(int change){
		endCompanyIS.setInterestIncome(endCompanyIS.getInterestIncome() + change);
		update();
	}
	
	public void changeInterestExpense(int change){
		endCompanyIS.setInterestExpense(endCompanyIS.getInterestExpense() + change);
		update();
	}
	
	public void changeSaleOfPPE(int change){
		endCompanyIS.setSaleOfPPE(endCompanyIS.getSaleOfPPE() + change);
		update();
	}
	
	public void changeSaleOfST(int change){
		endCompanyIS.setSaleOfST(endCompanyIS.getSaleOfST() + change);
		update();
	}
	
	public void changeGoodwillAppairment(int change){
		endCompanyIS.setGoodwillImpairment(endCompanyIS.getGoodwillImpairment() + change);
		update();
		
	}
	
	public void changePPEwritedown(int change){
		endCompanyIS.setPPEwritedown(endCompanyIS.getPPEwritedown() + change);
		update();
	}
	
	public void changeDeferredPortionOfIncomeTaxes(int change){
		endCompanyIS.setDeferredPortionOfIncomeTaxes(endCompanyIS.getDeferredPortionOfIncomeTaxes() + change);
		update();
	}
	*/
	//Changes in the income statement
	
	
	
	

}

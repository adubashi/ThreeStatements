
public class Company {
	/*
	 * Revenue Increases By:
Operating Expenses Increases By:

Depreciation Increases By:
Stock-Based Compensation Increases By:
Amortization of Intangibles Increases By:

Interest Income Increases By:
Interest Expense Increases By:
Gain / (Loss) on Sale of PP&E Changes By:
Gain / (Loss) on Sale of ST Investments Changes By:
Goodwill Impairment Increases By:
PP&E Write-Down Increases By:

Deferred Income Taxes Increases By:

	 */
	
	public IncomeStatement currentCompanyIS;
	public IncomeStatement endCompanyIS;
	
	public Company(int revenue, int cogs, int operatingExpenses){
		currentCompanyIS = new IncomeStatement(revenue, cogs, operatingExpenses);
		endCompanyIS = new IncomeStatement(revenue, cogs, operatingExpenses);
		this.update();		
	}
	
	@Override
	public String toString(){
		update();
		return "Current Company: " + currentCompanyIS.toString() + "End of Period Company: " + 
		endCompanyIS.toString();
		
	}
	
	public void update(){
		currentCompanyIS.update();
		endCompanyIS.update();	
	}
	
	//Changes in the income statement
	
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
	
	//Changes in the income statement
	
	
	
	

}

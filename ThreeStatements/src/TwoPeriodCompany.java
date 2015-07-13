
public class TwoPeriodCompany {
	
	public Company currentCompany;
	public Company endCompany;
	
	
	public TwoPeriodCompany(int cash, double taxRate){
		
		currentCompany = new Company(cash, taxRate);
		endCompany = new Company(cash, taxRate);
		initialize();
		
	}
	
	public void initialize(){
				//Company One 
				//Income Statement
				currentCompany.currentCompanyIS.setRevenue(1300);
				currentCompany.currentCompanyIS.setCogs(100);
				currentCompany.currentCompanyIS.setOperatingExpenses(200);
				
				//Balance Sheet
				currentCompany.currentCompanyBS.setShortTermInvestments(100);
				currentCompany.currentCompanyBS.setAccountsReceivable(100);
				currentCompany.currentCompanyBS.setPrepaidExpenses(100);
				currentCompany.currentCompanyBS.setInventory(100);
				
				currentCompany.currentCompanyBS.setPPE(1000);
				currentCompany.currentCompanyBS.setIntangibleAssets(200);
				currentCompany.currentCompanyBS.setLongTermInvestments(100);
				currentCompany.currentCompanyBS.setGoodwill(100);
				
				currentCompany.currentCompanyBS.setRevolver(100);
				currentCompany.currentCompanyBS.setAccountsPayable(200);
				currentCompany.currentCompanyBS.setAccruedExpenses(200);
				
				currentCompany.currentCompanyBS.setDeferredRevenue(200);
				currentCompany.currentCompanyBS.setDeferredTaxLiability(200);
				currentCompany.currentCompanyBS.setLongTermDebt(100);
				
				currentCompany.currentCompanyBS.setCommonStock(600);
				currentCompany.currentCompanyBS.setTreasuryStock(-100);
				currentCompany.currentCompanyBS.setRetainedEarnings(300);
				currentCompany.currentCompanyBS.setOtherIncome(100);
				
				//Company Two 
				//Income Statement
				endCompany.currentCompanyIS.setRevenue(1300);
				endCompany.currentCompanyIS.setCogs(100);
				endCompany.currentCompanyIS.setOperatingExpenses(200);
				
				//Balance Sheet
				endCompany.currentCompanyBS.setShortTermInvestments(100);
				endCompany.currentCompanyBS.setAccountsReceivable(100);
				endCompany.currentCompanyBS.setPrepaidExpenses(100);
				endCompany.currentCompanyBS.setInventory(100);
				
				endCompany.currentCompanyBS.setPPE(1000);
				endCompany.currentCompanyBS.setIntangibleAssets(200);
				endCompany.currentCompanyBS.setLongTermInvestments(100);
				endCompany.currentCompanyBS.setGoodwill(100);
				
				endCompany.currentCompanyBS.setRevolver(100);
				endCompany.currentCompanyBS.setAccountsPayable(200);
				endCompany.currentCompanyBS.setAccruedExpenses(200);
				
				endCompany.currentCompanyBS.setDeferredRevenue(200);
				endCompany.currentCompanyBS.setDeferredTaxLiability(200);
				endCompany.currentCompanyBS.setLongTermDebt(100);
				
				endCompany.currentCompanyBS.setCommonStock(600);
				endCompany.currentCompanyBS.setTreasuryStock(-100);
				endCompany.currentCompanyBS.setRetainedEarnings(300);
				endCompany.currentCompanyBS.setOtherIncome(100);
		
	}
	
	public void printTable(){
		System.out.println("CURRENT COMPANY");
		currentCompany.printTable();
		System.out.println("END COMPANY");
		endCompany.printTable();
	}
	
	//////////////////Changes in Income Statement/////////////////////////
	public void changeRevenue(int increment){
		endCompany.currentCompanyIS.setRevenue(endCompany.currentCompanyIS.getRevenue() + increment);
	}
	
	public void changeOperatingExpenses(int increment){
		endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
	}
	
	public void changeDepreciation(int increment){
		endCompany.currentCompanyIS.setDepreciation(endCompany.currentCompanyIS.getDepreciation() + increment);
	}
	
	public void changeStockBasedCompensation(int increment){
		endCompany.currentCompanyIS.setStockBasedCompensation(endCompany.currentCompanyIS.getStockBasedCompensation() + increment);
	}
	
	public void changeAmortizationOfIntangibles(int increment){
		endCompany.currentCompanyIS.setAmortizationOfIntangibles(endCompany.currentCompanyIS.getAmortizationOfIntangibles() + increment);
	}
	public void changeInterestIncome(int increment){
		endCompany.currentCompanyIS.setInterestIncome(endCompany.currentCompanyIS.getInterestIncome() + increment);
	}
	public void changeInterestExpense(int increment){
		endCompany.currentCompanyIS.setInterestExpense(endCompany.currentCompanyIS.getInterestExpense() + increment);
	}
	
	public void changeSaleOfPPE(int increment){
		endCompany.currentCompanyIS.setSaleOfPPE(endCompany.currentCompanyIS.getSaleOfPPE() + increment);
	}
	public void changeSaleOfST(int increment){
		endCompany.currentCompanyIS.setSaleOfST(endCompany.currentCompanyIS.getSaleOfST() + increment);
	}
	
	public void changeGoodwillImpairment(int increment){
		endCompany.currentCompanyIS.setGoodwillImpairment(endCompany.currentCompanyIS.getGoodwillImpairment() + increment);
	}
	
	public void changePPEwritedown(int increment){
		endCompany.currentCompanyIS.setPPEwritedown(endCompany.currentCompanyIS.getPPEwritedown() + increment);
	}
	
	public void changeDeferredIncomeTaxes(int increment){
		endCompany.currentCompanyIS.setDeferredPortionOfIncomeTaxes(endCompany.currentCompanyIS.getDeferredPortionOfIncomeTaxes() + increment);
	}
	
	//Balance Sheet Items
	public void changeAccountsReceivable(int increment){
		endCompany.currentCompanyIS.setRevenue(endCompany.currentCompanyIS.getRevenue() + increment);
		endCompany.currentCompanyCF.setChangesInaccountsReceivable(-1 * increment);
		endCompany.currentCompanyBS.setAccountsReceivable(endCompany.currentCompanyBS.getAccountsReceivable() + 2*increment);
	}
	
	public void changeAccountsPayable(int increment){
		endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
		endCompany.currentCompanyCF.setChangesInaccountsPayable(increment);
		endCompany.currentCompanyBS.setAccountsPayable(endCompany.currentCompanyBS.getAccountsPayable());
	}
	
	
	public void changePrepaidExpenses(int increment){
		endCompany.currentCompanyCF.setChangesInprepaidExpenses(-increment);
	}
	
	public void changeInventory(int increment){
		endCompany.currentCompanyCF.setChangesIninventory(-increment);
		endCompany.currentCompanyBS.setInventory(endCompany.currentCompanyBS.getInventory() + increment);
	}
	
	public void changeAccruedExpenses(int increment){
		endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
		endCompany.currentCompanyCF.setChangesInaccruedExpenses(increment);
	}
	
	public void changeDeferredRevenue(int increment){
		//endCompany.currentCompanyIS.setOperatingExpenses(endCompany.currentCompanyIS.getOperatingExpenses() + increment);
		endCompany.currentCompanyCF.setChangesIndeferredRevenue(increment);
	}
	
	



}

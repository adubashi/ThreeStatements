
public class CashFlowStatement {
	private int netIncome;
	
	//Non cash expenses
	private int depreciation;
	private int stockBasedCompensation;
	private int amortizationOfIntangibles;
	private int deferredIncomeTaxes;
	private int gainOnSaleOfPPE;
	private int gainOnSaleOfST;
	private int goodwillImpairment;
	private int PPEwritedown;
	
	//Changes in operating assets and liabilities 
	private int changesInaccountsReceivable;
	private int changesInprepaidExpenses;
	private int changesIninventory;
	private int changesInaccountsPayable;
	private int changesInaccruedExpenses;
	private int changesIndeferredRevenue;
	
	//Cash flow from operations 
	private int CFfromOperations;
	
	//Cash flow from Investing
	private int purchaseShortTermInvestments;
	private int sellShortTermInvestments;
	private int purchaseLongTermInvestments;
	private int sellLongTermInvestments;
	private int capitalExpenditures;
	private int PPEsaleProceeds;
	
	private int CFfromInvesting;
	
	//Cash flow from Financing
	private int dividendsIssued;
	private int issueLongTermDebt;
	private int repayLongTermDebt;
	private int issueShortTermDebt;
	private int repayShortTermDebt;
	private int repurchaseShares;
	private int issueNewShares;
	
	private int CFfromFinancing;
	
	private int beginningCash;
	private int increaseInCash;
	private int endCash;
	
	public CashFlowStatement(int beginningCash, int netIncome){
		this.beginningCash = beginningCash;
		this.netIncome = netIncome;
		
	}
	
	public void calculateCFfromOperations(){
		this.CFfromOperations = this.depreciation + this.stockBasedCompensation + this.amortizationOfIntangibles +
				                this.deferredIncomeTaxes + this.gainOnSaleOfPPE + this.gainOnSaleOfST +
				                this.PPEwritedown + this.changesInaccountsReceivable + this.changesInprepaidExpenses 
				                + this.changesIninventory + this.changesInaccountsPayable + this.changesInaccruedExpenses +
				                this.changesIndeferredRevenue + this.netIncome;
	}
	
	public void calculateCFfromInvesting(){
		this.CFfromInvesting = this.purchaseShortTermInvestments + this.sellShortTermInvestments + this.purchaseLongTermInvestments +
				               this.sellLongTermInvestments + this.capitalExpenditures + this.PPEsaleProceeds;
	}
	
	public void calculateCFfromFinancing(){
		this.CFfromFinancing = -this.dividendsIssued + this.issueLongTermDebt - this.repayLongTermDebt
				+ this.issueShortTermDebt - this.repayShortTermDebt - this.repurchaseShares + this.issueNewShares;	
	}
	
	public void calculateIncreaseInCash(){
		this.increaseInCash = this.CFfromFinancing + this.CFfromInvesting + this.CFfromOperations;
	}
	
	public void calculateCash(){
		this.endCash = this.beginningCash + this.increaseInCash;
	}
	
	public void update(){
		calculateCFfromOperations();
		calculateCFfromInvesting();
		calculateCFfromFinancing();
		calculateIncreaseInCash();
		calculateCash();
	}
	
	public void printTable(){
		update();
		System.out.println("----------------------------------------------------");
		System.out.format("%32s", "CASH FLOW STATEMENT");
		System.out.println();
		System.out.format("%32s%10d", "Net Income", this.netIncome);
		System.out.println();
		System.out.format("%32s", "NON-CASH EXPENSES & OTHER ADJUSTMENTS");
		System.out.println();
		System.out.format("%32s%10d", "Depreciation", this.depreciation);
		System.out.println();
		System.out.format("%32s%10d", "Amortization of Intangibles", this.amortizationOfIntangibles);
		System.out.println();
		System.out.format("%32s%10d", "Deferred Income Taxes", this.deferredIncomeTaxes);
		System.out.println();
		System.out.format("%32s%10d", "Gain On Sale of PPE", this.gainOnSaleOfPPE);
		System.out.println();
		System.out.format("%32s%10d", "Gain On Sale of PPE", this.gainOnSaleOfST);
		System.out.println();
		System.out.format("%32s%10d", "Goodwill Impairment", this.goodwillImpairment);
		System.out.println();
		System.out.format("%32s%10d", "PPE Writedown", this.PPEwritedown);
		System.out.println();
		System.out.format("%32s", "CHANGES IN OPERATING ASSETS & LIABILITIES");
		System.out.println();
		System.out.format("%32s%10d", "Accounts Receivable", this.changesInaccountsReceivable);
		System.out.println();
		System.out.format("%32s%10d", "Prepaid Expenses:", this.changesInprepaidExpenses);
		System.out.println();
		System.out.format("%32s%10d", "Inventory", this.changesIninventory);
		System.out.println();
		System.out.format("%32s%10d", "Accounts Payable", this.changesInaccountsPayable);
		System.out.println();
		System.out.format("%32s%10d", "Accrued Expenses", this.changesInaccruedExpenses);
		System.out.println();
		System.out.format("%32s%10d", "Deferred Revenue", this.changesIndeferredRevenue);
		System.out.println();
		System.out.format("%32s%10d", "CASH FLOW FROM OPERATIONS", this.CFfromOperations);
		System.out.println();
		System.out.format("%32s", "INVESTING ACTIVITIES");
		System.out.println();
		System.out.format("%32s%10d", "Purchase Short Term Investments", this.purchaseShortTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Sell Short Term Investments", this.sellShortTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Purchase Long Term Investments", this.purchaseLongTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Sell Long Term Investments", this.purchaseLongTermInvestments);
		System.out.println();
		System.out.format("%32s%10d", "Capital Expenditures", this.capitalExpenditures);
		System.out.println();
		System.out.format("%32s%10d", "PPE sale proceeds", this.PPEsaleProceeds);
		System.out.println();
		System.out.format("%32s%10d", "CASH FLOW FROM INVESTING", this.CFfromInvesting);
		System.out.println();
		System.out.format("%32s", "FINANCING ACTIVITIES");
		System.out.println();
		System.out.format("%32s%10d", "Dividends Issued", this.dividendsIssued);
		System.out.println();
		System.out.format("%32s%10d", "Issue Long-Term Debt", this.issueLongTermDebt);
		System.out.println();
		System.out.format("%32s%10d", "Repay Long-Term Debt", this.repayLongTermDebt);
		System.out.println();
		System.out.format("%32s%10d", "Issue Short-Term Debt", this.issueShortTermDebt);
		System.out.println();
		System.out.format("%32s%10d", "Repay Short-Term Debt", this.repayShortTermDebt);
		System.out.println();
		System.out.format("%32s%10d", "Repurchase Shares", this.repurchaseShares);
		System.out.println();
		System.out.format("%32s%10d", "Issue New Shares", this.issueNewShares);
		System.out.println();
		System.out.format("%32s%10d", "CASH FLOW FROM FINANCING", this.CFfromFinancing);
		System.out.println();
		System.out.format("%32s%10d", "Beginning Cash", this.beginningCash);
		System.out.println();
		System.out.format("%32s%10d", "Increase in Cash", this.increaseInCash);
		System.out.println();
		System.out.format("%32s%10d", "End Cash", this.endCash);
		System.out.println();
		
		
		System.out.println("----------------------------------------------------");
	}
	
	

}

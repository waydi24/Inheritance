public class StoreOneA extends StoreToRent{
    private boolean specialCustomer;
    private double monthlyPayment;
    private boolean loanRequired;
    private double loanAmount;
    private int loanPaymentTerm;
    private static final double DISCOUNT_RATE = 0.1;
    
    
    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer){
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo(){
        System.out.println(toString()); 
    }
    
    public String toString(){
        return "Combining parent toString() \n" + super.toString() + 
               " LOAN DETAILS (if applicable):\r\n" + //
                                      " Loan Amount: " + super.getLoanAmount() +
                                      " Loan Payment Term: " + super.geetLoanPaymentTerm() +
                                      " Interest Rate: " + super.getINTEREST_RATE() +
                                      " Special Customer: " + specialCustomer +
                                      " Monthly Loan Payment: " + monthlyPayment;
    }

    public double calculateLoanFinancing(){
        monthlyPayment = super.calculateLoanFinancing();
        if(specialCustomer == true){
            monthlyPayment -= (monthlyPayment * DISCOUNT_RATE);
            return monthlyPayment;
        }else{
            return monthlyPayment;
        }
    }
}

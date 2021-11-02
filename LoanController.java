package controller;
import model.*;
public class LoanController {
       
    public Loan createLoan(int loanNumber, String borrowDate, boolean state) {
    
        Loan l = new Loan(loanNumber,borrowDate,state);
        boolean result = LoanContainer.getInstance().addLoan(l);        
        return (result) ? l : null;

    }   
    public Loan findLoanByNumber(int loanNumber){
        LoanContainer lc=LoanContainer.getInstance();
        return lc.findLoanByNumber(loanNumber);
    }
}
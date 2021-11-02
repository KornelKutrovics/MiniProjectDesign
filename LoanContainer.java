package model;
import java.util.ArrayList;
public class LoanContainer{
    private static LoanContainer instance = new LoanContainer();
    private ArrayList<Loan> loans;
    private LoanContainer(){
        loans = new ArrayList<>();
    }
    public static LoanContainer getInstance() {
        return instance;
    }
    public boolean addLoan(Loan l){
        return (l!=null) ? loans.add(l):false;
    }
    public Loan findLoanByNumber(int loanNumber){
        for(Loan list:loans){
            if(list.getLoanNumber()==loanNumber){
                return list;
            }
        }
        return null;
    }
}

package model;

public class Loan{
    private int loanNumber;
    private String borrowDate;
    private boolean state=false;
    public Loan(int loanNumber, String borrowDate, boolean state){
        this.loanNumber=loanNumber;
        this.borrowDate=borrowDate;
        this.state=state;
    }
    public int getLoanNumber(){
        return loanNumber;
    }
    public String getBorrowDate(){
        return borrowDate;
    }
    public boolean getState(){
        return state;
    }
}

package controller;
import model.*;
public class LPController {
       
    public LP createLP(int barcode, String title, String artist, String publicationDate) {
    
        LP lp = new LP(barcode,title,artist,publicationDate);
        boolean result = LPContainer.getInstance().addLP(lp);        
        return (result) ? lp : null;

    }   
    public LP findLPByBarcode(int barcode){
        LPContainer lpc=LPContainer.getInstance();
        return lpc.findLPByBarcode(barcode);
    }
    public void printAll(){
        LPContainer lpc=LPContainer.getInstance();
        lpc.printAll();
    }
}
package model;
import java.util.ArrayList;
public class LPContainer{
    private static LPContainer instance = new LPContainer();
    private ArrayList<LP> lps;
    private LPContainer(){
        lps = new ArrayList<>();
    }
    public static LPContainer getInstance() {
        return instance;
    }
    public boolean addLP(LP lp){
        return (lp!=null) ? lps.add(lp):false;
    }
    public LP findLPByBarcode(int barcode){
        for(LP list:lps){
            if(list.getBarcode()==barcode){
                return list;
            }
        }
        return null;
    }
    public void printAll(){
        for(LP list:lps){
            System.out.print(list.getBarcode()+"   ");
            System.out.print(list.getTitle()+"   ");
            System.out.print(list.getArtist()+"   ");
            System.out.println(list.getPublicationDate()+"   ");
        }
    }
}

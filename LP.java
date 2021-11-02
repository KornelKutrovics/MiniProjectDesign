package model;
public class LP{
    private int barcode;
    private String title, artist, publicationDate;
    public LP(int barcode, String title, String artist, String publicationDate){
        this.barcode=barcode;
        this.title=title;
        this.artist=artist;
        this.publicationDate=publicationDate;
    }
    public int getBarcode(){
        return barcode;
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public String getPublicationDate(){
        return publicationDate;
    }
}



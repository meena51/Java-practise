package OOPS.Assignment;
import java.util.*;
class Publication {
    String title;
    float price;
    Publication(String title, float price){
        this.title = title;
        this.price = price;
    }
    void displayInfo(){
        System.out.println("Title of the book:" + title);
        System.out.println("Price of the Book:"  + price);
    }

}
class Book extends Publication{
    int page_count;
    Book(String title, float price, int page_count){
        super(title,price);
        this.page_count = page_count;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Page Count : " +page_count);
    }
}
class Tape extends Publication{
    float mins;
    Tape(String title, float price, float mins){
        super(title,price);
        this.mins=mins;
    }
    void displayInfo(){
        super.displayInfo();
        System.out.println("Playing time : " + mins);
    }
}
public class Publish {
    public static void main(String args[]){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the title of the book:");
            String bookTitle = sc.nextLine();
            System.out.println("Enter the Price of the book:");
            float bookPrice = sc.nextFloat();
            System.out.println("Enter the Page count of the book");
            int pageCount = sc.nextInt();
            
            System.out.println("Enter the title of the Tape:");
            String tapeTitle = sc.nextLine();
            System.out.println("Enter the Price of the Tape:");
            float tapePrice = sc.nextFloat();
            System.out.println("Enter the Playing time of the Tape");
            float playingTime = sc.nextFloat();

            Book b =   new Book(bookTitle,bookPrice,pageCount);
            System.out.println("\nBook Information");
            b.displayInfo();

            Tape t =   new Tape(tapeTitle,tapePrice,playingTime);
            System.out.println("\nTape Information");
            t.displayInfo();
            
        }catch(Exception e){}
    }
    
}

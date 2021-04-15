/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc.ps2.onebyte;

/**
 *
 * @author AhsaanYamin
 */
public class Book {
    private int bookId;
    private String bookName;
    private int quantity;
    private double bookCost;

    public Book(int bookId,String bookName,double bookCost)
    {
        // INVARIANT
        assert this.quantity >= 0 :"Quantity can't be negative";
        assert this.bookCost >0 :"Product cost must be more than 0!";

        this.bookId=bookId;
        this.bookName=bookName;
        this.bookCost=bookCost;

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookId(){return bookId;}
    public String getBookName(){return bookName;}
    public int getQuantity(){return quantity;}
    public double getBookCost(){return bookCost;}

    public void printInfo(){
        System.out.println("Book ID: " + bookId);
        System.out.println("Book: " + bookName);
        System.out.println("Price: " + bookCost);
    }
}

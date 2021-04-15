/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc.ps2.onebyte;
import java.util.Vector;
/**
 *
 * @author AhsaanYamin
 */
public class Seller extends User implements ViewTotalNo {
    private int productsNum; //number of products seller added
    Vector<Book> myProducts;

    Seller(){

    }
    public Seller(int userId,String name) {
        super(userId,name);

        super.accountType="Seller";
        myProducts = new Vector<Book>();
        productsNum=myProducts.size();
    }

    public int getProductsNum() {
        return productsNum;
    }

    public void addBook(Book p) {
        myProducts.add(p);
    }

    public void  removeBook(Book p){
        assert myProducts.contains(p) : "The Book doesn't exist in your list";
        myProducts.remove(p);
    }

    public void updateQuantity(Book p, int q){

        p.setQuantity(q);
    }

    @Override
    public void printInfo() {
        System.out.println("    Seller Information");
        System.out.println("********************************");
        super.printInfo();
        getTotalItemsNo();
    }

    @Override
    public void getTotalItemsNo() {
        assert  myProducts != null : "There is no book list";
        productsNum=myProducts.size();
        System.out.println("Number of books: " + productsNum);

    }

    @Override
    public void addProduct(Book p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeProduct(Book p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


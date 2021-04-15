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
public class Customer extends User {
    private Seller S;
    private Address address;
    private double accountBalance;
    private Vector<Book> cart;


    public Customer(){
        // INVARIANT
        assert this.accountBalance >= 0 : "Account Balance Can not be negative";
    }


    public Customer(int userId, String name, double accountBalance){

        super(userId,name);

        // INVARIANT
        assert this.accountBalance > 0 : "Account Balance Can not be negative";

        this.accountBalance=accountBalance;
        super.accountType="Customer";
        address=new Address();
        Seller S=new Seller();
        cart= new Vector<Book>();
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Vector<Book> getCart() {
        return cart;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setSeller(Seller s) {
        S = s;
    }

    public Seller getSeller() {
        return S;
    }

    public void addBook(Book p) {
        assert accountBalance>p.getBookCost() : "no balance";
        if(accountBalance<p.getBookCost() && S.myProducts.contains(p)){
            System.out.println("You (" + name + ") Have insufficient balance to add Book: "+p.getBookName());
        }

        if (p.getQuantity()== 0){
            System.out.println("Book: "+p.getBookName() + " is sold out.");
        }

        if (!S.myProducts.contains(p)){
            System.out.println("Book: "+p.getBookName()+" is not Sold by " +
                    S.getName());
        }
        if((accountBalance>=p.getBookCost()) && (p.getQuantity()>0) && S.myProducts.contains(p)){
            accountBalance-=p.getBookCost();
            p.setQuantity(p.getQuantity()-1);
            cart.add(p);
        }
    }

    public void removeBook(Book p) {
//        assert cart.contains(p);
        if(cart.contains(p)){
            cart.remove(p);
            accountBalance+=p.getBookCost();
            p.setQuantity(p.getQuantity()+1);
        }
        else{
            System.out.println("Book: "+ p.getBookName() + "was not added to cart");
        }

    }

    @Override
    public void printInfo() {
        System.out.println("    Customer Information");
        System.out.println("********************************");
        super.printInfo();
        System.out.println("Address: " + address.getFullAddress());

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
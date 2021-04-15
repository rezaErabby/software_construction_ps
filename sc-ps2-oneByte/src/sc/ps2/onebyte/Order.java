/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sc.ps2.onebyte;
import java.util.*;
/**
 *
 * @author AhsaanYamin
 */
public class Order implements ViewTotalNo{
    Vector<Book> orderItems;
    Customer C;
    Seller S;
    private Date dateCreated;
    private int orderId;
    private double orderPrice;

    Order(int orderId){
        orderItems =new Vector<Book>();
        C= new Customer();
        S=new Seller();
        this.orderId=orderId;
    }
    public int getOrderId() {
        return orderId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setCart(Vector<Book> orderItems) {
        this.orderItems = orderItems;
    }

    public void setCustomer(Customer c) {
        C = c;
    }

    public void setSeller(Seller s) {
        S = s;
    }

    public double calcPrice(){
        assert orderItems.size()>0:"There are no items added to the order";
        orderPrice=0;
        for (int i=0;i<orderItems.size();i++){
            orderPrice+=orderItems.elementAt(i).getBookCost();
        }
        return orderPrice;
    }

    public void getTotalItemsNo() {
        System.out.println("Number of products in the Order: " + orderItems.size());

    }

    public void printOrder(){
        System.out.println(" ");
        System.out.println("Viewing Order: " + orderId + ". Sold by: "+S.getName()+". To: " + C.getName()+".");
        dateCreated=new Date();
        S.printInfo();
        C.printInfo();
        System.out.println("        Order Details");
        System.out.println("********************************");
        System.out.println("Order ID: " + orderId);
        System.out.println("Date: " + dateCreated);
        getTotalItemsNo();
        System.out.println("        Products");
        System.out.println("********************************");
        for(int i=0; i<orderItems.size();i++){
            System.out.println("* " + (i+1) +" *");
            orderItems.elementAt(i).printInfo();
        }
        System.out.println("Total order price: " + calcPrice());
        System.out.println("********************************");
        System.out.println(" ");
    }

}


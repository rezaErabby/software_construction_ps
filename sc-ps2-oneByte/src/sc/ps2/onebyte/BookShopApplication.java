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
public class BookShopApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Books
        Book shirt = new Book(231,"Shirt",54.99);
        Book pants = new Book(682,"Pants",119.99);
        Book shoes = new Book(102,"Shoes",84.90);
        Book shampoo = new Book(422,"Shampoo",15.45);
        Book bodyWash = new Book(422,"Body Wash",19.80);
        Book faceWash = new Book(422,"Face Wash",9.99);

        //Sellers
        Seller shopA = new Seller(1662,"H&M");
        Seller shopB = new Seller(1662,"Watsons");
        //Shop A books
        shopA.addProduct(shirt);
        shopA.updateQuantity(shirt,2);

        shopA.addProduct(pants);
        shopA.updateQuantity(shirt,2);

        shopA.addProduct(shoes);
        shopA.updateQuantity(shoes,3);

        //Shop B books
        shopB.addProduct(shampoo);
        shopB.updateQuantity(shampoo,10);

        shopB.addProduct(bodyWash);
        shopB.updateQuantity(bodyWash,0);

        shopB.addProduct(faceWash);
        shopB.updateQuantity(faceWash,7);

        //Addresses
        Address ad1 = new Address("No 2 Jalan Mawar", "Skudai", "Johor Bahru");
        Address ad2 = new Address("Block 1-7", "Cheras", "Kuala Lumpur");

        // Customers:
        Customer boy=new Customer(111,"John",140);
        boy.setAddress(ad1);

        Customer girl=new Customer(121,"Ashley",290);
        girl.setAddress(ad2);

        //Adding books
        boy.setSeller(shopA);
        girl.setSeller(shopB);

        boy.addProduct(shirt);
        boy.addProduct(pants);
        boy.addProduct(shoes);
        boy.addProduct(shampoo);

        girl.addProduct(shampoo);
        girl.addProduct(shampoo);
        girl.addProduct(bodyWash);
        girl.addProduct(faceWash);
        girl.addProduct(faceWash);
        girl.addProduct(faceWash);

        girl.removeProduct(shampoo);

        // Order
        Order boyOrder = new Order(1234561);
        boyOrder.setCustomer(boy);
        boyOrder.setSeller(boy.getSeller());
        boyOrder.setCart(boy.getCart());

        Order girlOrder = new Order(1234562);
        girlOrder.setCustomer(girl);
        girlOrder.setSeller(girl.getSeller());
        girlOrder.setCart(girl.getCart());

        //Printing Order
        boyOrder.printOrder();
        girlOrder.printOrder();
    }
    
}

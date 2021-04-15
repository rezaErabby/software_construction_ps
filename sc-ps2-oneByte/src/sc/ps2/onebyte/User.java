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
public abstract class User {
    protected int userId;
    protected String name;
    protected String accountType;

    public User(){
        accountType=null;
        // INVARIANT
        this.name = " ";
    }


    public User(int userId, String name) {
        this.name=name;
        this.userId=userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getName() {
        return name;
    }

    public void printInfo(){
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + name);
    }
    public abstract  void addProduct(Book p);
    public abstract  void removeProduct(Book p);
}


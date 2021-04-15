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
public class Address {
    private String street ;
    private String city ;
    private String state ;


    public  Address  ()
    {
    }

    public  Address  (String s ,String c , String st  )
    {
        street=s ;
        city = c ;
        state = st ;
    }

    public String getFullAddress()
    {
        return street +", " + city + ", "+ state ;
    }
}

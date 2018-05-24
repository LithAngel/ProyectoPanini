/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author camilowalteros
 */
public class Stadium extends Lamina{
    private String capacity;
    private String city;

    public Stadium(String capacity, String city, String name) {
        super(name);
        this.capacity = capacity;
        this.city = city;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String giveInfo() {
        String s = this.capacity + "\n" + this.city;
        return super.giveInfo() + s; 
    }
    
}

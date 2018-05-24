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
public class Lamina {
    protected String name;
    protected int number;
    protected int counter;
    protected static int cons = 1;
    //imagen
    
    public Lamina(String name){
        this.name = name;
        this.number = cons++;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public String giveInfo(){
        String s = this.number + "\n" + this.name + "\n";
        return s;
    }
    
}
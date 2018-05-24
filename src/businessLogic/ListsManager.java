/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

import data.*;
import java.util.ArrayList;

/**
 *
 * @author camilowalteros
 */
public class ListsManager {
    private ArrayList<Lamina> missing = new ArrayList <Lamina>();
    private ArrayList<Lamina> repeated = new ArrayList <Lamina>();
    private ArrayList<Lamina> got = new ArrayList <Lamina>();
    
    public ListsManager(){
        this.listsBuild();
    }
    
    public void listsBuild(){
        for(Lamina l : TeamLists.getTotalList()){
            switch(l.getCounter()){
                case 0 : missing.add(l);
                         break;
                case 1 : got.add(l);
                         break;
                default : got.add(l);
                          repeated.add(l);
                          break;
            }
        }
    }

    public ArrayList<Lamina> getMissing() {
        return missing;
    }

    public ArrayList<Lamina> getRepeated() {
        return repeated;
    }

    public ArrayList<Lamina> getGot() {
        return got;
    }
    
}

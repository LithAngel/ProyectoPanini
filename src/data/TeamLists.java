/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.ArrayList;

/**
 *
 * @author Sebastian
 */
public class TeamLists {
    private static ArrayList<Lamina> totalList = new ArrayList<Lamina>();
    private static ArrayList<Special> specialList = new ArrayList<Special>();
    private static ArrayList<Stadium> stadiumList = new ArrayList<Stadium>();
    private static ArrayList<Lamina> germanList = new ArrayList<Lamina>();
    private static ArrayList<Lamina> colombianList = new ArrayList<Lamina>();
    
    public TeamLists(){
        Special trophy = new Special("Trophy");
        Special ball = new Special("Ball");
        Stadium fishtStadium = new Stadium("48000","Sochi","Fisht Stadium");
        Stadium samaraArena = new Stadium("45482","Samara","Samara Arena");
        Special cShield = new Special("Colombia");
        Player ospina = new Player("David Ospina","GK","Arsenal FC","31/08/88");
        Player arias = new Player("Santiago Arias", "DF", "PSV Eindhoven", "13/01/92");
        Player cZapata = new Player("Cristian Zapata", "DF", "AC Milan", "30/09/86");
        Player dSanchez = new Player("Davinson Sanchez", "DF", "Totthenham Hotspur", "12/06/96");
        Player fabra = new Player("Frank Fabra", "DF", "Boca Juniors", "22/02/91");
        Player cSanchez = new Player("Carlos Sanchez", "MC", "Real Club Deportivo Espanyol", "06/02/86");
        Player cuadrado = new Player("Juan Gullermo Cuadrado", "MC", "Juventus", "26/05/88");
        Player james = new Player("James Rodriguez", "MC", "FC Bayern München", "12/07/91");
        Player aguilar = new Player("Abel Aguilar", "MC", "Deportivo Cali", "06/01/85");
        Player falcao = new Player("Radamel Falcao Garcia", "DL", "AS Monaco", "10/02/86");
        Player dZapata = new Player("Duvan Zapata", "DL", "UC Sampdoria", "01/04/91");
        Special gShield = new Special("Germany");
        Player neuer = new Player("Manuel Neuer", "GK", "FC Bayern München", "27/03/86");
        Player hummels = new Player("Mats Hummels", "DF", "FC Bayern München", "16/12/88");
        Player kimmich = new Player("Joshua Kimmich", "DF", "FC Bayern München", "08/02/95");
        Player boateng = new Player("Jerome Boateng", "DF", "FC Bayern München", "03/09/88");
        Player hector = new Player("Jonas Hector", "DF", "FC Köln", "27/05/90");
        Player draxler = new Player("Julian Draxler", "MC", "Paris Saint-Germain", "20/09/93");
        Player kroos = new Player("Toni Kroos", "MC", "Real Madrid CF", "04/01/90");
        Player khedira = new Player("Sami Khedira", "MC", "Juventus", "04/04/87");
        Player ozil = new Player("Mesut Özil", "MC", "Arsenal FC", "15/08/88");
        Player muller = new Player("Thomas Müller", "DL", "FC Bayern München", "13/09/89");
        Player werner = new Player("Timo Werner", "DL", "RB Leipzig", "06/03/96");
        
        totalList.add(trophy);
        totalList.add(ball);
        totalList.add(fishtStadium);
        totalList.add(samaraArena);
        totalList.add(cShield);
        totalList.add(ospina);
        totalList.add(arias);
        totalList.add(cZapata);
        totalList.add(dSanchez);
        totalList.add(fabra);
        totalList.add(cSanchez);
        totalList.add(cuadrado);
        totalList.add(james);
        totalList.add(aguilar);
        totalList.add(falcao);
        totalList.add(dZapata);
        totalList.add(gShield);
        totalList.add(neuer);
        totalList.add(hummels);
        totalList.add(kimmich);
        totalList.add(boateng);
        totalList.add(hector);
        totalList.add(draxler);
        totalList.add(kroos);
        totalList.add(khedira);
        totalList.add(ozil);
        totalList.add(muller);
        totalList.add(werner);
        
        specialList.add(trophy);
        specialList.add(ball);
        
        stadiumList.add(fishtStadium);
        stadiumList.add(samaraArena);
        
        germanList.add(gShield);
        germanList.add(neuer);
        germanList.add(hummels);
        germanList.add(kimmich);
        germanList.add(boateng);
        germanList.add(hector);
        germanList.add(draxler);
        germanList.add(kroos);
        germanList.add(khedira);
        germanList.add(ozil);
        germanList.add(muller);
        germanList.add(werner);
        
        colombianList.add(cShield);
        colombianList.add(ospina);
        colombianList.add(arias);
        colombianList.add(cZapata);
        colombianList.add(dSanchez);
        colombianList.add(fabra);
        colombianList.add(cSanchez);
        colombianList.add(cuadrado);
        colombianList.add(james);
        colombianList.add(aguilar);
        colombianList.add(falcao);
        colombianList.add(dZapata);

    }

    public static ArrayList<Lamina> getTotalList() {
        return totalList;
    }

    public static ArrayList<Special> getSpecialList() {
        return specialList;
    }

    public static ArrayList<Stadium> getStadiumList() {
        return stadiumList;
    }

    public static ArrayList<Lamina> getGermanList() {
        return germanList;
    }

    public static ArrayList<Lamina> getColombianList() {
        return colombianList;
    }
    
}

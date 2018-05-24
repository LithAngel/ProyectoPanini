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
public class Player extends Lamina{
    private String position;
    private String club;
    private String birthDate;

    public Player(String name, String position, String club, String birthDate) {
        super(name);
        this.position = position;
        this.club = club;
        this.birthDate = birthDate;
    }


    public String getPosition() {
        return position;
    }

    public String getClub() {
        return club;
    }

    public String getBirthDate() {
        return birthDate;
    }

    @Override
    public String giveInfo() {
        String s = this.birthDate + "\n" + this.club + "\n" + this.position;
        return super.giveInfo() + s;
    }
    
}

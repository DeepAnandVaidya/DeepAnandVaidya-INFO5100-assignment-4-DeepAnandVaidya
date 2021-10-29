/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deepv
 */
public class Community {

    private ArrayList<House> houses;
    private String city;

    public Community() {
        if (this.houses == null || this.houses.isEmpty()) {
            this.houses = new ArrayList<>();
        }
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void addhouse(House house) {
        houses.add(house);
        City city = new City();
        city.addCommunity(this);
    }

}

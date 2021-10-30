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
public class City {
//#EFE8E8

    private ArrayList<Community> communities;
    private System system;

    public City() {
        if (this.communities == null || this.communities.isEmpty()) {
            this.communities = new ArrayList<>();
        }
    }

    public ArrayList<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(ArrayList<Community> communities) {
        this.communities = communities;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public void addCommunity(Community community) {
        communities.add(community);
    }
    
    public ArrayList<Community> getAllCommunities(){
        return communities;
    }

}

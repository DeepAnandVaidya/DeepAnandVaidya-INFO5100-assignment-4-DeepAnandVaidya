/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author deepv
 */
public class House {

    private String houseNo;
    private PersonDirectory personDirectory;

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
   
    public void addHouse(String houseNum){
        this.houseNo = houseNum;
        Community community = new Community();
        community.addhouse(this);
    }
    
}

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
public class EncounterHistory {

    ArrayList<Encounter> encounterHistory;

    public EncounterHistory() {
        if (this.encounterHistory == null || this.encounterHistory.isEmpty()) {
            encounterHistory = new ArrayList<>();
        }
    }

    public ArrayList<Encounter> getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(ArrayList<Encounter> encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public Encounter addEncounter() {
        Encounter encounter = new Encounter();
        encounterHistory.add(encounter);
        return encounter;
    }

}

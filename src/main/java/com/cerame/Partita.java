package com.cerame;

import java.util.ArrayList;

public class Partita {
    private String stadio;
    private String competizione;
    private String partita;
    private int[] risultato;
    private Data data;
    private ArrayList<String> marcatoriPrimaSquadra = new ArrayList<>();
    private ArrayList<String> marcatoriSecondaSquadra = new ArrayList<>();

    public Partita(String stadio, String competizione, String partita, int[] risultato, Data data, 
                    ArrayList<String> marcatoriPrimaSquadra, ArrayList<String> marcatoriSecondaSquadra) {
        this.stadio = stadio;
        this.competizione = competizione;
        this.partita = partita;
        this.risultato = risultato;
        this.data = data;
        this.marcatoriPrimaSquadra = marcatoriPrimaSquadra;
        this.marcatoriSecondaSquadra = marcatoriSecondaSquadra;
    }

    public String getStadio() {
        return stadio;
    }

    public void setStadio(String stadio) {
        this.stadio = stadio;
    }

    public String getCompetizione() {
        return competizione;
    }

    public void setCompetizione(String competizione) {
        this.competizione = competizione;
    }

    public String getPartita() {
        return partita;
    }

    public void setPartita(String partita) {
        this.partita = partita;
    }

    public int[] getRisultato() {
        return risultato;
    }

    public void setRisultato(int[] risultato) {
        this.risultato = risultato;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public ArrayList<String> getMarcatoriPrimaSquadra() {
        return marcatoriPrimaSquadra;
    }

    public void setMarcatoriPrimaSquadra(ArrayList<String> marcatoriPrimaSquadra) {
        this.marcatoriPrimaSquadra = marcatoriPrimaSquadra;
    }

    public ArrayList<String> getMarcatoriSecondaSquadra() {
        return marcatoriSecondaSquadra;
    }

    public void setMarcatoriSecondaSquadra(ArrayList<String> marcatoriSecondaSquadra) {
        this.marcatoriSecondaSquadra = marcatoriSecondaSquadra;
    }

    
}

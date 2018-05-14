/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tomasz
 */
public class Samochod {

    /**
     * @param args the command line arguments
     */
    private String marka;
    private String nazwa;
    private int cena;
    private int vmax;

    public Samochod(String marka, String nazwa, int cena, int vmax) {
        this.marka = marka;
        this.nazwa = nazwa;
        this.cena = cena;
        this.vmax = vmax;
    }

    @Override
    public String toString() {
        return "\nMarka: " + this.marka + "\nNazwa: " + this.nazwa + "\nCena: " + this.cena + "\nPredkosc Max: " + this.vmax;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getVmax() {
        return vmax;
    }

    public void setVmax(int vmax) {
        this.vmax = vmax;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        List<Samochod> lista = new ArrayList<>();
        lista.add(new Samochod("Peugeot", "206", 7000, 150));
        lista.add(new Samochod("Opel", "Vectra", 14000, 200));
        lista.add(new Samochod("Volkswagen", "Passat", 10000, 190));
        lista.add(new Samochod("Renault", "Clio", 6000, 130));
        lista.add(new Samochod("Fiat", "Panda", 8500, 145));
        lista.add(new Samochod("Hyundai", "Tucson", 16300, 212));
        lista.add(new Samochod("Audi", "A6", 15000, 202));
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}

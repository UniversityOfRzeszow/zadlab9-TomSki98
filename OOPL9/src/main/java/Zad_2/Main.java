/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zad_2;

import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Tomasz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random losuj = new Random();
        Set<Integer> liczby = new TreeSet<>();
        for (int i = 0; i < 100; i++) {
            liczby.add(losuj.nextInt(1000));
        }
        Iterator it = liczby.iterator();
        int i = 0;
        while (it.hasNext()) {
            System.out.println(i + "." + it.next());
            i++;
        }
    }

}

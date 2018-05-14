/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9.Zad_1;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Tomasz
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Random losowanie = new Random();
        int liczby[] = new int[100];
        for (int i = 0; i < 100; i++) {
            liczby[i] = losowanie.nextInt(1001);

        }
        wyswietl(liczby);
        Thread.sleep(4000);
        sortowanie(liczby);
        wyswietl(liczby);

    }

    public static int[] sortowanie(int liczby[]) {
        Arrays.sort(liczby);
        return liczby;
    }

    public static void wyswietl(int liczby[]) {
        for (int i = 0; i < liczby.length; i++) {
            System.out.println("#########");
            System.out.println(i + "." + liczby[i]);
        }
    }

}

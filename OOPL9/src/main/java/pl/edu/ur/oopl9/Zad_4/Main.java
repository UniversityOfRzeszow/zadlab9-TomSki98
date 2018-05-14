/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9.Zad_4;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Tomasz
 */
public class Main {

    public static void main(String[] args) {
        Scanner skan = new Scanner(System.in);
        HashMap<String,String> slownik;
        slownik = new HashMap<>();
        slownik.put("poniewaz", "because");
        slownik.put("i", "and");
        slownik.put("ale", "but");
        slownik.put("ja", "I");
        slownik.put("ty", "You");
        slownik.put("on", "He");
        slownik.put("ona", "She");
        slownik.put("ono", "It");
        slownik.put("my", "We");
        slownik.put("wy", "You");
        slownik.put("oni", "They");
        slownik.put("one", "They");
        slownik.put("być", "be");
        slownik.put("robić", "do");
        slownik.put("spać", "sleep");
        slownik.put("iść", "go");
        slownik.put("biec", "run");
        slownik.put("jeść", "eat");
        slownik.put("pić", "drink");
        slownik.put("rysować", "paint");
        String xd;
        while(true){
            xd=skan.next();
            if(xd.equals("koniec!")){
                break;
            }
            System.out.println(slownik.get(xd));
        }
        
        
    }
    
}

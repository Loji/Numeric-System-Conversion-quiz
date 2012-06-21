/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jakobeks.wisielec;

import java.util.Random;

/**
 *
 * @author Jacob
 */
public class pytanie {
    public String tresc = "";
    public int poprawna;
    public String[] odpowiedzi = new String[4];
    
    private Random random = new Random();
    
    public pytanie() {
        String temporary = "Zamień liczbę ";
        
        int liczba = 0;
        liczba = random.nextInt(50)+10;
        int typ = random.nextInt(6);
        
        switch(typ) {
            case 0: {
                //dziesietny na 2
                temporary = temporary + liczba + " z systemu dziesiętnego na system binarny";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 3);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 3);
                    }
                break;
            }
            case 1: {
                //dziesietny na 16
                temporary = temporary + liczba + " z systemu dziesiętnego na system szesnastkowy";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 2);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 2);
                    }
                break;
            }
            case 2: {
                //2 na 10
                temporary = temporary + generuj(liczba, 3) + " z systemu binarnego na system dziesiętny";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 1);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 1);
                    }
                break;
            }
            case 3: {
                //2 na 16
                temporary = temporary + generuj(liczba, 3) + " z systemu binarnego na system szesnastkowy";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 2);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 2);
                    }
                break;
            }
            case 4: {
                //16 na 10 
                temporary = temporary + generuj(liczba, 2) + " z systemu szesnastkowego na system dziesiętny";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 1);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 1);
                    }
                break;
            }
            case 5: {
                //16 na 2
                temporary = temporary + generuj(liczba, 2) + " z systemu szesnastkowego na system binarny";
                poprawna = random.nextInt(4);
                odpowiedzi[poprawna] = generuj(liczba, 3);
                for(int i = 0; i<4; i++) 
                    if(i != poprawna ) {
                        int losuj = liczba;
                        while (losuj == liczba)
                            losuj = random.nextInt(18)+2;
                        odpowiedzi[i] = generuj(losuj, 3);
                    }
                break;
            }
            default:
                break;
        }
        tresc = temporary;
    }
    
    private String generuj(int liczba, int typ) {
        String temp = "";
        if(typ == 1) {
            //10
            temp = Integer.toString(liczba);
        }
        if(typ == 2) {
            //16
            temp = Integer.toHexString(liczba);
        }
        if(typ == 3) {
            //2
            temp = Integer.toBinaryString(liczba);
        }
        
        return temp;
    }
    
}

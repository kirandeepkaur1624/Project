/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdeliverable1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kirandeep Kaur
 */

public class UnoGame {
        private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public UnoGame(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    public static void main (String[] args){
        
    }
      
}





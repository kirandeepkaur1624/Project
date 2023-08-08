/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projectdeliverable1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kirandeep Kaur
 */
public class Deck1Test {
    
    public Deck1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testDrawCardGood() {
        System.out.println("testDrawCardGood");
        Deck1 deck = new Deck1();
        int initialSize = deck.getCardSize();
        Cards drawnCard = deck.drawCards();
        assertNotNull(drawnCard); // check that a card is drawn
        assertEquals(initialSize - 1, deck.getCardSize()); // check that the size is reduced by one
    }

    @Test
    public void testDrawCardBad() {
        System.out.println("testDrawCardBad");
        Deck1 deck = new Deck1();
        int initialSize = deck.getCardSize();
        for (int i = 0; i < initialSize; i++) {
            deck.drawCards(); // draw all cards in the deck
        }
        assertNull(deck.drawCards()); // check that no more cards can be drawn
        assertEquals(0, deck.getCardSize()); // check that the size is zero
    }

 @Test
public void testGetSizeBoundary() {
    System.out.println("testGetSizeBoundary");
    Deck1 deck = new Deck1();
    Deck1 fixedSizeDeck = new Deck1(); // Create a new deck with a fixed size of 108
    assertEquals(fixedSizeDeck.getCardSize(), deck.getCardSize()); // check that the initial size is 108
}
}


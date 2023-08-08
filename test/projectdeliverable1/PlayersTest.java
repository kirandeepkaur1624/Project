/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package projectdeliverable1;

import java.util.List;
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
public class PlayersTest {
    
    public PlayersTest() {
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
    public void testGetName() {
        System.out.println("getName");
        Players instance = null;
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetHandSize() {
        System.out.println("getHandSize");
        Players instance = null;
        int expResult = 0;
        int result = instance.getHandSize();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Cards card = null;
        Players instance = null;
        instance.addCard(card);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlayCard() {
        System.out.println("playCard");
        int index = 0;
        Players instance = null;
        Cards expResult = null;
        Cards result = instance.playCard(index);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    @Test
    public void testPlay() {
        System.out.println("play");
        Cards discardPile = null;
        Deck1 deck = null;
        Players instance = null;
        instance.play(discardPile, deck);
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetScore() {
        System.out.println("getScore");
        Players instance = null;
        int expResult = 0;
        int result = instance.getScore();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
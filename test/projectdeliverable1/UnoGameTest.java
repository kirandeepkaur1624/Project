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
public class UnoGameTest {
    
    public UnoGameTest() {
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
    public void testHasPlayerBoundary() {
    System.out.println("hasPlayer boundary");
    Players player1 = new Players("Alice");
    UnoGame instance = new UnoGame();
    instance.addPlayer(player1);
    boolean expResult = true;
    boolean result = instance.hasPlayer(player1);
    assertEquals(expResult, result);
}
    @Test
    public void testHasPlayerBad() {
    System.out.println("hasPlayer bad");
    Players player1 = new Players("Alice");
    Players player2 = new Players("Bob");
    UnoGame instance = new UnoGame();
    instance.addPlayer(player1);
    boolean expResult = false;
    boolean result = instance.hasPlayer(player2);
    assertEquals(expResult, result);
}
    @Test
    public void testHasPlayerGood() {
    System.out.println("hasPlayer good");
    Players player = new Players("Alice");
    UnoGame instance = new UnoGame();
    instance.addPlayer(player);
    boolean expResult = true;
    boolean result = instance.hasPlayer(player);
    assertEquals(expResult, result);
}
}

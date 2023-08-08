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
public class CardsTest {
    
    public CardsTest() {
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
public void testMatchesGood() {
    System.out.println("testMatchesGood");
    Cards card1 = new Cards("red", 5);
    Cards card2 = new Cards("red", 8);
    boolean result = card1.matches(card2);
    assertTrue(result); // check that the cards match
}

@Test
public void testMatchesBad() {
    System.out.println("testMatchesBad");
    Cards card1 = new Cards("red", 5);
    Cards card2 = new Cards("blue", 3);
    boolean result = card1.matches(card2);
    assertFalse(result); // check that the cards do not match
}

@Test
public void testMatchesBoundary() {
    System.out.println("testMatchesBoundary");
    Cards card1 = new Cards("green", 0);
    Cards card2 = new Cards("red", 0);
    boolean result = card1.matches(card2);
    assertTrue(result); // check that the cards match
}  
}
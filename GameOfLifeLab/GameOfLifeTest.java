
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 1011121314151617181920212223
         *  0 - - - - - - - - - - - - - - - - - - - - - - - - 
         *  1 - - - - - X X - - - - - - - - - - - - - - - - -
         *  2 - - - - - X X - - - - - - - - - - - X - - - - - 
         *  3 - - - - X - - - - - - - - - - - - - - X - - - - 
         *  4 - - - - - - - - - - - - - - - - - - X - X - - - 
         *  5 - - - - - - - - - - - - - - - - - - - - - - - -
         *  6 - - - - - - - - X - - - - - - - - - - - - - - -
         *  7 - - - - - - X X - X - - - - - - - - - - - - - - 
         *  8 - - - - - - - X - X - - - - - - - - - - - - - -
         *  9 - - - - - - - - X - X - - - - - - - - - - - - - 
         * 10 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 12 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 13 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 14 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 15 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 16 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 17 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 18 - - - - X X X - - - - - - - - - - - - - - - - - 
         * 19 - - - - X X - - - - - - - - - - - - - - - - - - 
         * 20 - - - - X X X X X - - - - - - - - - - - - - - - 
         * 21 - - - - X X - - - - - - - - - - - - - - - - - -
         * 22 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 23 - - - - - - - - - - - - - - - - - - - - - - - - 
         * 
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 1 && col == 5) ||
                        (row == 1 && col == 6) ||
                        (row == 2 && col == 5) ||
                        (row == 2 && col == 6) ||
                        (row == 3 && col == 4) ||
                        (row == 18 && col == 2) ||
                        (row == 18 && col == 4) ||
                        (row == 19 && col == 3) ||
                        (row == 20 && col == 4) ||
                        (row == 6 && col == 8) ||
                        (row == 7 && col == 6) ||
                        (row == 7 && col == 7) ||
                        (row == 7 && col == 9) ||
                        (row == 8 && col == 7) ||
                        (row == 8 && col == 9) ||
                        (row == 9 && col == 8) ||
                        (row == 9 && col == 10) ||
                        (row == 18 && col == 4) ||
                        (row == 18 && col == 5) ||
                        (row == 18 && col == 6) ||
                        (row == 19 && col == 4) ||
                        (row == 19 && col == 5) ||
                        (row == 20 && col == 4) ||
                        (row == 20 && col == 5) ||
                        (row == 20 && col == 6) ||
                        (row == 20 && col == 7) ||
                        (row == 20 && col == 8) ||
                        (row == 21 && col == 4) ||
                        (row == 21 && col == 5))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
         */
        
        // ...
    }
}


import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 24;
    private final int COLS = 24;
    
    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // constants for the location of the three cells initially alive
        final int X1 = 1, Y1 = 5;
        final int X2 = 1, Y2 = 6;
        final int X3 = 2, Y3 = 5;
        final int X4 = 2, Y4 = 6;
        final int X5 = 3, Y5 = 4;
        final int X6 = 2, Y6 = 18;
        final int X7 = 4, Y7 = 18;
        final int X8 = 3, Y8 = 19;
        final int X9 = 4, Y9 = 20;
        final int X10 = 6, Y10 = 8;
        final int X11 = 7, Y11 = 6;
        final int X12 = 7, Y12 = 7;
        final int X13 = 7, Y13 = 9;
        final int X14 = 8, Y14 = 7;
        final int X15 = 8, Y15 = 9;
        final int X16 = 9, Y16 = 8;
        final int X17 = 9, Y17 = 10;
        final int X18 = 18, Y18 = 4;
        final int X19 = 18, Y19 = 5;
        final int X20 = 18, Y20 = 6;
        final int X21 = 19, Y21 = 4;
        final int X22 = 19, Y22 = 5;
        final int X23 = 20, Y23 = 4;
        final int X24 = 20, Y24 = 5;
        final int X25 = 20, Y25 = 6;
        final int X26 = 20, Y26 = 7;
        final int X27 = 20, Y27 = 8;
        final int X28 = 21, Y28 = 4;
        final int X29 = 21, Y29 = 5;

        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock5);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock6);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock7);
        
        Rock rock8 = new Rock();
        Location loc8 = new Location(X8, Y8);
        grid.put(loc8, rock8);
        
        Rock rock9 = new Rock();
        Location loc9 = new Location(X9, Y9);
        grid.put(loc9, rock9);
        
        Rock rock10 = new Rock();
        Location loc10 = new Location(X10, Y10);
        grid.put(loc10, rock10);
        
        Rock rock11 = new Rock();
        Location loc11 = new Location(X11, Y11);
        grid.put(loc11, rock11);
        
        Rock rock12 = new Rock();
        Location loc12 = new Location(X12, Y12);
        grid.put(loc12, rock12);
        
        Rock rock13 = new Rock();
        Location loc13 = new Location(X13, Y13);
        grid.put(loc13, rock13);
        
        Rock rock14 = new Rock();
        Location loc14 = new Location(X14, Y14);
        grid.put(loc14, rock14);
        
        Rock rock15 = new Rock();
        Location loc15 = new Location(X15, Y15);
        grid.put(loc15, rock15);
        
        Rock rock16 = new Rock();
        Location loc16 = new Location(X16, Y16);
        grid.put(loc16, rock16);
        
        Rock rock17 = new Rock();
        Location loc17 = new Location(X17, Y17);
        grid.put(loc17, rock17);
        
        Rock rock18 = new Rock();
        Location loc18 = new Location(X18, Y18);
        grid.put(loc18, rock18);
        
        Rock rock19 = new Rock();
        Location loc19 = new Location(X19, Y19);
        grid.put(loc19, rock19);
        
        Rock rock20 = new Rock();
        Location loc20 = new Location(X20, Y20);
        grid.put(loc20, rock20);
        
        Rock rock21 = new Rock();
        Location loc21 = new Location(X21, Y21);
        grid.put(loc21, rock21);
        
        Rock rock22 = new Rock();
        Location loc22 = new Location(X22, Y22);
        grid.put(loc22, rock22);
        
        Rock rock23 = new Rock();
        Location loc23 = new Location(X23, Y23);
        grid.put(loc23, rock23);
        
        Rock rock24 = new Rock();
        Location loc24 = new Location(X24, Y24);
        grid.put(loc24, rock24);
        
        Rock rock25 = new Rock();
        Location loc25 = new Location(X25, Y25);
        grid.put(loc25, rock25);
        
        Rock rock26 = new Rock();
        Location loc26 = new Location(X26, Y26);
        grid.put(loc26, rock26);
        
        Rock rock27 = new Rock();
        Location loc27 = new Location(X27, Y27);
        grid.put(loc27, rock27);
        
        Rock rock28 = new Rock();
        Location loc28 = new Location(X28, Y28);
        grid.put(loc28, rock28);
        
        Rock rock29 = new Rock();
        Location loc29 = new Location(X29, Y29);
        grid.put(loc29, rock29);
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors
        Grid<Actor> grid = world.getGrid();
        
        // makes an arraylist for alive and dead cells
        ArrayList<Location> aliveCell = new ArrayList<Location>();
        ArrayList<Location> deadCell = new ArrayList<Location>();
        
        // goes thorugh each cell in the grid
        for (int row = 0;row <= 23; row++)
        {
            for (int col = 0;col <= 23; col++)
            {
                // creates a location object for each position and checks for surrounding cells
                Location loc = new Location(row,col);
                ArrayList<Location> neighbors = grid.getOccupiedAdjacentLocations(loc);
                
                // checks for conditions for dead cells
                if ((neighbors.size() == 3) && this.getActor(row,col) == null)
                {
                    aliveCell.add(loc);
                }
                else if((this.getActor(row,col) == null))
                {
                    deadCell.add(loc);
                }
                
                // checks for conditions for alive cells
                if (((neighbors.size() < 2) && this.getActor(row,col) != null))
                {
                    deadCell.add(loc);
                }
                else if ((neighbors.size() > 3) && this.getActor(row,col) != null)
                {
                    deadCell.add(loc);
                }
                else if(this.getActor(row,col) != null)
                {
                    aliveCell.add(loc);
                }
                
            }
        }
        
        // takes alive cells from corresponding list and adds it onto next grid
        for (Location location : aliveCell)
        {
            Rock rock1 = new Rock();
            grid.put(location,rock1);
        
        }
        
        // takes dead cells from corresponding list and adds it onto next grid
        for (Location location : deadCell)
        {
            Rock rock1 = new Rock();
            grid.remove(location);
        
        }
        
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        game.populateGame();
        
        // loops and runs 10 times 
        for (int i = 0;i < 10;i++)
        {
            game.createNextGeneration();
            Thread.sleep(500);
        }
    }

}

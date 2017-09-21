
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        countPile();
        moveSpaces();
    }
    
   public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    }
    
    public void faceNorth() {
        if (!facingNorth()
        turnLeft();
    }
    
    public void countPile() {
        faceNorth();
            while (nextToABeeper())
            { pickBeeper();
              while(nextToABeeper())
              {
                  pickBeeper();
                  turnRight();
                  while (nextToABeeper())
                  {
                      pickBeeper();
                      turnLeft();
                      turnLeft();
                      while (nextToABeeper())
                      { 
                        pickBeeper();
                        turnLeft();
                        }
                    }
              }
    }
}

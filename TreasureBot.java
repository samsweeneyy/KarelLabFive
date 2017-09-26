
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    
    int beepers = 0;
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        while(beepers != 5) {
            countPile();
            moveSpaces();
        }
    }
    
   public void turnRight(){
       turnLeft();
       turnLeft();
       turnLeft();
    }
    
    public void faceNorth() {
        if (!facingNorth()) {
        turnLeft();
    }
}

public void moveSpaces() {
    while (!nextToABeeper()) {
        move();
    }
}

    public void countPile() {
        turnSofacingNorth();
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

public void turnSofacingNorth() {
        while (!facingNorth()) {
        turnLeft();
    }
}
}


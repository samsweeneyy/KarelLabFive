
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public int beepers;
    public boolean even;
    
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        countPile();
        moveEorW();
        countSafePile();
    }
   
    public void countPile() {
            while (nextToABeeper())
            { pickBeeper();
            beepers ++;
        }
        if (beepers % 2 == 0){
            even=true;
        }
    }
    
    public void moveEorW() {
            if (even ==true)
            {
                turnRight();
                move();
        } 
        else 
        {
                turnLeft();
                move();
            }
    }
    
        public void countSafePile(){
            pickBeeper();
            beepers++;
    }
    
        public void turnRight() {
            turnLeft();
            turnLeft();
            turnLeft();
    }
}

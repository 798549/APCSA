
/**
 * Write a description of class BallRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class BallRunner{

    public static void activity1()
    {
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgpoint = new TGPoint(0, 0);
        BallBot ballBot = new BallBot(ballWorld, tgpoint, 0, 10);
        while(true){
            if(ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }else{
                ballBot.setHeading(ballBot.getHeading()+90);
            }
        }
    }

    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        int sum = 0;
        BallWorld ballWorld = new BallWorld(750, 750);
        TGPoint tgpoint = new TGPoint(0, 0);
        BallBot[] ballBot = new BallBot[10];
        while(true){
            for(int i = 0;i < ballBotArray.length; i++){;
                if (ballBotArray[i] == null){
                    sum ++;
                }
            }
            if (sum == 0){
                return ballBotArray.length;
            }
            return sum;
        }
    }
}
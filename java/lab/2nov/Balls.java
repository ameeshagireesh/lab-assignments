import java.lang.Math;

class SameColourBallException extends Exception{
    SameColourBallException(int x){
        System.out.println("Same colour was picked more than thrice");
    }
}
public class Balls {
    public static void main(String[] args) {
        int rand;
        int r=0,g=0,b=0,y=0;
        for(int i=0;i<10;i++){
            rand = (int) ((Math.random() * ((4 - 1) + 1)) + 1);
            if(rand==1)
                r++;
            if(rand==2)
                g++;
            if(rand==3)
                b++;
            if(rand==4)
                y++;
            try{
                if(r>3 || g>3 || b>3 || y>3)
                    throw new SameColourBallException(0);
                } catch(SameColourBallException exp){
                    System.out.println("Error Caught");
                }
            }
        System.out.println(r);
        System.out.println(g);
        System.out.println(b);
        System.out.println(y);
    }
}
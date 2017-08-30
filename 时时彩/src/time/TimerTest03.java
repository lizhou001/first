package time;
import java.util.Timer;

import TimerTask.TimerTaskTest03;
/**
 * ¶¨Ê±Æ÷
 * @author Administrator
 *
 */
public class TimerTest03 {  
    Timer timer= new Timer();    
      
    public void TimerTest(){           
        timer.schedule(new TimerTaskTest03(), 5000, 8000);  
    }  
      
    public void end()
    { 
    	timer.cancel();

    }
   /* public static void main(String[] args) {  
        new TimerTest03().TimerTest();  
    }  */
    
}  

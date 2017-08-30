package TimerTask;

import java.util.TimerTask;

import fangfa.Userservice;
/**
 * 定时器的子类 需要重复运行的方法
 * @author Administrator
 *
 */
public class TimerTaskTest03 extends TimerTask{  
	  Userservice u=new Userservice();
    @Override  
    public void run() {  
    	u.print2();
       // Date date = new Date(this.scheduledExecutionTime());  
        //System.out.println("本次执行该线程的时间为：");  
    }  
  
}  

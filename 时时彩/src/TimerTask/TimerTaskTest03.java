package TimerTask;

import java.util.TimerTask;

import fangfa.Userservice;
/**
 * ��ʱ�������� ��Ҫ�ظ����еķ���
 * @author Administrator
 *
 */
public class TimerTaskTest03 extends TimerTask{  
	  Userservice u=new Userservice();
    @Override  
    public void run() {  
    	u.print2();
       // Date date = new Date(this.scheduledExecutionTime());  
        //System.out.println("����ִ�и��̵߳�ʱ��Ϊ��");  
    }  
  
}  

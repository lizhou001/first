package fangfa;
import java.util.Scanner;
import java.util.Random;
import shuxing.User;
import cunchu.UserDate;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Userservice {
	UserDate us=new UserDate();
	User[] ch=us.getUser();
	 Random r=new Random();
	int[] sysnum=new int[5];
	int[] outnum=new int[5];
	Scanner input=new Scanner(System.in);
	/*
	 * ע��
	 * */
	public User[] zhuce(User user){
	
		for(int i=0;i<ch.length;i++){
			if(ch[i]==null){
				ch[i]=user;
				us.setUser(ch);
				break;
			}
	}
		return ch;
	}
	/*
	 * ��¼
	 * */
	public User denglu(User user){
	
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]!=null&&ch[i].getZhanghao().equals(user.getZhanghao())
					&&ch[i].getMima().equals(user.getMima())){
				return ch[i];
			}
		}
		return null;
	}
	/*
	 * �޸�����
	 * */
	public User xiugai(User user){
	
		for (int i = 0; i < ch.length; i++) {
			if(user.getMibao().equals(ch[i].getMibao())){
				if(user.getAnswer().equals(ch[i].getAnswer())){
					ch[i].setMima(user.getMima());
					return ch[i];
					}
				}
		}
		return null;
	}
	/*
	 * �û���ֵ
	 * */
	public User chongzhi(User user){
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=null&&ch[i].getZhanghao().equals(user.getZhanghao())) {
				ch[i].setMoney(user.getMoney());
				
				return ch[i];
			}
		}
		return null;
	}
	/*
	 * ��Ϸ
	 * */
	public int game(int s){
		
		int s1=0;
		
		for (int i = 0; i < sysnum.length; i++) {
			sysnum[i]=r.nextInt(9)+1;
		}
		
		for (int i = 0; i < outnum.length; i++) {
			System.out.println("������Ҫѡ��ĺ���"+(i+1));
			outnum[i]=input.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			for(int j=0;j<5;j++){
				if(outnum[i]==sysnum[j]){
					s1++ ;
				}
			}
		}
		if(s1==5){
			System.out.println("��ϲ���н��� ");
			return s=s*2;
		}else{
			System.out.println("û�н�");
		}
		return 0;
	}
	public void print(){
		getNowDate();
		System.out.print("��������Ϊ��");
		for (int i = 0; i < sysnum.length; i++) {
			System.out.print("\t"+sysnum[i]);
		}
		System.out.println();
	}
	/**
	 * ��ʾʱʱ��״̬
	 */
	public void print2(){
    	int[] sysnum=new int[5];
    	for (int i = 0; i < sysnum.length; i++) {
		sysnum[i]=r.nextInt(9)+1;
	}
		getNowDate();
		System.out.print("��������Ϊ��");
		for (int i = 0; i < sysnum.length; i++) {
			System.out.print("\t"+sysnum[i]);
		}
		System.out.println();
	}
	/**
	 * ��ȡʱ��
	 */
	public static void getNowDate() {
		Date date=new Date();
		SimpleDateFormat  sdf=new SimpleDateFormat ("yyyy��MM��dd�� HH:mm:ss");
		 System.out.println("��ǰʱ�䣺"+sdf.format(date));
	 
		}
	/*
	 * */
	public User czuser2(User user){
		//User[] u=ud.getUser();
		if(user!=null){
		for (int i = 0; i < ch.length; i++) {
			if(user.getMibao().equals(ch[i].getMibao())){
				return ch[i];
				}
			}
		}
		return null;
	}
}

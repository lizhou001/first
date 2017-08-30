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
	 * 注册
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
	 * 登录
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
	 * 修改密码
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
	 * 用户充值
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
	 * 游戏
	 * */
	public int game(int s){
		
		int s1=0;
		
		for (int i = 0; i < sysnum.length; i++) {
			sysnum[i]=r.nextInt(9)+1;
		}
		
		for (int i = 0; i < outnum.length; i++) {
			System.out.println("请输入要选择的号码"+(i+1));
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
			System.out.println("恭喜您中奖了 ");
			return s=s*2;
		}else{
			System.out.println("没中奖");
		}
		return 0;
	}
	public void print(){
		getNowDate();
		System.out.print("开奖号码为：");
		for (int i = 0; i < sysnum.length; i++) {
			System.out.print("\t"+sysnum[i]);
		}
		System.out.println();
	}
	/**
	 * 显示时时彩状态
	 */
	public void print2(){
    	int[] sysnum=new int[5];
    	for (int i = 0; i < sysnum.length; i++) {
		sysnum[i]=r.nextInt(9)+1;
	}
		getNowDate();
		System.out.print("开奖号码为：");
		for (int i = 0; i < sysnum.length; i++) {
			System.out.print("\t"+sysnum[i]);
		}
		System.out.println();
	}
	/**
	 * 获取时间
	 */
	public static void getNowDate() {
		Date date=new Date();
		SimpleDateFormat  sdf=new SimpleDateFormat ("yyyy年MM月dd日 HH:mm:ss");
		 System.out.println("当前时间："+sdf.format(date));
	 
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

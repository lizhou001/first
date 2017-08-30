package jiemian;
import java.util.Scanner;
import shuxing.User;
import fangfa.Userservice;

import time.TimerTest03;

/*
 * 视图界面
 * 展示各种功能，数据给客户
 * */
public class Userview {
	Scanner input=new Scanner(System.in);
	Userservice ud=new Userservice();
	TimerTest03 aa=new TimerTest03();
	boolean bo;
	/*
	 * 主界面，功能：注册，登录，修改密码。
	 * */
	public void zhujiemian(){
		System.out.println("===============模拟时时彩娱乐系统===============");
		System.out.println("1.用户注册\t2.用户登录\t3.修改密码\t0.退出系统");
		System.out.println("==========================================");
		System.out.println("请选择：");
		
	} 
	/*
	 *第二层界面，功能：用户充值，账户余额，用户下注，定时开奖。
	 * */
	public void dierceng(User f){
		boolean xz=false;
		do{
		System.out.println("--->>>登陆成功===========================");
		System.out.println("1.用户充值\t2.账户余额\t3.用户下注\t4.定时开奖\t0.返回");
		System.out.println("==========================================");
		System.out.println("请选择：");
		int num1=input.nextInt();
		switch (num1) {
		case 1:
			System.out.println("请填写充值金额：");
			f.setMoney(f.getMoney()+input.nextInt());
			/*System.out.println("请输入要充值金额的账号：");
			f.setZhanghao(input.next());*/
			
			if (ud.chongzhi(f)!=null) {
				System.out.println("充值成功！");
			}else{
				System.out.println("没有找到您输入的账号，充值失败！");
			}
			xz=true;
			break;
		case 2:
			System.out.println("你的余额："+f.getMoney());
			xz=true;
			break;
		case 3:
			if(f.getMoney()>0){
				System.out.println("请输入下注金额");
				int s=input.nextInt();
				if(s<=0&&s>f.getMoney()){
					System.out.println("请正确输入下注金额");
				}else{
					//game(s);
					f.setMoney(f.getMoney()-s+ud.game(s));
					ud.chongzhi(f);
					
					}
				}else{
					System.out.println("金额不足 请充值");
				}
			xz=true;
			break;
		case 4:
			System.out.println("请稍等，马上为您显示");
			aa.TimerTest();
			
			break;
		case 5:
			aa.end();
			xz=false;
			break;
		default:
			xz=false;
			break;
		}
		}while(xz);
		
		
	}
	public	void users(){
		boolean fdd=false;
		User f;
		do{
			zhujiemian();
			int num=input.nextInt();
			
			switch (num) {
			case 1:
				f=new User();
				/***********question*************/
				boolean xs=false;
				do{
					
					System.out.println("用户注册-------------------------------");
					System.out.println("请输入账号：");
					f.setZhanghao(input.next());
					System.out.println("请输入密码：");
					String mima1=input.next();
					System.out.println("请再次输入密码：");
					String mima2=input.next();
					System.out.println("请输入密保问题：");
					f.setMibao(input.next());
					System.out.println("请输入密保答案：");
					f.setAnswer(input.next());
					System.out.println("请绑定银行卡：");
					f.setYinghangka(input.next());
					System.out.println("请绑定身份证号：");
					f.setIDcard(input.next());
					System.out.println("请绑定手机号：");
					f.setTel(input.next());
					System.out.println("请绑定电子邮箱：");
					f.setEmail(input.next());
					if (mima1.equals(mima2)) {
						if (ud.zhuce(f) != null) {
							System.out.println("注册成功！");
							f.setMima(mima2);
							xs=false;
						} else {
							System.out.println("注册失败");
						}
					} else {
						System.out.println("两次密码不一致，请重新输入：");
					}	
				}while(xs);
				fdd=true;
				break;
			case 2:
				f=new User();
				boolean flag=false;
				do{
					System.out.println("用户登录-------------------------------");
					System.out.println("请输入账号：");
					f.setZhanghao(input.next());
					System.out.println("请输入密码：");
					f.setMima(input.next());
					ud.denglu(f);
					if (ud.denglu(f)!=null) {
						System.out.println("登陆成功！");
						dierceng(ud.denglu(f));
					}else{
						System.out.println("登录失败，请重新登录：");
						flag=false;
					}
				}while(flag);
				fdd=true;
				break;
			case 3:
				f=new User();
				System.out.println("请输入你要修改密码的账号：");
				f.setZhanghao(input.next());
				System.out.println("请输入密保问题：");
				f.setMibao(input.next());
				System.out.println("请输入密保答案：");
				f.setAnswer(input.next());
				if(ud.czuser2(f)!=null){
					System.out.println("请输入要修改的密码");
					f.setMima(input.next());
					if(ud.xiugai(f)!=null){
						System.out.println("修改成功");
					
						//u.setMima(input.next());
					}
				}
				
				break;
			default:
				System.out.println("************谢谢您的使用*****************");
				fdd=false;
				break;
			}
		}while(fdd);
	}
	
}

package jiemian;
import java.util.Scanner;
import shuxing.User;
import fangfa.Userservice;

import time.TimerTest03;

/*
 * ��ͼ����
 * չʾ���ֹ��ܣ����ݸ��ͻ�
 * */
public class Userview {
	Scanner input=new Scanner(System.in);
	Userservice ud=new Userservice();
	TimerTest03 aa=new TimerTest03();
	boolean bo;
	/*
	 * �����棬���ܣ�ע�ᣬ��¼���޸����롣
	 * */
	public void zhujiemian(){
		System.out.println("===============ģ��ʱʱ������ϵͳ===============");
		System.out.println("1.�û�ע��\t2.�û���¼\t3.�޸�����\t0.�˳�ϵͳ");
		System.out.println("==========================================");
		System.out.println("��ѡ��");
		
	} 
	/*
	 *�ڶ�����棬���ܣ��û���ֵ���˻����û���ע����ʱ������
	 * */
	public void dierceng(User f){
		boolean xz=false;
		do{
		System.out.println("--->>>��½�ɹ�===========================");
		System.out.println("1.�û���ֵ\t2.�˻����\t3.�û���ע\t4.��ʱ����\t0.����");
		System.out.println("==========================================");
		System.out.println("��ѡ��");
		int num1=input.nextInt();
		switch (num1) {
		case 1:
			System.out.println("����д��ֵ��");
			f.setMoney(f.getMoney()+input.nextInt());
			/*System.out.println("������Ҫ��ֵ�����˺ţ�");
			f.setZhanghao(input.next());*/
			
			if (ud.chongzhi(f)!=null) {
				System.out.println("��ֵ�ɹ���");
			}else{
				System.out.println("û���ҵ���������˺ţ���ֵʧ�ܣ�");
			}
			xz=true;
			break;
		case 2:
			System.out.println("�����"+f.getMoney());
			xz=true;
			break;
		case 3:
			if(f.getMoney()>0){
				System.out.println("��������ע���");
				int s=input.nextInt();
				if(s<=0&&s>f.getMoney()){
					System.out.println("����ȷ������ע���");
				}else{
					//game(s);
					f.setMoney(f.getMoney()-s+ud.game(s));
					ud.chongzhi(f);
					
					}
				}else{
					System.out.println("���� ���ֵ");
				}
			xz=true;
			break;
		case 4:
			System.out.println("���Եȣ�����Ϊ����ʾ");
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
					
					System.out.println("�û�ע��-------------------------------");
					System.out.println("�������˺ţ�");
					f.setZhanghao(input.next());
					System.out.println("���������룺");
					String mima1=input.next();
					System.out.println("���ٴ��������룺");
					String mima2=input.next();
					System.out.println("�������ܱ����⣺");
					f.setMibao(input.next());
					System.out.println("�������ܱ��𰸣�");
					f.setAnswer(input.next());
					System.out.println("������п���");
					f.setYinghangka(input.next());
					System.out.println("������֤�ţ�");
					f.setIDcard(input.next());
					System.out.println("����ֻ��ţ�");
					f.setTel(input.next());
					System.out.println("��󶨵������䣺");
					f.setEmail(input.next());
					if (mima1.equals(mima2)) {
						if (ud.zhuce(f) != null) {
							System.out.println("ע��ɹ���");
							f.setMima(mima2);
							xs=false;
						} else {
							System.out.println("ע��ʧ��");
						}
					} else {
						System.out.println("�������벻һ�£����������룺");
					}	
				}while(xs);
				fdd=true;
				break;
			case 2:
				f=new User();
				boolean flag=false;
				do{
					System.out.println("�û���¼-------------------------------");
					System.out.println("�������˺ţ�");
					f.setZhanghao(input.next());
					System.out.println("���������룺");
					f.setMima(input.next());
					ud.denglu(f);
					if (ud.denglu(f)!=null) {
						System.out.println("��½�ɹ���");
						dierceng(ud.denglu(f));
					}else{
						System.out.println("��¼ʧ�ܣ������µ�¼��");
						flag=false;
					}
				}while(flag);
				fdd=true;
				break;
			case 3:
				f=new User();
				System.out.println("��������Ҫ�޸�������˺ţ�");
				f.setZhanghao(input.next());
				System.out.println("�������ܱ����⣺");
				f.setMibao(input.next());
				System.out.println("�������ܱ��𰸣�");
				f.setAnswer(input.next());
				if(ud.czuser2(f)!=null){
					System.out.println("������Ҫ�޸ĵ�����");
					f.setMima(input.next());
					if(ud.xiugai(f)!=null){
						System.out.println("�޸ĳɹ�");
					
						//u.setMima(input.next());
					}
				}
				
				break;
			default:
				System.out.println("************лл����ʹ��*****************");
				fdd=false;
				break;
			}
		}while(fdd);
	}
	
}

package shuxing;


public class User {
	private String xingming,IDcard,email,tel,zhanghao,mima,mibao,answer;
	private int money;
	private String yinghangka;
	/*
	 * 姓名
	 * */
	public String getXingming() {
		return xingming;
	}
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/*
	 * 身份证
	 * */
	public String getIDcard() {
		return IDcard;
	}
	public void setIDcard(String iDcard) {
		IDcard = iDcard;
	}
	/*
	 * 银行卡号
	 * */
	public String getYinghangka() {
		return yinghangka;
	}
	public void setYinghangka(String yinghangka) {
		this.yinghangka = yinghangka;
	}
	/*
	 *QQ邮箱
	 * */
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * 电话号码
	 * */
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	/*
	 * 登录账号
	 * */
	public String getZhanghao() {
		return zhanghao;
	}
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/*
	 * 登录密码
	 * */
	public String getMima() {
		return mima;
	}
	public void setMima(String mima) {
		this.mima = mima;
	}
	/*
	 * 密保问题
	 * */
	public String getMibao() {
		return mibao;
	}
	public void setMibao(String mibao) {
		this.mibao = mibao;
	}
	/*
	 * 密保答案
	 * */
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	/*
	 * 账户余额
	 * */
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}

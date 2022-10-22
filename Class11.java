package java11;

interface Data{
	public void showData();
}
interface Test{
	public void showScore();
	public double calcu();
}
class Cstu implements Data,Test{
	protected String id;
	protected String name;
	protected int mid;
	protected int finl;
	protected int common;
	public Cstu(String s1,String s2,int m,int f,int c) {
		this.id=s1;
		this.name=s2;
		this.mid=m;
		this.finl=f;
		this.common=c;
	}
	public void showData(){
		System.out.println("學號:"+id);
		System.out.println("姓名:"+name);
	}
	public void showScore(){
		System.out.println("期中考成績:"+mid);
		System.out.println("期末考成績:"+finl);
		System.out.println("平時成績:"+common);
		System.out.println("學期成績:"+calcu());
	}
	public double calcu() {
		return(mid*.3+finl*.3+common*.4);
	}
	public void show() {
		showData();
		showScore();
	}
}
public class Class11 {
	public static void main(String args[]) {
		Cstu stu = new Cstu("920001","Fiona",90,92,85);
		stu.show();
	}
}

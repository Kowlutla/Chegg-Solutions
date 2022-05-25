package foo;

public class Foo {
	private String sFoo1;
	private int iFoo2;
	private double dFoo3;
	Foo()
	{
		sFoo1="";
		iFoo2=0;
		dFoo3=0.0;
	}
	Foo(String fS,int fI,double fD)
	{
		sFoo1=fS;
		iFoo2=fI;
		dFoo3=fD;
	}
	public String getsFoo1() {
		return sFoo1;
	}
	public void setsFoo1(String sFoo1) {
		this.sFoo1 = sFoo1;
	}
	public int getiFoo2() {
		return iFoo2;
	}
	public void setiFoo2(int iFoo2) {
		this.iFoo2 = iFoo2;
	}
	public double getdFoo3() {
		return dFoo3;
	}
	public void setdFoo3(double dFoo3) {
		this.dFoo3 = dFoo3;
	}
	public double calcFoo()
	{
		return iFoo2*dFoo3;
	}
	public String toString()
	{
		String out="sFoo1 = "+sFoo1+"\t iFoo2 ="+iFoo2+"\t dFoo3 = "+dFoo3;
		return out;
	}
}

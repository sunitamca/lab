 package abstractiondemo;

public class BlankFinalStaticVar {
	static final int data;
	static {//static block
		data=5;
	}
  public int cube (final int n)
  {
	  //n = n+2; the value cannot be changed
	  return n*n*n;
  }
  public static void main(String[] args) {
	  BlankFinalStaticVar blank = new BlankFinalStaticVar();
	  System.out.println(blank.cube(data));
  }
}

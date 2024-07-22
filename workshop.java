@FunctionalInterface
interface cals{
	int opet(int a,int b);
}
public class functinterface {
	public static int opet(int a,int b,cals c) {
		return c.opet(a, b);
	}
	
	public static void main(String args[]) {
		cals add=(a,b)->a+b;
		cals sub=(a,b)->a-b;
		System.out.println(opet(198,8,sub));
	}
	

}

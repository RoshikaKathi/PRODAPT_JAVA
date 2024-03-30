package coreJavaExc;

class Q1{
	public int a,b;
	public int c = 2;
	public static int x = 6;
	}


public class Main{
	public static void main(String[] args){
		Q1 instanceA = new Q1();
		Q1 instanceB = new Q1();
		instanceA.a = 8;
		instanceB.b = instanceA.x;
		instanceA.x++;
		instanceB.a = 10;
		instanceB.c = 90;
		instanceB.x++;
		System.out.println("Instance A: ");
		System.out.println("a:"+instanceA.a);
		System.out.println("b:"+instanceA.b);
		System.out.println("c:"+instanceA.c);
		System.out.println("x:"+instanceA.x);
		System.out.println("Instance B: ");
		System.out.println("a:"+instanceB.a);
		System.out.println("b:"+instanceB.b);
		System.out.println("c:"+instanceB.c);
		System.out.println("x:"+instanceB.x);
		}
}
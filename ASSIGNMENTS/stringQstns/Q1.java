package stringQstns;

public class Q1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println("***************************");
		StringBuffer sb1 = new StringBuffer("Able.");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		System.out.println("***************************");
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.append("ELI KUTTY"));
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println(sb2.append(" ROSHIKA RAJA RAJESHWARIIIIII"));
		System.out.println(sb2.capacity());
		System.out.println(sb2.length());
		System.out.println("***************************");
	}

}

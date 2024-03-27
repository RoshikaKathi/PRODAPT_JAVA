package stringQstns;

public class Q6 {

	public static void main(String[] args) {
		System.out.println("***************************");
		String name = "Ms. Gorimanikonda Elita Hazel";
		System.out.println(name.substring(0,name.indexOf('.')));
		System.out.println("***************************");
		String name1 = "Kathi Roshika Kiran";
		System.out.println(name1.substring(0,name1.indexOf(' ')));
		System.out.println("***************************");
		StringBuffer strr = new StringBuffer();
		for(int i=0; i<name1.length();  i++) {
			char val= name1.charAt(i);
			if(Character.isUpperCase(val)){
				strr.append(name1.charAt(i));
			}else 
				continue;
		}
		System.out.println(strr);
		System.out.println("***************************");
	}

}


public class WhyMethod {

	public static void main(String[] args) {
		//100000
		printTwoTimes("a","-");
		//100000
		printTwoTimes("a","-");	
		printTwoTimes("b","-");	
	}
	public static void printTwoTimes(String text,String delemiter) {
		
		System.out.println(delemiter);
		System.out.println(text);
		System.out.println(text);
	}

}

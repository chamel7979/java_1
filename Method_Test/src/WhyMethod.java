import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		
					//인자,아규먼트
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		
		//100000

	}
									//매개변수,파라미터

	
	public static String twoTimes(String text,String delimeter) {
		String out = "";
		out = out + delimeter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}

}

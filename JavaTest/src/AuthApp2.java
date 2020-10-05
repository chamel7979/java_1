
public class AuthApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(args[0]);
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		String pass2 = "2222";
		
		
		System.out.println("Hi");
		boolean isRightPass = inputPass.equals(pass) || inputPass.equals(pass2);
		
		if(inputId.equals(id) && isRightPass) {
			System.out.println("Master");
		}else {
			System.out.println("who are you?");
		}
	}

}

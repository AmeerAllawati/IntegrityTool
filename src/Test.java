import java.security.NoSuchAlgorithmException;
import java.util.*;  


/**
 * 
 */

/**
 *
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select an action:");
		System.out.println("-----------------");
		System.out.println("1) Generate Hash");
		System.out.println("2) Compare Hash");
		System.out.println("3) Re-compute");
		
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Enter your choice: ");  
		int choice= sc.nextInt();
		
		if (choice == 1) {
			SHA256Generator SHA256Instance = new SHA256Generator();
			
			
			System.out.println("Your choice was to generate hash");
			System.out.println("Enter the string you want to generate the SHA256 for: ");
			String user_string= sc.nextLine();
			try {
				System.out.println("\n" + user_string + " : " + SHA256Instance.getSHA(user_string));
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} else if(choice == 2) {
			System.out.println("Your choice was to compute hash");
		} else {
			System.out.println("Your choice was to re-compute hash");
		}
	}

}

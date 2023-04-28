import java.util.Iterator;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the password");
		String a = s.next();
		int Up = 0;
		int low = 0;
		int num = 0;
		int symb = 0;

	if (a.length()<8) {
		
		System.out.println("your must conyain minimum 8 digits");
	}
			
	else if (a.length()>=8) {
		for (int i = 0; i < a.length(); i++) {

			if (a.charAt(0) >= 'A' && a.charAt(0) <= 'Z') {

				Up++;

			} else  {
				System.out.println("First letter must be Capital");
				break;
			}
			
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {

				Up++;

			}

			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {

				low++;

			}

			else if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {

				num++;

			} 
			else {
				symb++;
			}

		}
		if ((Up>=1) && (low>=1) && (num>=1) && (symb>=1)) {
			
			
			System.out.println("Password accepted");
			
		} else {

			System.err.println("Password not accepted");
			System.out.println("Password must contain:");
			System.out.println("Minimum One Uppercase");
			System.out.println("Minimum One Lowercase");
			System.out.println("Minimum One Number");
			System.out.println("Minimum One SplCharcter");
			
			
		}
		
	}

	
		
	}
	}



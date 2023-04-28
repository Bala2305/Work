import java.util.Iterator;

public class Max {

	public static void main(String[] args) {
		
		
	int a[]= {1,2,3,4,5};
	
	int max= a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]>max) {
				max=a[i];
			}
			
		}
		
		
		
		System.out.println(max);
		
	
	}



/*Loop logic
 * 
 * i=o
 * a[i]>max
 * a[0]>a[0]  1>1 false
 *                              ****in order to find the minimum value just have 
 *                              to change the ">" to "<" in the if condition
 * i=1
 * a[i]>max
 * a[1]>a[0]  2>1 true
 * max=a[1]
 * 
 * 
 * i=2
 * a[i]>max
 * a[2]>a[1]  3>2 true
 * max=a[2]
 * 
 * and goes on
 * 
 * 
 * 
 * */
 }
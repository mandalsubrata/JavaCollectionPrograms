import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 * Note: Your algorithm should run in O(n) time and use constant space.
 * @author subratamandal
 *
 *INP: [1, 2, 0]
 *OUP: 3
 */
public class FirstMissingInteger {

	public static void main(String[] args) {
		//int[] a = {1,2,0};
		//int[] a= {3, 4, -1, 1}; //oup: 2
		int[] a = {-8, -7, -6}; //oupt: 1
		System.out.println("FirstMissingNumber is= "+findFirstMissingNo(a));

	}
	
	public static int findFirstMissingNo(int[] a) {
		int n = a.length;
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<n; i++) {
			set.add(a[i]);
		}
		int i =1;
		for(; i<=n; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		return (i);
	}
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * You are given a string A of size N consisting of lowercase alphabets.
 * You can change at most B characters in the given string to any other 
 * lowercase alphabet such that the number of distinct characters in the string is minimized.
 * Find the minimum number of distinct characters in the resulting string.
 * @author subratamandal
 *
 */
public class ChangeCharacter {

	public static void main(String[] args) {
		System.out.println("Minumum no: "+solve("umeaylnlfd", 1));

	}
	public static int solve(String A, int B) {
		int[] arr = new int[26];
		int n = A.length();
		int ans = 0;
		
		if(B==0) {
			return n;
		}
		
		for(int i=0; i<n; i++) {
			int v = A.charAt(i) - 'a';
			arr[v]++;
			if(arr[v] == 1) {
				ans++;
			}
		}
		Arrays.sort(arr);
		
		for(int i=0; i<26; i++) {
			if(B-arr[i] >=0 && arr[i]!=0) {
				ans--;
				B -=arr[i];
			}
		}		
		return ans;
	}

}

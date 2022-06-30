import java.util.Arrays;

public class MimimumNoOfPlatforms {

	public static void main(String[] args) {
		int arr[]  = {900,  940, 950,  1100, 1500, 1800};
        int dep[]  = {910, 1200, 1120, 1130, 1900, 2000};
        
        System.out.println("Required platform: "+findMinPlatform(arr,dep));
        

	}
	
	public static int findMinPlatform(int[] a, int[] d) {
		int p = 1;
		Arrays.sort(a);
		Arrays.sort(d);
		int max = 1;
		
		int i=1;
		int j= 0;
		
		while(i <a.length && j<d.length) {
			if(a[i] <= d[j]) {
				p++;
				i++;
			} else {
				p--;
				j++;
			}
			if(p > max) {
				max = p;
			}
		}
		return max;
	}

}

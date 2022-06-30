import java.util.ArrayList;
import java.util.Arrays;

public class CountOfDivisor {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
//		a.add(4);
//		a.add(5);
		System.out.println("Ans: "+solve(a));

	}

	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
		int n = A.size();
		ArrayList<Integer> ans = new ArrayList<>();
		for(int i=0;i<n;i++){
			int a = A.get(i);
			ans.add(getCountOfFactors(a));
		}
		return ans;
	}

	public static int getCountOfFactors(int n){
		int count = 0;
		int totalCount = 1;
		int[] spf = findSpf(n);
		while(n>1){
			int p = spf[n];
			while(n%p == 0){
				count++;
				n=n/p;
			}
			totalCount = totalCount * (count+1);
			count = 0;
		}
		return totalCount;
	}
	public static int[] findSpf(int n) {
		int[] spf = new int[n+1];
		for(int i=0; i<=n; i++) {
			spf[i] = i;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(i == spf[i]){
				for(int j=i*i; j<=n; j+=i){
					if(j == spf[j]){
						spf[j] = i;
					}
				}
			}
		}
		return spf;
	}







	//	public static ArrayList<Integer> solve(ArrayList<Integer> A) {
	//
	//		int n = A.size();
	//
	//		for(int j=0; j<n; j++){
	//			int count = 1;
	//			for(int i=1; i<A.get(j); i++){
	//
	//				if(A.get(j) % i == 0){
	//					count +=1;
	//				}
	//			}
	//			A.set(j,count);
	//		}
	//		return A;
	//	}


}

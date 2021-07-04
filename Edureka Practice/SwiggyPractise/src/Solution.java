import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int ar[][] = {{0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1}};
		int m = ar.length;
		int n = ar[0].length;
		int oneCount=0,maxOneCount=0,req_row = 0;
		for(int i=0;i<m;i++) {
			for(int j=n-1;j>=0 && ar[i][j]==1;j++) {
				oneCount++;
			}
			if(oneCount>maxOneCount) {
				maxOneCount = oneCount;
				req_row = i;
			}
		}
		System.out.println(req_row);
	}
}

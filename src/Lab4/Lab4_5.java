package Lab4;
import java.util.Arrays;
public class Lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] intArr1 =new int[][]{{1,2,3,4},{2,3,4,5}};
	    int[][] intArr2 =new int[][]{{1,2},{3,4},{5,6},{7,8}}; 
	    if(intArr1.length == intArr2[0].length && intArr1[0].length == intArr2.length) {
	    	int x = intArr1.length;
	    	int y = intArr2[0].length;
	    	int[][] Array = new int[x][y];
	    	for (int i = 0; i < intArr1.length; i++) {
				for (int j = 0; j < intArr2[0].length; j++) {
					for (int k = 0; k < intArr1[0].length; k++) {
						Array[i][j] = intArr1[i][k] * intArr2[k][j];
					}
				}
			}
	    	for (int i = 0; i < x; i++) {
				for (int j = 0; j < y; j++) {
					System.out.print(Array[i][j]+" ");
				}
				System.out.println();
			}
	    }
	    else {
			System.out.println("Á©¾ØÕóÎÞ·¨Ïà³Ë");
		}
	}

}

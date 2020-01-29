import java.util.Arrays;
public class BubbleSort {
	public int[] sort(int[]A)
	{
		for (int i=0;i<A.length-1;i++) {
			for (int j=0;j<A.length-i-1;j++)
			{
				if(A[j]>A[j+1])
				{
					int t=A[j];
					A[j]=A[j+1];
					A[j+1]=t;
				}
			}
		}
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {4,2,6,3};
		BubbleSort ob=new BubbleSort();
		System.out.println(Arrays.toString(ob.sort(A)) );
	}

}

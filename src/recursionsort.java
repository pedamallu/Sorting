import java.util.Arrays;
public class recursionsort {
	public void sort(int A[], int len) 
    { 
        if (len == 1) 
            return; 
       
        for (int i=0; i<len-1; i++) 
            if (A[i] > A[i+1]) 
            {
                int t = A[i]; 
                A[i] = A[i+1]; 
                A[i+1] = t; 
            } 
        sort(A,len-1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []A= {4,2,6,3};
		recursionsort ob= new recursionsort();
		ob.sort(A,A.length);
		System.out.println(Arrays.toString(A));
	}

}

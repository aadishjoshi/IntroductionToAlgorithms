/***********************************************************************************************************************************
Quick Sort Practice
Written by:- Aadish Joshi
***********************************************************************************************************************************/
import java.util.*;

class QuickSort{

	public static void sort(int A[],int p,int r){
		if(p<r){
			int q = partition(A,p,r);
			sort(A,p,q-1);
			sort(A,q+1,r);
		}
	}
	
	public static int partition(int A[], int p, int r){
		int x = A[r];
		int i = p-1;
		int temp1,temp2;

		for(int j=p;j <r;j++){
			if(A[j] <= x){
				i += 1;
				temp1 = A[j];
				A[j] = A[i];
				A[i] = temp1;
			}
		}

		temp2 = A[r];
		A[r] = A[i+1];
		A[i+1] = temp2;

		return i+1;
	}

	public static void main(String args[]){
		int A[] = new int []{10,50,40,35,8,9};
		sort(A,0,A.length-1);

		for(int i=0;i < A.length; i++){
			System.out.print(" "+A[i]);
		}
	}


}
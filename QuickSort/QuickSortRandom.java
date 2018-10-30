/***********************************************************************************************************************************
Quick Sort Random Partition
Written by:- Aadish Joshi
***********************************************************************************************************************************/
import java.util.*;
import java.lang.Math;

class QuickSortRandom{

	public static void sort(int A[],int p,int r){
		if(p<r){
			int q = randomize_partition(A,p,r);
			sort(A,p,q-1);
			sort(A,q+1,r);
		}
	}

	public static int randomize_partition(int A[],int p,int r){
		int i = (int )(Math.random() * r + p);
		int temp =  A[i];
		A[i] =  A[r];
		A[r] = temp;
		return partition(A,p,r);
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
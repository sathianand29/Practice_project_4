package practice_project_4;
import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	
	public static void longest(int[] arr, int[] temp, int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if(arr[i] > arr[j])
				{
					temp[i] = Math.max(temp[j]+1,temp[i]);
				}
			}
			
		}
		Arrays.sort(temp);
		
		System.out.println("Length of Longest increasing subsequence is "+ temp[n-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp[] = new int[n];
		System.out.println("Enter the elements in the array");
		for(int i =0; i<n; i++)
		{
			arr[i] = sc.nextInt();
			temp[i] = 1;
		}
		longest(arr, temp, n);

	}

}

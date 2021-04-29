package activities;
import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		int[] Arr= {10,77,10,54,-11,10};
		int searchNum=10;
		int sum=30;
		System.out.println("Original Array: " + Arrays.toString(Arr));
		System.out.println("Result="+ result(Arr,searchNum,sum));

	}

	public static boolean result (int[] arr, int searchNum, int sum) {
		int temp_sum = 0;
		boolean Return=false;
		for (int i:arr)
		{
		if (i == searchNum )
				{
			temp_sum = searchNum+temp_sum;
		}
		if (temp_sum>sum)
		{
			break;
		}
		if (temp_sum==sum) {
			Return = true;
		} else {
			Return = false;
		}
}
		return Return;
		}}

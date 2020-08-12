package TimeAndSpace;

//import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class PrintArrayIntersection {

	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void intersection(int[] arr1, int[] arr2)
	{
		Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        int i =0, j = 0;
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] == arr2[j])
            {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j])
            {
                j++;
            }
            else
                i++;
        }
	}
	
//	HashSet<Integer> hs = new HashSet<Integer>(); 
//    for (int i = 0; i < b.length; i++) {
//        hs.add(b[i]);
//    }
//     
//    for (int i = 0; i < a.length; i++) {
//        if(hs.contains(a[i])) {
//            System.out.println(a[i]+" is present in both arrays");
//        }
//    }   
	
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		intersection(arr1, arr2);
	}

}

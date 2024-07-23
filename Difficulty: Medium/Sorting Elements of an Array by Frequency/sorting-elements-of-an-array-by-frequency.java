//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Map.Entry;


class Driverclass 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
	    while(n != 0)
		{
			int size = Integer.parseInt(sc.readLine());
			int arr[] = new int[size];
			String[] temp = sc.readLine().trim().split("\\s+");
			
			for(int i = 0; i < size; i++)
			    arr[i] = Integer.parseInt(temp[i]);
			    
			 ArrayList<Integer> ans = new ArrayList<Integer>();
			 ans = new Solution().sortByFreq(arr, size);
			 for(int i=0;i<ans.size();i++)
			    System.out.print(ans.get(i)+" ");
		    System.out.println();
			n--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to sort the array according to frequency of elements.
    static ArrayList<Integer> sortByFreq(int arr[], int n)
    {
        HashMap<Integer,Integer> sb = new HashMap<>();
        for(int i :arr){
            sb.put(i,sb.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> ans = new ArrayList<Integer>(sb.keySet());
        Collections.sort(ans,(a,b)->{
            if(sb.get(a)==sb.get(b)){
               return  a-b;
            }else{
               return  sb.get(b)-sb.get(a);
            }
        });
        ArrayList<Integer> result  = new ArrayList<>();
        int index =0;
        for(int i:ans){
            for(int j=0 ;j<sb.get(i);j++){
                result.add(i);
            }
        }
        return result;
    }
}
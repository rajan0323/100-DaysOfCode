//{ Driver Code Starts
//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    public static int countFlips(int a[], int n)
    {
         int count=0;
        for(int i=0;i<n;i++)
        {
            int key=a[i];
            if(key==0&&count%2==0)count++;
            else if(key==1&&count%2!=0)count++;
        }
        return count;


    }
}

//{ Driver Code Starts.

// Driver class
class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine().trim());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine().trim());
		    
		    int arr[] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    
		    for(int index = 0;index < sizeOfArray; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution ob = new Solution();
		    System.out.println(ob.countFlips(arr,sizeOfArray));
		}
	}
}


// } Driver Code Ends
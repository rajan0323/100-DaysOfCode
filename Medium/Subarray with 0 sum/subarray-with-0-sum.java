//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
			//code
			
		//taking input using class Scanner
		Scanner scan = new Scanner(System.in);
		
		//taking total number of testcases
		int t = scan.nextInt();
		while(t>0)
		{
		    //taking total count of elements
		    int n = scan.nextInt() ;
		    
		    //Declaring and Initializing an array of size n
		    int arr[] = new int[n];
		    
		    //adding elements to the array
		    for(int i = 0; i<n;i++)
		    {
		        arr[i] = scan.nextInt();
		    }
		    
		    t--;
		    
		     //calling the method findSum
		     //and print "YES" or "NO" based on the result
		     System.out.println(new Solution().findsum(arr,n)==true?"Yes":"No");
		}
	}
	
	
}
// } Driver Code Ends



class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
           
        HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>();
        
        int right=0;
        int sum=0;
        
        while(right<n){
            
            if(arr[right]==0){
                return true;
            }
        
          sum+=arr[right];
          
          if(sum==0){
              return true;
          }
          
          if(!hash.containsKey(sum)){
              hash.put(sum,1);
          }
          else{
              return true;
          }
          
          right++;
        }
        
        return false;
    }
}

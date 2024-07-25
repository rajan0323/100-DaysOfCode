//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
{
	public static void main (String[] args) throws IOException
	{
	 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	 int tc=Integer.parseInt(br.readLine().trim());
	 
	 while(tc-- >0)
	 {
	     String line=br.readLine().trim();
	     
	     Solution obj = new Solution();
	     
	     System.out.println(obj.getMaxOccuringChar(line));
	     
	 }
	 }
}
// } Driver Code Ends



class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
       int[] alpha = new int[26];
       for(int i =0;i<line.length();i++){
           char ch = line.charAt(i);
           int number = ch -'a';
           alpha[number]++;
       }
       char ans = ' ';
       int max = -1;
       for(int i =0;i<26 ;i++){
           if(max<alpha[i]){
               ans =(char)i;
               max = alpha[i];
           }
           
       }
       char fans = (char)('a'+ans);
       return fans;
    }
    
}
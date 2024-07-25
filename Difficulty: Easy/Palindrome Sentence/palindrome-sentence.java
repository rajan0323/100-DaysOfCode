//{ Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
       public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t > 0){
            String str = sc.nextLine();
            Solution ob = new Solution();
            if(ob.sentencePalindrome(str))
                System.out.println(1);
            else
                System.out.println(0);
            t--;
        }
    } 
} 
// } Driver Code Ends


class Solution { 

    static boolean sentencePalindrome(String s) { 
        StringBuilder sb = new StringBuilder("");
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a'&&ch<='z'){
                sb.append(ch);
            }
        }
        for( int j =0;j<sb.length();j++){
            char ch = sb.charAt(j);
            if(ch!=sb.charAt(sb.length()-1-j)){
                return false;
            }
        }
        return true;
    }
}
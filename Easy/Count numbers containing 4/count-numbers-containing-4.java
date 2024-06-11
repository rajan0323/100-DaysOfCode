//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int res = obj.countNumberswith4(n);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int countNumberswith4(int n) {
        int count = 0;
    
        for(int i=0;i<n+1;i++){
            int im = i;
            while(im!=0){
            int rem = im%10;
            if(rem==4){
                count++;
                break;
            }
            im/=10;
            }
            
        }
        return count;
    }
}

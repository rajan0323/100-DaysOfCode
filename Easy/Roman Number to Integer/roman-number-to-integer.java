//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    
    public int romanToDecimal(String str) {
        int ans = 0;
        HashMap<Character,Integer> st = new   HashMap<>();
        st.put('I',1);
        st.put('V',5);
        st.put('X',10);
        st.put('L',50);
        st.put('C',100);
        st.put('D',500);
        st.put('M',1000);
        for(int i =0;i<str.length();i++){
            int value =st.get(str.charAt(i));
            if(i+1<str.length()&&st.get(str.charAt(i))<st.get(str.charAt(i+1))){
                ans -=st.get(str.charAt(i));
                
            }else{
                ans+=st.get(str.charAt(i));
            }
        }
        return ans;
       
    }
}
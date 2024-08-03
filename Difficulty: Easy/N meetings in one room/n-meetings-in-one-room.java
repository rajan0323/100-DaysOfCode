//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) end[i] = Integer.parseInt(inputLine[i]);

            int ans = new Solution().maxMeetings(n, start, end);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int n, int start[], int end[]) {
       List<Pair> meetings = new ArrayList<>();
        
        // Populate the list with meeting start and end times
        for (int i = 0; i < n; i++) {
            meetings.add(new Pair(start[i], end[i]));
        }
        
        // Sort the meetings based on their end times
        meetings.sort((a, b) -> a.end - b.end);
        
        // Initialize count of meetings and the end time of the last attended meeting
        int count = 1;
        int lastEndTime = meetings.get(0).end;
        
        // Iterate through the sorted list of meetings
        for (int i = 1; i < n; i++) {
            // If the start time of the current meeting is after the end time of the last attended meeting
            if (meetings.get(i).start > lastEndTime) {
                count++;
                lastEndTime = meetings.get(i).end;
            }
        }
        return count;
    }
    
    // Helper class to store meeting start and end times
    static class Pair {
        int start;
        int end;
        
        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    }


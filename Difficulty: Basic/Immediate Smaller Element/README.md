<h2><a href="https://www.geeksforgeeks.org/problems/immediate-smaller-element1142/1?page=1&company=Amazon&difficulty=Basic&sortBy=submissions">Immediate Smaller Element</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer array <strong>arr</strong> of size <strong>n</strong>. For each element in the array, check whether the right adjacent element (on the&nbsp;next&nbsp;immediate position) of the array is smaller. If next element is smaller, update the current index to that element.&nbsp;If not, then&nbsp;&nbsp;<strong>-1</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong> : You need to make changes in the array itself.</span></p>
<p><span style="font-size: 18px;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>n = 5, arr[] = {4, 2, 1, 5, 3}
<strong>Output:</strong>
2 1 -1 3 -1
<strong>Explanation:</strong> Array elements are 4, 2, 1, 5, 3. Next to 4 is 2 which is smaller, so we print 2. Next of 2 is 1 which is smaller,so we print 1. Next of 1 is 5 which is greater, so we print -1. Next of 5 is 3 which is smaller, so we print 3.&nbsp; Note that for last element, output is always  going to be -1 because there is no element on right.</span></pre>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>n = 6, arr[] = {5, 6, 2, 3, 1, 7}
<strong>Output:</strong>
-1 2 -1 1 -1 -1
<strong>Explanation: </strong>Next to 5 is 6 which is greater, so we print -1. Next of 6 is 2 which is smaller, so we print 2. Next of 2 is 3 which is greater, so we print -1. Next of 3 is 1 which is smaller, so we print 1. Next of 1 is 7 which is greater, so we print -1. Note that for last element, output is always going to be -1 because there is no element on right.</span></pre>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤ 10<sup>7</sup><br>1 ≤ arr[i] ≤ 10<sup>5</sup></span></p>
<p>&nbsp;</p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;
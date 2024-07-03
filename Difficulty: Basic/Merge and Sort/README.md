<h2><a href="https://www.geeksforgeeks.org/problems/merge-and-sort5821/0">Merge and Sort</a></h2><h3>Difficulty Level : Difficulty: Basic</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two arrays of length N and M, print the merged array in ascending order containing only unique elements.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
a[] = {1, 8}
M = 2
b[] = {10, 11}
<strong>Output:</strong>
answer[] = {1, 8, 10, 11}
<strong>Explanation:</strong>
The <strong>answer[]</strong> array after merging both
the arrays and removing duplicates is
[1 8, 10, 11]
You have to return the size of the array
formed ( <strong>4</strong> in this case) and update the
answer array in the function <strong>mergeNsort()</strong>.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
a[] = {7, 1, 5, 3, 9}
M = 6
b[]  = {8, 4, 3, 5, 2, 6}
<strong>Output:</strong>
answer[] = {1, 2, 3, 4, 5, 6, 7, 8, 9} </span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>mergeNsort()</strong>&nbsp;which takes the array <strong>A[]</strong>, <strong>B[]</strong> and its size <strong>N</strong>,<strong> M </strong>respectively as inputs and returns the size of this array and store the merged array sorted in ascending order in the <strong>answer[]</strong>.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ <strong>N</strong> ≤ 10<sup>5</sup><br>
1 ≤ <strong>M</strong> ≤ 10<sup>5</sup><br>
1 ≤ <strong>A<sub>i</sub></strong> ≤ 10<sup>5</sup><br>
1 ≤ <strong>B<sub>i</sub></strong> ≤ 10<sup>5</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Sorting</code>&nbsp;<code>Merge Sort</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;
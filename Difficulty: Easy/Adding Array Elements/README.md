<h2><a href="https://www.geeksforgeeks.org/problems/adding-array-element4756/1">Adding Array Elements</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array&nbsp;<strong>Arr[]</strong>&nbsp;of size <strong>N&nbsp;</strong>and an integer&nbsp;<strong>K</strong>, you have to choose the first two minimum elements of the array and erase them, then insert the sum of these two elements in the array&nbsp;until all the elements are greater than or equal to <strong>K</strong> and find the number of such&nbsp;operations&nbsp;required.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 6, K = 6 
Arr[] = {1, 10, 12, 9, 2, 3}
<strong>Output:</strong> 2
<strong>Explanation:</strong> First we add <strong>(1 + 2)</strong>, now the
new list becomes <strong>3 10 12 9 3</strong>, then we add
<strong>(3 + 3), </strong>now the new list becomes <strong>6 10 12 9</strong>,
Now all the elements in the list are greater
than <strong>6</strong>. Hence the output is <strong>2</strong> i:e <strong>2</strong> operations
are required to do this. 
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, K = 4
Arr[] = {5, 4, 6, 4}
<strong>Output:</strong> 0
<strong>Explanation:</strong>&nbsp;Every element in the given array 
is greater than or equal to <strong>K</strong>.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>minOperations()</strong>&nbsp;which takes array of&nbsp;integers <strong>arr, n</strong>&nbsp;and&nbsp;<strong>k&nbsp;</strong>as parameters and returns an integer&nbsp;denoting the answer.&nbsp;If it is not possible to make elements greater than or equal to<strong> K</strong>, return&nbsp;<strong>-1</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N*logN)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span></p>

<p><span style="font-size:18px"><strong>Constraints :</strong><br>
1 ≤ N, K ≤ 10<sup>5</sup><br>
1 ≤ Arr[i] ≤ 10<sup>6</sup></span></p>

<p>&nbsp;</p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Heap</code>&nbsp;<code>Data Structures</code>&nbsp;
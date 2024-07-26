<h2><a href="https://www.geeksforgeeks.org/problems/faulty-wiring-and-bulbs2939/1">Faulty wiring and Bulbs</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs. "0 represents the bulb is off and 1 represents the bulb is on."</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N=4
arr[] = { 0, 0, 0, 0 }
<strong>Output:</strong>  1
<strong>Explanation</strong>: 
From the given set of bulbs change
the state of the first bulb from off
to on ,which eventually turn the rest
three bulbs on the right of it.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N=4
arr[] = { 1, 0, 0, 1 }
<strong>Output:</strong>  2
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
Since, this is a function problem. You don't need to take any input, as it is already accomplished by the driver code. You just need to complete the function <strong>countFlips</strong>() that takes <strong>array A and integer N</strong>&nbsp;as parameters and returns the minimum number of press required to turn on all the bulbs.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N).<br>
<strong>Expected Auxiliary Space:</strong> O(1).</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ N ≤ 10<sup>6</sup></span></p>
</div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Binary Representation</code>&nbsp;<code>Data Structures</code>&nbsp;
<h2><a href="https://leetcode.com/problems/minimum-number-of-operations-to-make-x-and-y-equal/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2998. Minimum Number of Operations to Make X and Y Equal</a></h2><h3>Medium</h3><hr><div><p>You are given two positive integers <code>x</code> and <code>y</code>.</p>

<p>In one operation, you can do one of the four following operations:</p>

<ol>
	<li>Divide <code>x</code> by <code>11</code> if <code>x</code> is a multiple of <code>11</code>.</li>
	<li>Divide <code>x</code> by <code>5</code> if <code>x</code> is a multiple of <code>5</code>.</li>
	<li>Decrement <code>x</code> by <code>1</code>.</li>
	<li>Increment <code>x</code> by <code>1</code>.</li>
</ol>

<p>Return <em>the <strong>minimum</strong> number of operations required to make </em> <code>x</code> <i>and</i> <code>y</code> equal.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> x = 26, y = 1
<strong>Output:</strong> 3
<strong>Explanation:</strong> We can make 26 equal to 1 by applying the following operations: 
1. Decrement x by 1
2. Divide x by 5
3. Divide x by 5
It can be shown that 3 is the minimum number of operations required to make 26 equal to 1.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> x = 54, y = 2
<strong>Output:</strong> 4
<strong>Explanation:</strong> We can make 54 equal to 2 by applying the following operations: 
1. Increment x by 1
2. Divide x by 11 
3. Divide x by 5
4. Increment x by 1
It can be shown that 4 is the minimum number of operations required to make 54 equal to 2.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> x = 25, y = 30
<strong>Output:</strong> 5
<strong>Explanation:</strong> We can make 25 equal to 30 by applying the following operations: 
1. Increment x by 1
2. Increment x by 1
3. Increment x by 1
4. Increment x by 1
5. Increment x by 1
It can be shown that 5 is the minimum number of operations required to make 25 equal to 30.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= x, y &lt;= 10<sup>4</sup></code></li>
</ul>
</div>
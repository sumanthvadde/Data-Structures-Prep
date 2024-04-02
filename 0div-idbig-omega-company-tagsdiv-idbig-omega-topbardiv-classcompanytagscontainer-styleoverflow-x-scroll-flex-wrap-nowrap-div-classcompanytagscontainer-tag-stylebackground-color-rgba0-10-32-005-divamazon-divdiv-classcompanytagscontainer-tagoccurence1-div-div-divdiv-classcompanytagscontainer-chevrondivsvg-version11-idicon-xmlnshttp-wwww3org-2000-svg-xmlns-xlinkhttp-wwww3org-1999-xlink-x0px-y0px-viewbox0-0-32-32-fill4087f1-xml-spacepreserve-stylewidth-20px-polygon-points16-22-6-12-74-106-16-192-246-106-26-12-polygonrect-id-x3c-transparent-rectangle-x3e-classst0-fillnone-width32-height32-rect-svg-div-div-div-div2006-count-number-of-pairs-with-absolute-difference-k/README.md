<h2><a href="https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">1</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2006. Count Number of Pairs With Absolute Difference K</a></h2><h3>Easy</h3><hr><div><p>Given an integer array <code>nums</code> and an integer <code>k</code>, return <em>the number of pairs</em> <code>(i, j)</code> <em>where</em> <code>i &lt; j</code> <em>such that</em> <code>|nums[i] - nums[j]| == k</code>.</p>

<p>The value of <code>|x|</code> is defined as:</p>

<ul>
	<li><code>x</code> if <code>x &gt;= 0</code>.</li>
	<li><code>-x</code> if <code>x &lt; 0</code>.</li>
</ul>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> nums = [1,2,2,1], k = 1
<strong>Output:</strong> 4
<strong>Explanation:</strong> The pairs with an absolute difference of 1 are:
- [<strong><u>1</u></strong>,<strong><u>2</u></strong>,2,1]
- [<strong><u>1</u></strong>,2,<strong><u>2</u></strong>,1]
- [1,<strong><u>2</u></strong>,2,<strong><u>1</u></strong>]
- [1,2,<strong><u>2</u></strong>,<strong><u>1</u></strong>]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> nums = [1,3], k = 3
<strong>Output:</strong> 0
<strong>Explanation:</strong> There are no pairs with an absolute difference of 3.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nums = [3,2,1,5,4], k = 2
<strong>Output:</strong> 3
<b>Explanation:</b> The pairs with an absolute difference of 2 are:
- [<strong><u>3</u></strong>,2,<strong><u>1</u></strong>,5,4]
- [<strong><u>3</u></strong>,2,1,<strong><u>5</u></strong>,4]
- [3,<strong><u>2</u></strong>,1,5,<strong><u>4</u></strong>]
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 200</code></li>
	<li><code>1 &lt;= nums[i] &lt;= 100</code></li>
	<li><code>1 &lt;= k &lt;= 99</code></li>
</ul>
</div>
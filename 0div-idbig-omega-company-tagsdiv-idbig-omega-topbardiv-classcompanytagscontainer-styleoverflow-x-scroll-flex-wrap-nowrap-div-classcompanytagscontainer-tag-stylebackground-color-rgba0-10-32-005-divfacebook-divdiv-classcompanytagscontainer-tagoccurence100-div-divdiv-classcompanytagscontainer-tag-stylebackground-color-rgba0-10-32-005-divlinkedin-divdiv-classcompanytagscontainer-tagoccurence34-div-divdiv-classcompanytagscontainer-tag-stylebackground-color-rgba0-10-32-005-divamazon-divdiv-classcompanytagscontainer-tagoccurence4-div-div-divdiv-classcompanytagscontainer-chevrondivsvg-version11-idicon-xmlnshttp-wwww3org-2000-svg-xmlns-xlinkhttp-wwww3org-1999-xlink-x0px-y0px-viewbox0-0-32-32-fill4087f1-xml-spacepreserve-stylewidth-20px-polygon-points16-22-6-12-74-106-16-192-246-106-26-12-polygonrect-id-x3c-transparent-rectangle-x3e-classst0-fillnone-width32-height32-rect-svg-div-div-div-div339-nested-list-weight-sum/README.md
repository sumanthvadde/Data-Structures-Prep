<h2><a href="https://leetcode.com/problems/nested-list-weight-sum/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Facebook</div><div class="companyTagsContainer--tagOccurence">100</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>LinkedIn</div><div class="companyTagsContainer--tagOccurence">34</div></div><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Amazon</div><div class="companyTagsContainer--tagOccurence">4</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>339. Nested List Weight Sum</a></h2><h3>Medium</h3><hr><div><p>You are given a nested list of integers <code>nestedList</code>. Each element is either an integer or a list whose elements may also be integers or other lists.</p>

<p>The <strong>depth</strong> of an integer is the number of lists that it is inside of. For example, the nested list <code>[1,[2,2],[[3],2],1]</code> has each integer's value set to its <strong>depth</strong>.</p>

<p>Return <em>the sum of each integer in </em><code>nestedList</code><em> multiplied by its <strong>depth</strong></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/14/nestedlistweightsumex1.png" style="width: 405px; height: 99px;">
<pre><strong>Input:</strong> nestedList = [[1,1],2,[1,1]]
<strong>Output:</strong> 10
<strong>Explanation:</strong> Four 1's at depth 2, one 2 at depth 1. 1*2 + 1*2 + 2*1 + 1*2 + 1*2 = 10.
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/01/14/nestedlistweightsumex2.png" style="width: 315px; height: 106px;">
<pre><strong>Input:</strong> nestedList = [1,[4,[6]]]
<strong>Output:</strong> 27
<strong>Explanation:</strong> One 1 at depth 1, one 4 at depth 2, and one 6 at depth 3. 1*1 + 4*2 + 6*3 = 27.</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> nestedList = [0]
<strong>Output:</strong> 0
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nestedList.length &lt;= 50</code></li>
	<li>The values of the integers in the nested list is in the range <code>[-100, 100]</code>.</li>
	<li>The maximum <strong>depth</strong> of any integer is less than or equal to <code>50</code>.</li>
</ul>
</div>
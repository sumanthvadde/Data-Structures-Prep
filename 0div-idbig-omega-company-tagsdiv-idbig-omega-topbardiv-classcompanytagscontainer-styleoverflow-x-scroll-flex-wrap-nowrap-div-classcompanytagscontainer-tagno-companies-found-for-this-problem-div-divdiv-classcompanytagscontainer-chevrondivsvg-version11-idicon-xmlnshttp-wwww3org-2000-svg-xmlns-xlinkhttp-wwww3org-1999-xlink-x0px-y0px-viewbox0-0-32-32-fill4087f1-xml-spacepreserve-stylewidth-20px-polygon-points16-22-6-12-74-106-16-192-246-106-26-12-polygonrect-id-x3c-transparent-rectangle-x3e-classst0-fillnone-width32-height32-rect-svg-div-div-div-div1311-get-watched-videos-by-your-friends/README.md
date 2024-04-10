<h2><a href="https://leetcode.com/problems/get-watched-videos-by-your-friends/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag">No companies found for this problem</div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1311. Get Watched Videos by Your Friends</a></h2><h3>Medium</h3><hr><div><p>There are <code>n</code> people, each person has a unique <em>id</em> between <code>0</code> and <code>n-1</code>. Given the arrays <code>watchedVideos</code> and <code>friends</code>, where <code>watchedVideos[i]</code> and <code>friends[i]</code> contain the list of watched videos and the list of friends respectively for the person with <code>id = i</code>.</p>

<p>Level <strong>1</strong> of videos are all watched videos by your&nbsp;friends, level <strong>2</strong> of videos are all watched videos by the friends of your&nbsp;friends and so on. In general, the level <code>k</code> of videos are all&nbsp;watched videos by people&nbsp;with the shortest path <strong>exactly</strong> equal&nbsp;to&nbsp;<code>k</code> with you. Given your&nbsp;<code>id</code> and the <code>level</code> of videos, return the list of videos ordered by their frequencies (increasing). For videos with the same frequency order them alphabetically from least to greatest.&nbsp;</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/01/02/leetcode_friends_1.png" style="width: 144px; height: 200px;"></strong></p>

<pre><strong>Input:</strong> watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 1
<strong>Output:</strong> ["B","C"] 
<strong>Explanation:</strong> 
You have id = 0 (green color in the figure) and your friends are (yellow color in the figure):
Person with id = 1 -&gt; watchedVideos = ["C"]&nbsp;
Person with id = 2 -&gt; watchedVideos = ["B","C"]&nbsp;
The frequencies of watchedVideos by your friends are:&nbsp;
B -&gt; 1&nbsp;
C -&gt; 2
</pre>

<p><strong class="example">Example 2:</strong></p>

<p><strong><img alt="" src="https://assets.leetcode.com/uploads/2020/01/02/leetcode_friends_2.png" style="width: 144px; height: 200px;"></strong></p>

<pre><strong>Input:</strong> watchedVideos = [["A","B"],["C"],["B","C"],["D"]], friends = [[1,2],[0,3],[0,3],[1,2]], id = 0, level = 2
<strong>Output:</strong> ["D"]
<strong>Explanation:</strong> 
You have id = 0 (green color in the figure) and the only friend of your friends is the person with id = 3 (yellow color in the figure).
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == watchedVideos.length ==&nbsp;friends.length</code></li>
	<li><code>2 &lt;= n&nbsp;&lt;= 100</code></li>
	<li><code>1 &lt;=&nbsp;watchedVideos[i].length &lt;= 100</code></li>
	<li><code>1 &lt;=&nbsp;watchedVideos[i][j].length &lt;= 8</code></li>
	<li><code>0 &lt;= friends[i].length &lt; n</code></li>
	<li><code>0 &lt;= friends[i][j]&nbsp;&lt; n</code></li>
	<li><code>0 &lt;= id &lt; n</code></li>
	<li><code>1 &lt;= level &lt; n</code></li>
	<li>if&nbsp;<code>friends[i]</code> contains <code>j</code>, then <code>friends[j]</code> contains <code>i</code></li>
</ul>
</div>
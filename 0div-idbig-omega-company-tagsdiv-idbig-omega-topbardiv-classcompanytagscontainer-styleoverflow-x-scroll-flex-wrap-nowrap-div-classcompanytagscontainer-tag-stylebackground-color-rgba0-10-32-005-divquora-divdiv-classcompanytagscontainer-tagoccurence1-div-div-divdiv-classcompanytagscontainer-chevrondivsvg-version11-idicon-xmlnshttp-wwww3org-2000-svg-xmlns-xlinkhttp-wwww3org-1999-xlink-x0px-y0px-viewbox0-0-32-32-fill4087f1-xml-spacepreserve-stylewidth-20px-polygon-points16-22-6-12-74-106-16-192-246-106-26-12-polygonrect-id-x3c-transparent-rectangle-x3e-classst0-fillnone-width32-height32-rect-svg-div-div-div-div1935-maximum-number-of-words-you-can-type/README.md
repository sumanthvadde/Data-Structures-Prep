<h2><a href="https://leetcode.com/problems/maximum-number-of-words-you-can-type/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Quora</div><div class="companyTagsContainer--tagOccurence">1</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>1935. Maximum Number of Words You Can Type</a></h2><h3>Easy</h3><hr><div><p>There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.</p>

<p>Given a string <code>text</code> of words separated by a single space (no leading or trailing spaces) and a string <code>brokenLetters</code> of all <strong>distinct</strong> letter keys that are broken, return <em>the <strong>number of words</strong> in</em> <code>text</code> <em>you can fully type using this keyboard</em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> text = "hello world", brokenLetters = "ad"
<strong>Output:</strong> 1
<strong>Explanation:</strong> We cannot type "world" because the 'd' key is broken.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> text = "leet code", brokenLetters = "lt"
<strong>Output:</strong> 1
<strong>Explanation:</strong> We cannot type "leet" because the 'l' and 't' keys are broken.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> text = "leet code", brokenLetters = "e"
<strong>Output:</strong> 0
<strong>Explanation:</strong> We cannot type either word because the 'e' key is broken.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= text.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= brokenLetters.length &lt;= 26</code></li>
	<li><code>text</code> consists of words separated by a single space without any leading or trailing spaces.</li>
	<li>Each word only consists of lowercase English letters.</li>
	<li><code>brokenLetters</code> consists of <strong>distinct</strong> lowercase English letters.</li>
</ul>
</div>
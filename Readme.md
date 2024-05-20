#### [task #01](https://leetcode.com/problems/jewels-and-stones/)

You're given strings jewels representing the types of stones that are jewels, 
and stones representing the stones you have. 
Each character in stones is a type of stone you have. 
You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so "`a`" is considered a different type of stone from "`A`".

example 1:
`Input: jewels = "aA", stones = "aAAbbbb"
Output: 3`

example 2:
`Input: jewels = "z", stones = "ZZ"
Output: 0`


#### [task #02](https://leetcode.com/problems/number-of-good-pairs/)

Given an array of integers `nums`, return the number of good pairs.

A pair `(i, j)` is called good if `nums[i] == nums[j]` and `i < j`.

example 1:
`Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.`

example 2:
`Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.`

example 3:
`Input: nums = [1,2,3]
Output: 0`


### [task 3](https://leetcode.com/problems/maximum-number-of-balloons/description/)

Given a string `text`, you want to use the characters of text to form as many instances 
of the word  "balloon" as possible.

You can use each character in `text` at most once. 
Return the maximum number of instances that can be formed.
# Technical-Questions-with-java


# 1.	Array:
e.g. Two Sum, Kadane's Algorithm, Rotate Array

✅ 1. Two Sum
Input: nums = [2, 7, 11, 15], target = 9
Output: [0, 1]
🧠 Kis do index par value ka sum target ke barabar hota hai?
________________________________________
✅ 2. Find Missing Number (0 to n)
Input: nums = [0, 1, 3]
Output: 2
🎯 0 se n tak ke number mein kaunsa number missing hai?
________________________________________
✅ 3. Check for Duplicates
Input: nums = [1, 2, 3, 1]
Output: true
🧠 Array mein koi number do baar repeat to nahi ho raha?
________________________________________
✅ 4. Maximum Subarray (Kadane’s Algorithm)
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
✍️ Subarray ka maximum sum kya hoga? (Answer: 4 + (-1) + 2 + 1 = 6)
________________________________________
✅ 5. Rotate Array
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
🌀 Array ko right mein 3 step rotate karo.
________________________________________
✅ 6. Count Even Numbers
Input: nums = [12, 345, 2, 6, 7896]
Output: 2
📌 Kitne numbers aise hain jisme even number of digits hain (yahan 12 and 7896).
________________________________________
✅ 7. Merge Two Sorted Arrays
Input: nums1 = [1,2,3], nums2 = [2,5,6]
Output: [1,2,2,3,5,6]
💡 Dono sorted arrays ko merge karke ek sorted array banao.
________________________________________
✅ 8. Move Zeroes to End
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
📦 Saare 0 ko end mein le jao, baaki order same rahe.
________________________________________
✅ 9. Intersection of Two Arrays
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
🔁 Common elements dhoondo dono arrays mein.
________________________________________
✅ 10. Reverse Array
Input: nums = [1,2,3,4,5]
Output: [5,4,3,2,1]
🔄 Array ko ulta karo.
________________________________________
✅ 11. Find Second Largest Element
Input: nums = [12, 35, 1, 10, 34, 1]
Output: 34
🏆 Second highest number kaun sa hai?
________________________________________
✅ 12. Count Number of Pairs with Given Sum
Input: nums = [1, 5, 7, -1, 5], sum = 6
Output: 3
📊 Kitne pairs ka sum 6 hai? (1+5, 7+-1, 1+5)




# 2.	String:
e.g. Longest Palindrome, Anagram Check, Substring without Repeating Characters

✅ Top String Questions with Input-Output Format
________________________________________
🔠 1. Longest Palindromic Substring
Input: "babad"
Output: "bab" (or "aba")
💡 Longest substring dhoondo jo palindromic ho.
________________________________________
🔤 2. Valid Anagram
Input: s = "anagram", t = "nagaram"
Output: true
✏️ Check karo ki dono strings ke characters same hain ya nahi (same count bhi).
________________________________________
🧠 3. Longest Substring Without Repeating Characters
Input: "abcabcbb"
Output: 3
💡 Longest substring jisme koi character repeat na ho.
________________________________________
🪞 4. Check if String is Palindrome
Input: "madam"
Output: true
🔁 Reverse karke check karo string palindromic hai ya nahi.
________________________________________
🔁 5. Reverse Words in a String
Input: "I love coding"
Output: "coding love I"
🔄 Har word ka order reverse karo, lekin characters nahi.
________________________________________
💬 6. Count Vowels and Consonants
Input: "Hello World"
Output: Vowels = 3, Consonants = 7
🗣️ Vowels aur consonants ka count nikaalo.
________________________________________
📊 7. Frequency of Characters
Input: "aabccc"
Output: a:2, b:1, c:3
📋 Har character kitni baar aaya?
________________________________________
🤯 8. First Non-Repeating Character
Input: "aabbcddbe"
Output: "c"
🧠 Jo character sirf ek baar aaya ho, sabse pehle.



# 3.	Linked List:
e.g. Reverse Linked List, Detect Loop, Merge Two Lists



✅ Linked List Based Questions
________________________________________

🔁 1. Reverse Linked List
Input: 1 → 2 → 3 → 4 → 5
Output: 5 → 4 → 3 → 2 → 1
💡 Reverse the list in-place.
________________________________________

🔁 2. Detect Loop in Linked List
Input: 1 → 2 → 3 → 4 → 2 (loop back to node 2)
Output: true
💡 Use Floyd’s Cycle Detection Algorithm (slow & fast pointer).
________________________________________


➕ 3. Merge Two Sorted Linked Lists
Input:
List1: 1 → 3 → 5
List2: 2 → 4 → 6
Output: 1 → 2 → 3 → 4 → 5 → 6
💡 Merge without using extra space (recursively or iteratively).
________________________________________


🔄 4. Remove N-th Node from End
Input: 1 → 2 → 3 → 4 → 5, n = 2
Output: 1 → 2 → 3 → 5
💡 2-pointer approach, maintain a gap of n.
________________________________________


🎯 5. Find Middle of Linked List
Input: 1 → 2 → 3 → 4 → 5
Output: 3
💡 Use slow and fast pointer.
________________________________________


🔁 6. Check if Linked List is Palindrome
Input: 1 → 2 → 2 → 1
Output: true
💡 Reverse second half and compare.
________________________________________


🔁 7. Intersection Point of Two Linked Lists
Input: Two lists merge at node with value 8
Output: 8
💡 Get lengths, align, then move together.
________________________________________


🔀 8. Remove Duplicates from Sorted List
Input: 1 → 1 → 2 → 3 → 3
Output: 1 → 2 → 3
________________________________________


🔄 9. Rotate Linked List
Input: 1 → 2 → 3 → 4 → 5, k = 2
Output: 4 → 5 → 1 → 2 → 3
💡 Connect list to itself, break at right point.
________________________________________

🔁 10. Remove Loop in Linked List
Input: 1 → 2 → 3 → 4 → 5 → 2 (loop)
Output: Loop removed.
💡 Pehle loop detect karo (Floyd’s Algorithm), phir uska starting node identify karke usse null karo.
________________________________________


🔄 11. Reverse Linked List in Groups of K
Input: 1 → 2 → 3 → 4 → 5 → 6, k = 2
Output: 2 → 1 → 4 → 3 → 6 → 5
💡 K nodes reverse karo har group mein using recursion or iteration.
________________________________________

🧮 12. Add Two Numbers Represented by Linked Lists
Input:
List1: 2 → 4 → 3 (represents 342)
List2: 5 → 6 → 4 (represents 465)
Output: 7 → 0 → 8 (342 + 465 = 807)
________________________________________

🚀 13. Sort a Linked List
Input: 4 → 2 → 1 → 3
Output: 1 → 2 → 3 → 4
💡 Merge Sort use karo (T.C. O(n log n), S.C. O(log n) recursion stack)
________________________________________

📐 14. Copy List with Random Pointer
Each node has next and random pointer.
Input: Deep copy banao with both pointers preserved.
💡 Use a hashmap or interleave technique.
________________________________________

🔁 15. Find Length of Loop
If loop exists, us loop ke nodes count karo.
Output: Number of nodes in the loop.
________________________________________

🧵 16. Flatten Linked List with Next and Bottom Pointers
Input:
________________________________________

rust
Copy
Edit
5 -> 10 -> 19 -> 28  
|     |     |     |  
7     20    22    35  
|           |     |  
8           50    40  
|                 |  
30                45  
Output: Flattened sorted single list.
________________________________________

🔄 17. Segregate Even and Odd Nodes
Input: 17 → 15 → 8 → 12 → 10 → 5 → 4
Output: 8 → 12 → 10 → 4 → 17 → 15 → 5
________________________________________

💡 18. Detect and Remove Duplicate Nodes in Unsorted List
Input: 10 → 12 → 11 → 11 → 12 → 11 → 10
Output: 10 → 12 → 11
________________________________________

🚨 19. Check if Two Linked Lists are Identical
Input:
List1: 1 → 2 → 3
List2: 1 → 2 → 3
Output: true
________________________________________






# 4.	Stack/Queue:
e.g. Valid Parentheses, Next Greater Element, Sliding Window Maximum
# 5.	Tree:
e.g. Inorder Traversal, Height of Tree, Lowest Common Ancestor
# 6.	Graph:
e.g. BFS/DFS, Cycle Detection, Dijkstra’s Algorithm
# 7.	Dynamic Programming:
e.g. Fibonacci, Longest Common Subsequence, 0/1 Knapsack
# 8.	Sorting/Searching:
e.g. Binary Search, Quick Sort, Merge Sort
# 9.	Greedy/Backtracking:
e.g. N-Queens, Subset Sum, Activity Selection
# 10.	Custom / Interview Type Problem
You can tell me the company name (like Amazon, Google, TCS) or a question statement.




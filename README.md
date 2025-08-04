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

🔄 10. Reverse Linked List in Groups of K
Input: 1 → 2 → 3 → 4 → 5 → 6, k = 2
Output: 2 → 1 → 4 → 3 → 6 → 5
💡 K nodes reverse karo har group mein using recursion or iteration.
________________________________________

🧮 11. Add Two Numbers Represented by Linked Lists
Input:
List1: 2 → 4 → 3 (represents 342)
List2: 5 → 6 → 4 (represents 465)
Output: 7 → 0 → 8 (342 + 465 = 807)
________________________________________

🚀 12. Sort a Linked List
Input: 4 → 2 → 1 → 3
Output: 1 → 2 → 3 → 4
💡 Merge Sort use karo (T.C. O(n log n), S.C. O(log n) recursion stack)
________________________________________

📐 13. Copy List with Random Pointer
Each node has next and random pointer.
Input: Deep copy banao with both pointers preserved.
💡 Use a hashmap or interleave technique.
________________________________________

🔁 14. Find Length of Loop
If loop exists, us loop ke nodes count karo.
Output: Number of nodes in the loop.________________________________________

🔄 15. Segregate Even and Odd Nodes
Input: 17 → 15 → 8 → 12 → 10 → 5 → 4
Output: 8 → 12 → 10 → 4 → 17 → 15 → 5
________________________________________




# 4.	Stack/Queue:
e.g. Valid Parentheses, Next Greater Element, Sliding Window Maximum

________________________________________

📦 Stack / Queue: Interview Questions (with Java Focus)
________________________________________

✅ 1. Valid Parentheses
Input: s = "({[]})"
Output: true
💡 Har open bracket ka correct close bracket aana chahiye — Stack use karke match karo.


________________________________________

✅ 2. Implement Stack using Queue
Input: push(1), push(2), pop()
Output: 2
💡 Queue ko use karke Stack ka behavior simulate karo (LIFO).
________________________________________

✅ 3. Implement Queue using Stack
Input: push(1), push(2), pop()
Output: 1
💡 Stack ko use karke Queue ka behavior dikhana (FIFO).
________________________________________

✅ 4. Next Greater Element
Input: [4, 5, 2, 10]
Output: [5, 10, 10, -1]
💡 Har element ke baad jo pehla bada number aaye — Stack + Traversal.
________________________________________

✅ 5. Daily Temperatures
Input: [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
💡 Kitne din baad temperature badega? Monotonic stack use hota hai.
________________________________________

✅ 6. Min Stack
Operations: push(2), push(0), push(3), push(0), getMin(), pop(), getMin()
Output: 0, then 0
💡 Stack ke saath current minimum track karo.
________________________________________

✅ 7. Evaluate Reverse Polish Notation (Postfix Expression)
Input: ["2", "1", "+", "3", "*"]
Output: 9
💡 RPN evaluate karne ke liye Stack use hota hai.
________________________________________

✅ 8. Sliding Window Maximum (Queue/Deque)
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
💡 Window ke max element ko efficient way me nikalna hai — Deque se.
________________________________________

✅ 9. Design Circular Queue
Operations: enqueue, dequeue, front, rear, isEmpty, isFull
💡 Queue ko array se implement karo with circular logic (front/rear wrap around).
________________________________________

✅ 10. Largest Rectangle in Histogram
Input: [2,1,5,6,2,3]
Output: 10
💡 Stack se previous/next smaller bar dhoondhkar area calculate karo.
________________________________________

✅ 11. Remove K Digits to Make Smallest Number
Input: num = "1432219", k = 3
Output: "1219"
💡 Stack use karke minimum banane wale digits bachaao.
________________________________________

✅ 12. Simplify Unix Path
Input: "/a/./b/../../c/"
Output: "/c"
💡 Stack se valid path banate jao (.. means pop).
________________________________________

✅ 13. Rotten Oranges Problem (BFS using Queue)
Input: Grid with 0=empty, 1=fresh, 2=rotten
Output: Minimum minutes to rot all oranges
💡 Multi-source BFS using queue.
________________________________________

✅ 14. Design Browser History (Back/Forward)
Operations: visit(url), back(steps), forward(steps)
💡 Stack use karke back/forward track karo.


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




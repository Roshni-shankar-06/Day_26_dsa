import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Build adjacency list and in-degree array
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
    

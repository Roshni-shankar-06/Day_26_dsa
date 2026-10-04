class Solution {
    public int findSpecialInteger(int[] arr) {
        int quarterSpan = arr.length / 4;
        
        // Loop up to the point where (i + quarterSpan) is within bounds
        for (int i = 0; i < arr.length - quarterSpan; i++) {
            if (arr[i] == arr[i + quarterSpan]) {
                return arr[i];
            }
        }
        
        return -1;
    }
}

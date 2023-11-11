

class Solution {
    
    public boolean validateStackSequences(int[] pushed, int[] popped){
        
        Stack<Integer> stack = new Stack<>();
        int rightPointer = 0;
        
        for(int val : pushed){
            stack.push(val);
            while(!stack.isEmpty() && stack.peek() == popped[rightPointer]){
                stack.pop();
                rightPointer++;
            }
        }
        return stack.isEmpty();
    }
}
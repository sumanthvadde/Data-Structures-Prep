class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();

        for(int asteroid: asteroids){
            boolean toInsert = true;
            while(!st.isEmpty() && st.peek() > 0 && asteroid < 0){
                if(st.peek() > (-1 * asteroid)){
                    toInsert = false;
                    break;
                }
                else if(st.peek() == (-1 * asteroid)){
                    toInsert = false;
                    st.pop();
                    break;
                }
                else{
                    st.pop();
                }
            }

            if(toInsert) st.push(asteroid);
        }

        int[] ans = new int[st.size()];

        int idx = st.size() - 1;

        while(!st.isEmpty()){
            ans[idx--] = st.pop();
        }

        return ans;
    }
}


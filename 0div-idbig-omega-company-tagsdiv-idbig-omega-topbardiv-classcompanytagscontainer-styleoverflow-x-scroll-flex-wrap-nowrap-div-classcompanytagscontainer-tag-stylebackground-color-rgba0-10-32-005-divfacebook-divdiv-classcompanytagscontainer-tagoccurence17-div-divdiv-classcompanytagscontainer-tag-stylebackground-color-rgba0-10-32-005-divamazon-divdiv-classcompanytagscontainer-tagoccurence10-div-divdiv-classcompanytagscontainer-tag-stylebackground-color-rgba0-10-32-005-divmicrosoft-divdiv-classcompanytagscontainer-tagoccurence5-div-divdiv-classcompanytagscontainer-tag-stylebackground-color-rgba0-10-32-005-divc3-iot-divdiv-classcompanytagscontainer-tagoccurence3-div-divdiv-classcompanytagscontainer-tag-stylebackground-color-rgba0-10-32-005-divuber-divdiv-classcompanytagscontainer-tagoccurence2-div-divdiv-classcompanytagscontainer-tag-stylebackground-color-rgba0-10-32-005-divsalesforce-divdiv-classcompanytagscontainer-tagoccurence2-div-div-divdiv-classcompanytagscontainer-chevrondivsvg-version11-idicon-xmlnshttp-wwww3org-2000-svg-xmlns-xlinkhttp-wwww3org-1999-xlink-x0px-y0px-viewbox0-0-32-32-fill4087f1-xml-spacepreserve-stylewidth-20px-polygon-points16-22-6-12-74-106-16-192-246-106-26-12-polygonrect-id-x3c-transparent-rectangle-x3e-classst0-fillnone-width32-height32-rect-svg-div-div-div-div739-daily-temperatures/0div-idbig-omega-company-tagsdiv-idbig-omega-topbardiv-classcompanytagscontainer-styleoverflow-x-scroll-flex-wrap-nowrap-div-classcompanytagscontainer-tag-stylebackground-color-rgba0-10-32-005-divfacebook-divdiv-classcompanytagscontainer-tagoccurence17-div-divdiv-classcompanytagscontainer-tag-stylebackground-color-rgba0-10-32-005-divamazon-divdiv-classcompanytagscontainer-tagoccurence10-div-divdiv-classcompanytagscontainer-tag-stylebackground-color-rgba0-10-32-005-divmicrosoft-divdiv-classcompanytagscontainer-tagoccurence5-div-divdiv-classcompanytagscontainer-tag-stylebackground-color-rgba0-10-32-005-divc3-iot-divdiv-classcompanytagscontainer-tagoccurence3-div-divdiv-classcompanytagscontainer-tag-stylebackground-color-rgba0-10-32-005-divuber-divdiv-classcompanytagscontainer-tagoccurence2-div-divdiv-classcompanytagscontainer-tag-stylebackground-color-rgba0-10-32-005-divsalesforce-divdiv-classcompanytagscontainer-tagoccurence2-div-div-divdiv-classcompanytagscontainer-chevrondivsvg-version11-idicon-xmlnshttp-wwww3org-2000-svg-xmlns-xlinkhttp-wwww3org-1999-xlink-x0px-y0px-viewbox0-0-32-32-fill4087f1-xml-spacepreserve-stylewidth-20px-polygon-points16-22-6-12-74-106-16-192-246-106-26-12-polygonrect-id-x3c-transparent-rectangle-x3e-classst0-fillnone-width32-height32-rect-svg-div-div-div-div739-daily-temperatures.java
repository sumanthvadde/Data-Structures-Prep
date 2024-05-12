

class Solution{
    public int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            int currentTemp = temperatures[i];
            while(!stack.isEmpty() && temperatures[stack.peek()] < currentTemp){
                int lesserTemperature = stack.pop();
                result[lesserTemperature] = i - lesserTemperature;
            }
            stack.push(i);
        }
        return result;
    }
}
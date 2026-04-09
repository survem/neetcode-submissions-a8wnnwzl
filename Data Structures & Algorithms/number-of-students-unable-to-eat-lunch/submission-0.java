class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Stack<Integer> stack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) stack.push(sandwiches[i]);
        int cnt1 = 0; 
        int cnt0 = 0;
        
        for(int n: students)
        {
            if(n==1)
                cnt1++;
            if(n==0)
                cnt0++;
        }
        
        while(!stack.isEmpty())
        {
            int n = stack.peek();
            if( n == 1 && cnt1>0)
            {
                cnt1--;
                stack.pop();
            }
            else if(n==0 && cnt0 >0)
            {
                cnt0--;
                stack.pop();
            }
            else {
                break;
            }
        }
        return cnt1 + cnt0;
    }
}
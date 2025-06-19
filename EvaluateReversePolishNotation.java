class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>s1=new Stack<>();
        for(String e:tokens)
        {
            if(!e.equals("+")&&!e.equals("-")&&!e.equals("*")&&!e.equals("/"))
            {
                s1.push(Integer.parseInt(e));
            }
            else
            {
                int a=s1.pop();
                int b=s1.pop();
                if(e.equals("+"))
                {
                    int c=a+b;
                    s1.push(c);
                }
                else if(e.equals("-"))
                {
                    int c=b-a;
                    s1.push(c);
                }
                else if(e.equals("*"))
                {
                    int c=b*a;
                    s1.push(c);
                }
                else
                {
                    int c=b/a;
                    s1.push(c);
                }
            }
        }
        return s1.pop();
    }
}

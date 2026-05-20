class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mystack= new Stack<>();
        for(String n:tokens){
            if("+-*/".contains(n) && n.length() == 1){
                int x=mystack.pop();
                int y=mystack.pop();
                switch (n) {

                    case "+":

                        mystack.push(y + x);

                        break;

                    case "-":

                        mystack.push(y - x);

                        break;

                    case "*":

                        mystack.push(y * x);

                        break;

                    case "/":

                        mystack.push(y / x);

                        break;

                }
            }
            else{
                mystack.push(Integer.parseInt(n));
            }
            
        }
        return mystack.peek();
    }
}

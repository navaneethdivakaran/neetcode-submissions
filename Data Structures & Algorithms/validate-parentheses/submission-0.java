class Solution {
    public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // opening brackets

            if (ch == '(' || ch == '{' || ch == '[') {

                stack.push(ch);

            } 

            // closing brackets

            else {

                // stack empty means no matching opening bracket

                if (stack.isEmpty()) {

                    return false;

                }

                char top = stack.pop();

                // check matching pair

                if ((ch == ')' && top != '(') ||

                    (ch == '}' && top != '{') ||

                    (ch == ']' && top != '[')) {

                    return false;

                }

            }

        }

        // valid only if stack becomes empty

        return stack.isEmpty();

    }
}

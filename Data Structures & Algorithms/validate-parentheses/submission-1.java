class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {

                if (stack.empty()) {
                    return false;
                }

                if (current == ')') {
                    if (stack.peek().equals('(')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                else if (current == ']') {
                    if (stack.peek().equals('[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }

                else if (current == '}') {
                    if (stack.peek().equals('{')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.empty();
    }
}
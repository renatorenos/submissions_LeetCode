import java.util.Stack;

public class EASY_ValidParentheses {
    
    public static void main(String[] args) {
        String[] inputs = {"()", "()[]{}", "(]", "){"};        
        for (String s: inputs)
            System.out.println(isValid(s)); 
    }

    public static boolean isValid(String s) {
        Stack<Character> sChar = new Stack<>();

        if(s.length() == 0){
            return true;
        }

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '['  || c == '{' )
                sChar.push(c);
            else {
                if (!sChar.isEmpty()) {
                    if ( (c == ')' && sChar.peek() == '(') || (c == ']' && sChar.peek() == '[') || (c == '}' && sChar.peek() == '{') )
                        sChar.pop();
                    else 
                        return false;
                } else {
                    return false;
                }
            }
        }

        return sChar.isEmpty();
    }
}
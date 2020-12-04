package 栈;

import java.util.Stack;

public class N20 {
    public boolean isValid(String s) {

        char[] chars=s.toCharArray();

        Stack<Character> st= new Stack<>();

        for(char c:chars) {
            if(c=='(' ||c=='{' ||c=='[' ) {
                st.push(c);
            }else {
                if(!st.isEmpty()){
                    char top=st.peek();
                    if(top == '(' && c==')') {
                        st.pop();
                    }else if(top == '{' && c=='}') {
                        st.pop();
                    }else if(top == '[' && c==']') {
                        st.pop();
                    }else {
                        return false;
                    }
                }else{
                    return false;
                }

            }
        }
        if(st.isEmpty()) {
            return true;
        }else {
            return false;
        }


    }
}

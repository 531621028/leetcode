package com.hkk.simple;

import java.util.Stack;

/**
 * Created by kang on 2019/4/17.
 */
public class IsValid {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            char c = s.charAt(index++);
            switch (c) {
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new IsValid().isValid("{[(){}]}"));
    }
}

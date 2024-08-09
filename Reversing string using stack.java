package com.mycompany.java_task;

class reverse_string_stack {
    //function to reverse the string

    public void reverse(StringBuffer str) {
        // Create a stack of capacity
        // equal to length of string
        int n = str.length();
        stack obj = new stack(n);

        // Push all characters of string
        // to stack
        int i;
        for (i = 0; i < n; i++) {
            obj.push(str.charAt(i));
        }

        // Pop all characters of string
        // and put them back to str
        for (i = 0; i < n; i++) {
            char ch = obj.pop();
            str.setCharAt(i, ch);
        }
    }
}

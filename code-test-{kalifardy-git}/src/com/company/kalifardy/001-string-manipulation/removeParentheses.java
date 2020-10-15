package com.company.kalifardy;

public class removeParentheses {

    public static void main(String[] args) {
        String data1 = "example(unwanted thing)example";

        String sub_data1 = data1.substring(0, 7);
        String sub_data2 = data1.substring(23, 30);


        System.out.println(sub_data1+sub_data2);
    }
}


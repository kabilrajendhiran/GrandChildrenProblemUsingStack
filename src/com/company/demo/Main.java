package com.company.demo;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String arr[][] ={{"Lava","Rama"},{"Kusha","Rama"},{"Lava's Son","Lava"},{"Rama","Dasarathan"},{"Lakshman",
                "Dasarathan"},
                {"Angad","Lakshman"},{"Dharamketu","Lakshman"},{"Abhisek","Amitabh"},{"Aaradhya","Abhisek"}
        };
        int count=0;

        Stack<String> stack = new Stack();
        String name = "Dasarathan";

        for(int  i=0;i< arr.length;i++)
        {
            if (arr[i][1].equals(name))
            {
                String child = arr[i][0];
                stack.push(child);

                while (!stack.isEmpty())
                {
                    String na = stack.pop();

                    for (int j = 0; j < arr.length; j++) {
                        if(arr[j][1].equals(na))
                        {
                            stack.push(arr[j][0]);
                            count++;
                        }
                    }

                }

            }
        }

        System.out.println(count);
    }
}

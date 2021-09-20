package com.company.Azat.Tasks.day13.Tasks.PostfixCalcul;
import java.io.*;
import  java.util.Scanner;
import java.util.Stack;

public class PostfixCalc {
    private  static  Scanner in = new Scanner(System.in); // инструмент считывания пользовательского ввода

    public static void main(String[] args) {
        System.out.print("Enter action: ");
        String str = in.nextLine();
        String[] strings = str.split(" ");
        Stack<Double> stack = new Stack<Double>();

        for(int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                stack.push(Double.parseDouble(strings[i]));
            } else {
                double num1 = stack.pop();
                double num2 = stack.pop();
                //double number = 0, sqrt = 0;
                //number = in.nextDouble();
                //sqrt = squareRoot(number);


                switch (strings[i]) {
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num1 * num2);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                        break;
                    case "%":
                        stack.push(num1 % num2);
                        break;
                    case "sqrt":
                        stack.push((num1/num2));
                        break;
                    case "abs":
                        stack.push(Math.abs(2.2));
                    default:
                }
            }

                }
        if(!stack.empty()){
            System.out.println(stack.pop());
        }else {
            System.out.println("Error");
        }

            }
    private static boolean isNumber(String string) {
        try {
            Double.parseDouble(string);

            return  true;
        }catch (NumberFormatException e){

            return false;
        }
    }}
    /*public static double squareRoot(double number){
        int i =1;
        while (true){
            if(num1*num2==number)
                return  i;
            else  if(num1*num2 > number)
                return squareRoot(number, i-1,i);
            i++;
        }

    }

    }*/






       /* System.out.print("Enter a number: ");
        in = sc.next();
        double num1 = Double.parseDouble(in);



        if(oper == '+') {
            double result = num1 + num2;
            System.out.println(result);
        } else if(oper == '-') {
            double result = num1 - num2;
            System.out.println(result);
        } else if(oper == '*') {
            double result = num1 * num2;
            System.out.println(result);
        } else if(oper == '/') {
            double result = num1 / num2;
            System.out.println(result);
        }else if(oper == sqrt) {
            double result = (num1 * num2);
            System.out.println(result);
        }else {
            double result = Math.abs(1.0/0);
            System.out.println(result);
        }
        System.out.println("Hope this helped your mathmetical troubles!");

    }}

    }
}*/

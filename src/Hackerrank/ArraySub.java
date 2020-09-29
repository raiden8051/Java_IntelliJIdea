package Hackerrank;

import java.util.Scanner;

public class ArraySub {

        public static void main (String[] args) {
            //code

            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.nextLine();
            for(int mainLoop=0;mainLoop<num;mainLoop++){

                String[] s = sc.nextLine().split(" ");
                String[] arr = new String[Integer.parseInt(s[0])];
                int value = Integer.parseInt(s[1]);

                arr = (sc.nextLine().split(" "));

                int sum = 0;
                int start = 0, end = 0;

                for(int i=0;i<arr.length;i++)
                {
                    if(sum<value) {
                        sum += Integer.parseInt(arr[end]);
                        if(sum==value) {
                            System.out.println((start+1) + " " + (end+1));
                            break;
                        }
                        end++;
                    }
                    else if(sum>value) {
                        sum -= Integer.parseInt(arr[start]);
                        if (sum == value) {
                            System.out.println((start+1) + " " + (end+1));
                            break;
                        }
                        start++;
                    }
                }

            }

        }
    }

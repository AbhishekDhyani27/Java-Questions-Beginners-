/*Q1 Java Program to check given String is Panagram or not?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
    public static String isPanagram(String s) {
        if(s.length()<26) {
            return "Its not a Panagram";
        }
        else {
            for(char ch='a';ch<='z';ch++) {
                if (s.indexOf(ch)<0) {
                    return "Its not a Panagram";
                }
            }
        }
        return "Its a Panagram";
    }
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string to check whether it is Panagram or not: ");
        String s = bf.readLine();
        System.out.println(isPanagram(s.toLowerCase()));
    }
}
*/


/*Q2 WAP to find intersection of elements in two Arrays.

import java.util.HashSet;

public class J3 {
    public static void printIntersection(int[] arr1,int[] arr2) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : arr1) {
            hs.add(i);
        }
        for (int i : arr2) {
            if (hs.contains(i)) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,8,9,7,3};
        printIntersection(arr1, arr2);
    }
}
*/


/*Q3 Stack implementation using array in java.

public class J3 {
    int[] arr = new int[5];
    int top = 0;
    public void push(int x) {
        top++;
        arr[top]=x;
        System.out.println("Element pushed into the stack="+x);
    }
    public void pop() {
        int x=arr[top--];
        System.out.println("Element popped from the stack="+x);
    }
    public int peek(){
        return arr[top];
    }
    public static void main(String[] args) {
        ABC st = new ABC();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop();
        System.out.println("Printing the top most value="+st.peek());
    }
}
*/


/*Q4 WAP to find number of occurences of a character.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the String: ");
        String str1 = bf.readLine();
        int initialLength = str1.length();
        System.out.println("Enter The Character to find the Occurrence: ");
        String str2 = bf.readLine();
        str1 = str1.replace(str2,"");
        int finalLength = str1.length();
        System.out.println("Total No. of occurrences of character "+str2+" is "+(initialLength-finalLength));
    }
}
*/



/*Q5 Stack Implementation using two arrays in Java.

public class J3 {
    int size;
    int top1,top2;
    int[] array;

    public J3(int size) {
        this.size = size;
        array = new int[size];
        top1 = -1;
        top2 = size;
    }
        public void push1(int x) {
        if (top1<top2) {
            top1++;
            array[top1] = x;
            System.out.println("Pushed element into the Stack1 "+x);
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    public void push2(int y) {
        if (top2-1>top1) {
            top2--;
            array[top2] = y;
            System.out.println("Pushed element into the Stack2 "+y);
        }
        else {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    public void pop1() {
        if(top1>=0) {
            int x = array[top1];
            System.out.println("Popped out element is "+x);
            top1--;
        }
        else {
            System.out.println("Stack Underflow ");
        }
    }
    public void pop2() {
        if(top2<size) {
            int y = array[top2];
            System.out.println("Popped out element is "+y);
            top2++;
        }
        else {
            System.out.println("Stack Underflow ");
        }
    }
    public static void main(String[] args) {
        J3 s = new J3(6);
        s.push1(10);
        s.push1(20);
        s.push1(30);
        s.pop1();
        s.push2(40);
        s.push2(50);
        s.push2(60);
        s.pop2();
        s.pop2();
    }
}
*/




/*Q6 Best time to buy and sell stock with Example in Java

public class J3 {
    public static void main(String[] args) {
        int[] arr = {10,20,3,40,50};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]-min>max) {
                max = arr[i]-min;
            }
        }
        System.out.println("Max Profit that we can get is: "+max);
    }
}
*/


/*Q7 How to insert element in an array at specific position in java. 2methods

//import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
    public static void main(String[] args) throws Exception{
        int[] arr = new int[5];
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++) {
            arr[i]= Integer.parseInt(bf.readLine());
        }
        System.out.println("Printing elements before insert: ");
        for(int i: arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Enter the location at where you want to insert: ");
        int location = Integer.parseInt(bf.readLine());
        System.out.println("Enter the value at where you want to insert: ");
        int value = Integer.parseInt(bf.readLine());
        for(int i=arr.length-1; i>location;i--) {
            arr[i] = arr[i-1];
        }
        arr[location] = value;
        for(int i: arr) {
            System.out.print(i+" ");
        }


//        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(10);
//        ar.add(20);
//        ar.add(30);
//        ar.add(40);
//        ar.add(50);
//        System.out.println(ar);
//        ar.add(2,34);
//        System.out.println(ar);
    }
}
*/


/*Q8 Wap to reverse an array.

import java.util.ArrayList;
import java.util.Collections;

public class J3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(10);
        ar.add(20);
        ar.add(30);
        ar.add(40);
        ar.add(50);
        System.out.println(ar);
        Collections.reverse(ar);
        System.out.println(ar);
    }
}
*/


/*Q9 WAP to check given String is well formed or not?

import java.util.Scanner;
import java.util.Stack;

public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length(); i++) {
            char ch = str.charAt(i);
            if(st.empty()) {
                st.push(ch);
            }
            else if(ch=='{' || ch=='(' || ch=='[') {
                st.push(ch);
            }
            else if(ch=='}' && st.peek()=='{') {
                st.pop();
            }
            else if(ch==']' && st.peek()=='[') {
                st.pop();
            }
            else if(ch==')' && st.peek()=='(') {
                st.pop();
            }
        }
        if(st.empty()) {
            System.out.println("Given String is well formed");
        }
        else {
            System.out.println("Given string is not well formed");
        }
    }
}
*/


/*Q10 Write a java program to print the elements at even position?
public class J3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for(int i=2;i< arr.length;i=i+2) {
            System.out.println("Index= "+i);
            System.out.println("Value at the index= "+arr[i]);
        }
    }
}
*/


/*Q11 Write a java program to find largest of three numbers?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int num3 = sc.nextInt();
        System.out.println("The Largest Number is: ");
        if (num1>num2 && num1>num3) {
            System.out.println(num1);
        }
        else if(num2>num1 && num2>num3) {
            System.out.println(num2);
        }
        else if(num3>num1 && num3>num2) {
            System.out.println(num3);
        }
    }
}
*/


/* Q12 Write a java program to find sum of digits of a number ?
public class J3 {
    public static void main(String[] args) {
        int num = 123456789;
        int temp = 0 ;
        int sum = 0;
        while (temp<num) {
            temp = num%10;  //Extract last digit in an integer
            sum = sum + temp;
            num = num/10;
        }
        System.out.println("Sum of digits of a number: "+sum);
    }
}
*/


/* Q13 Write a java program to find first digit,last digit and sum of given number ?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int LastDigit = number%10;
        int firstDigit = number;
        while (firstDigit>=10) {
            firstDigit =number/10;
        }
        System.out.println("First digit is: "+firstDigit+" Last digit is: "+LastDigit);
        System.out.println("Sum of first nd Last digit is: "+(firstDigit+LastDigit));
    }
}

*/


/* Q14 Write a java program to check whether given number is perfect square or not?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for(int i=1; i<num; i++) {
            if(i*i==num)
            System.out.println("It's a square of "+i);
        }
    }
}
*/

/* Q15 How to sum two Strings in java?
public class J3 {
    public static void main(String[] args) {
        String str1 = "111";
        String str2 = "222";
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("Sum of two Strings is: "+sum);
    }
}
*/


/* Q16 Write a java program to print numbers from 1 to n using loops?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Numbers are :");
        for(int i=1;i<=num;i++) {
            System.out.print(" "+i);
        }
    }
}
*/


/* Q17 Write a java program to print n even numbers?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Even Numbers are :");
        for(int i=1;i<=num;i++) {
            int evenNumbers = 2*i;
            System.out.print(" "+evenNumbers);
        }
    }
}
*/


/* Q18 Java Program to find the first duplicate occurence in an array
public class J3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,7};
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    System.out.println("First Duplicate integer is: "+arr[j]);
                }
            }
        }
    }
}
*/


/* Q19 Java program to count digits in an Integer
public class ABC {
    public static void main(String[] args) {
        int number = 123456789;
        int count = 0;
        while(number!=0) {
            number = number/10;
            count++;
        }
        System.out.println(count);
    }
}
*/ 


/* Q20 WAP to count number of even and odd digits in a given integer?
public class J3 {
    public static void main(String[] args) {
        int number = 123456789;
        int evencount = 0;
        int oddcount = 0;
        while(number>0) {
            int remainder = number%10;
            if(remainder%2==0)
                evencount++;
            else
                oddcount++;
            number = number/10;
        }
        System.out.println("There are "+evencount+" Even numbers");
        System.out.println("There are "+oddcount+" Odd numbers");
    }
}
*/

 
/* Q21 Java calculator program using Switch case.
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        double num1, num2;
        double output = 0;
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter the Operation you want to perform:(+,-,*,/)");
        String opcode = sc.next();
        switch (opcode) {
            case "+" -> output = num1+num2;
            case "-" -> output = num1-num2;
            case "*" -> output = num1*num2;
            case "/" -> output = num1/num2;
            default -> System.out.println("You have entered a wrong Operator");
        }
        System.out.println(num1+opcode+num2+"="+output);
    }
}
*/



/* Q22 WAP to reverse a String in java using recursion.
public class J3 {
    public static String recursiveMethod(String str) {
        if(str==null || str.length()<=1) {
            return str;
        }
        return recursiveMethod(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Shivani";
        System.out.println(recursiveMethod(str));
    }
} 
*/



/* Q23 WAP to reverse words in String in java
public class J3 {
    public static void main(String[] args) {
        String s = "Shivani is a Beautiful Girl";
        String[] str = s.split(" ");
        for(int i= str.length-1; i>=0; i--) {
            System.out.print(" "+str[i]);
        }
    }
}
*/


/* Q24 How to read a matrix from console in java?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,c;
        System.out.println("Enter the No. of Rows");
        r = sc.nextInt();
        System.out.println("Enter the No. of Columns");
        c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Entering the Elements: ");
        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("Displaying the elements: ");
            for(i=0; i<r; i++) {
                for (int j=0; j<c; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
*/


/* Q25 How to remove the duplicates From String
import java.util.HashSet;
import java.util.Scanner;

public class J3 {
    public static String duplicates(String ab) {
        HashSet<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<ab.length(); i++) {
            Character ch = ab.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String st = sc.next();
        String ab = st.toLowerCase();
        System.out.println(duplicates(ab));
    }
}

*/


/* Q26  Bubble Sort in Java
public class ABC {
    private static void Bubblesort(int[] arr) {
        int temp;
        for(int i=0; i<arr.length; i++) {
            for(int j=1; j<arr.length-i; j++) {
                if(arr[j-1]>arr[j]) {
                    //Swap the elements
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,4,3};
        System.out.println("Before Sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        Bubblesort(arr);
        System.out.println();
        System.out.println("After Sorting: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }
}
*/


/* Q27  Palindrome Program
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String: ");
        String original = bf.readLine();
        String reverse = "";
        for(int i=original.length()-1; i>=0; i--) {
            reverse = reverse+original.charAt(i);
        }
        if(original.equals(reverse)) {
            System.out.println("String is a Palindrome");
        }
        else {
            System.out.println("String is not a Palindrome");
        }
    }
}
*/


/* Q28 WAP to print Floyd's Triangle
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int num=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of rows You want to Print: ");
        int n = sc.nextInt();
        System.out.println("Floyd's Number");
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
*/


/* Q29 WAP to count number of Vowels in java?
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter a String: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String n = a.toLowerCase();
        char[] ch = n.toCharArray();
        int count = 0;
        for (char c: ch) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> count++;
            }
        }
        System.out.println("Total Number of vowels are "+count);
    }
}
*/


/* Q30 Find smallest and the largest number in An Array
public class J3 {
    public static void main(String[] args) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i : arr) {
            if (i > largest) {
                largest = i;
            }
        }
        System.out.println("Largest Number is: "+largest);
        for (int i : arr) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.println("Smallest Number is: "+smallest);
    }
}

*/


/* Q31 WAP to find duplicate elements in array
import java.util.HashSet;

public class J3 {
    public static void main(String[] args) {
        String[] str = {"Java","PC","Mobile","Java","PC"};
        HashSet<String> Nonduplicates = new HashSet<>();
        HashSet<String> duplicates = new HashSet<>();
        for(int i=0; i< str.length; i++) {
            if(!Nonduplicates.contains(str[i])) {
                Nonduplicates.add(str[i]);
            }
            else {
                duplicates.add(str[i]);
            }
        }
        System.out.println(duplicates);
    }
}
*/


/* Q32 WAP to check the input number is prime or not
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println("Enter a number to check whether it is prime or not: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=2; i<number; i++) {
            if (number%i==0) {
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println("Its a Prime Number");
        }
        else  {
            System.out.println("Its not a Prime Number");
        }
    }
}

*/

/* Q33 WAP to print pyramid pattern of numbers
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Number of rows You want to Print: ");
        int num = sc.nextInt();
        System.out.println("Pattern is: ");
        for(int i=num; i>0; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
*/

/* Q34 WAP to find missing number in array
import java.util.Arrays;

public class J3 {
    private static int getMissingNumber(int[] arr,int n) {
        int ActualSum = 0;
        int ExpectedSum = n*(n+1)/2;
        for(int i=0; i< arr.length; i++) {
            ActualSum = ActualSum+arr[i];
        }
        return ExpectedSum-ActualSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        int missingnumber = getMissingNumber(arr,6);
        System.out.printf("Missing number in an Array is %s is %d", Arrays.toString(arr),missingnumber);
        }
}

*/


/* Q35 WAP  to print numbers in java up to 10 without using loops
public class J3 {
    public static void PrintNumbers(int n){
        if(n<=10) {
            System.out.println(n);
            PrintNumbers(n+1);        //By Recursion
        }
    }
    public static void main(String[] args) {
        PrintNumbers(1);
    }
}
*/


/* Q36 WAP to sort elements in array in asc and desc order using Arrays.sort method
import java.util.Arrays;
import java.util.Collections;

public class J3 {
    public static void main(String[] args) {
        String[] arr = {"4","3","5","1","2"};
        System.out.println("Before Sorting");
        for(String array: arr) {
            System.out.print(" "+array);
        }
        System.out.println();
        System.out.println("Sorting in Ascending Order: ");
        Arrays.sort(arr);  //by Default, it sorts array in ascending order
        for(String array: arr) {
            System.out.print(" "+array);
        }
        System.out.println();
        System.out.println("Sorting in Descending Order: ");
        Arrays.sort(arr, Collections.reverseOrder());  // Comparator cannot be Applied to int 
        for(String array: arr) {
            System.out.print(" "+array);
        }
    }
}
*/


/* Q37 WAP to find factorial of a given Number
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int number=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number whose factorial you want to find: ");
        int num = sc.nextInt();
        for(int i=1; i<=num; i++) {
            number = number*i;
        }
        System.out.println("Factorial of "+num+" is "+number);
    }
}
*/


/* Q38 WAP to find second Largest Number in An Array
import java.util.Arrays;

public class J3 {
    public static void main(String[] args) {
        int [] array = {13,20,37,41,5,90,43,17,25,89};
        System.out.println("Given Array is: ");
        for(int i: array) {
            System.out.print(" "+i);
        }
        Arrays.sort(array);
        System.out.println();
        System.out.println("After Sorting in Ascending Order: ");
        for(int i: array) {
            System.out.print(" "+i);
        }
        System.out.println();
        System.out.println("Second Largest Number is: ");
            System.out.println(array[array.length-2]);
    }
}
*/


/* Q39 WAP to check whether both strings are panagram or not
import java.util.Arrays;
import java.util.Scanner;

public class J3 {
    public static boolean AnagramCheck(String str1,String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        return Arrays.equals(string1,string2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the Second String: ");
        String str2 = sc.nextLine();
        System.out.println("Both strings are Anagram "+AnagramCheck(str1,str2));
    }
}

*/


/* Q40 WAP to print Characters count in each word in String
public class J3 {
    static void count(String str) {
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++) {
            String s = "";
            // when there is no space
            while(i< ch.length && ch[i]!=' ') {
                s = s+ch[i];
                i++;
            }
            if(s.length()>0) {
                System.out.println(s+" -> "+s.length());
            }
        }
    }
    public static void main(String[] args) {
        String str = "Hello World my Name is Abhishek";
        count(str);
    }
}
*/


/* Q41 WAP to reverse a string
public class J3 {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Given string is \n"+str);
        System.out.println("Reverse string is: ");
        char[] str1 = str.toCharArray();
        for(int i=str1.length-1;i>=0;i--) {
            System.out.print(str1[i]);
        }
    }
}

*/


/* Q42 WAP to add elements of the array
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0;
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements in an array: ");
        for(int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Sum of the elements is: ");
        for(int i: array) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

*/



/* Q43 WAP to print the largest number
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y && x>z) {
            System.out.println("Largest number is: "+x);
        }
        else if(y>x && y>z) {
            System.out.println("Largest number is: "+y);
        }
        else if(z>x && z>y) {
            System.out.println("Largest number is: "+z);
        }
    }
}
*/


/* Q44 WAP to print the table of any number 
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose table you want to print: ");
        int number = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.printf("%d X %d = %d\n",number,i,number*i);
        }
    }
}

*/



/* Q45 WAP to print pattern like this
*****
*****
*****
*****
*****

public class J3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

 
/* Q46 WAP to find factors of number from 1 to 100
public class J3 {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++) {
            System.out.println("The factors of "+i+" are: ");
            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    System.out.println(" "+j);
                }
            }
        }
    }
}

*/



/* Q47 WAP to print fibonnacci series
public class J3 {
    public static void main(String[] args) {
       int max = 10;
       int num1 = 0;
       int num2 = 1;
       for(int i=1; i<=max; i++) {
           System.out.print(num1+" ");
           int sum = num1 + num2;
           num1 = num2;
           num2 = sum;
       }
   //method2
 int count = 10;
          int[] fib = new int[count];
          fib[0] = 0;
          fib[1] = 1;
          for(int i=2; i<count; i++) {
              fib[i] = fib[i-1]+fib[i-2];
          }
          for(int i: fib) {
              System.out.println(i);
          }
    }
}

*/


/* Q48 WAP to print Ascii values of a Character 
public class J3 {
    public static void main(String[] args) {
           //    method 1
//        for(int i=65; i<=90; i++) {
//            System.out.println("The ASCII value of "+(char)i+"  =  "+i);
//        }


          //     method 2 by typecasting
//        char ch1 = 'a';
//        char ch2 = 'b';
////casting or converting a charter into int type
//        int ascii1 = (int) ch1;
//        int ascii2 = (int) ch2;
//        System.out.println("The ASCII value of " + ch1 + " is: " + ascii1);
//        System.out.println("The ASCII value of " + ch2 + " is: " + ascii2);


           // method 3 by Assigning a Variable to the int Variable
        char c1 = 'A';
        char c2 = 'B';
        int ascii1 = c1;
        int ascii2 = c2;
        System.out.println("The ASCII value of "+c1+" is: "+ascii1);
        System.out.println("The ASCII value of "+c2+" is: "+ascii2);
    }
}
*/


/* Q49 WAP to sort characters in String
import java.util.Arrays;

public class ABC {
    public static void main(String[] args) {
      String str = "LAPTOP";
      char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println("Sorted string is: "+Arrays.toString(ch));
        System.out.print(ch);
    }
}

*/


/* Q50 WAP to sort HashMap keys in Java
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class J3 {
    public static void main(String[] args) {
        Map<String,String> UnsortedMap = new HashMap<>();
        UnsortedMap.put("One","Aai");
        UnsortedMap.put("Two","Love");
        UnsortedMap.put("Three","You");
        UnsortedMap.put("Four","Shivani");
        System.out.println("Unsorted Map: ");
        for(Map.Entry<String,String> entry: UnsortedMap.entrySet()) {
            System.out.println(entry.getKey());
        }
        Map<String,String> treeMap = new TreeMap<>(UnsortedMap);
        System.out.println();
        System.out.println("Sorted Map: ");
        for(Map.Entry<String,String> entry: treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

*/


/* Q51 WAP to find factorial for large number?
import java.math.BigInteger;

public class J3 {
    public static void main(String[] args) {
        int number = 20;
        BigInteger factorial = BigInteger.ONE;
        for(int i=1; i<=number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}

*/


/* Q52 WAP to print whether number is even or odd
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
            if(num%2==0) {
                System.out.println("It is an even Number");
            }
            else {
                System.out.println("It is an odd Number");
            }
    }
}
*/


/* Q53 WAP to Swap two numbers without using third variable
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Before Swapping:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a= "+a+" b= "+b);
        System.out.println("After Swapping:");
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a= "+a+" b= "+b);
    }
}
*/

/* Q54 WAP  to convert Fahrenheit to celsius
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit to convert it into Celsius: ");
        float temp = sc.nextFloat();
        temp = ((temp-32)*5)/9;
        System.out.println("Temperature in Celsius is: "+temp);
    }
}
*/


/* Q55 WAP to find reverse of a number in java
public class J3 {
    public static void main(String[] args) {
       int number = 123;
       String numberString = String.valueOf(number);
       String reverse = "";
       for(int i=numberString.length()-1; i>=0; i--) {
           reverse = reverse + numberString.charAt(i);
       }
        System.out.println("Reverse String is: "+reverse);
    }
}

*/



/* Q56 WAP to print Alphabets 
public class J3 {
    public static void main(String[] args) {
       for(char ch='a'; ch<='z'; ch++) {
        System.out.print(" "+ch);
       }
    }
}
*/


/* Q57 WAP to check given input character is alphabet or not
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter an Alphabet: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);  // for 1st character that's why we put 0
        if(ch>='a' && ch<='z'  ||  ch>='A' && ch<='Z') {
            System.out.println("The Given Character is an Alphabet");
        }
        else {
            System.out.println("The Given Character is not an Alphabet");
        }
    }
}
*/


/* Q58 WAP to reverse the order of elements in arraylist.
import java.util.ArrayList;
import java.util.Collections;

public class J3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.add(9);
        System.out.println("Before Reversing : "+ar);
        Collections.reverse(ar);
        System.out.println("After Reversing : "+ar);
    }
}

*/


/* Q59 WAP to swap elements in list
import java.util.ArrayList;
import java.util.Collections;

public class J3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(2);
        ar.add(4);
        ar.add(6);
        ar.add(9);
        System.out.println("Before Swapping : "+ar);
        Collections.swap(ar,1,2);                   // swap index 1 and 2
        Collections.swap(ar,0,3);                   // swap index 0 and 3
        System.out.println("After Swapping : "+ar);
    }
}
*/


/* Q60 WAP to check whether array contains duplicates
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class J3 {
    public static void main(String[] args) {
        String[] str = {"java","C++","Python"};
        List duplicatesList = Arrays.asList(str); //converting String to ArrayList
        Set duplicatesSet = new HashSet<>(duplicatesList); //set doesn't contains duplicates
        //since set doesn't contains duplicates so size of List And set will not be equal
        if(duplicatesSet.size()!=duplicatesList.size()) { 
            System.out.println("it contains duplicates");
        }
        else {
            System.out.println("It doesn't contain duplicates");
        }
    }
}
*/


/* Q61 WAP  to check whether a given number is even or odd without using modulus operator
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number: ");
        int number = Integer.parseInt(bf.readLine());
        if((number/2)*2==number) {
            System.out.println("it is an even number");
        }
        else {
            System.out.println("it is an Odd Number");
        }
    }
}
*/


/* Q62 WAP to calculate area of Rectangle by creating a method
import java.util.Scanner;

public class J3 {
    public static void RectangleArea(int length, int breadth) {
        System.out.println("Area of Rectangle is: "+length*breadth);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a Rectangle");
        int length = sc.nextInt();
        System.out.println("Enter Breadth of the Rectangle");
        int breadth = sc.nextInt();
        RectangleArea(length,breadth);
    }
}
*/


/* Q63 WAP to find factorial of a number by recursion
public class J3 {
    public static int factorial(int number) {
        if(number==0){
            return 1;
        }
        return number * factorial(number-1); //5 x factorial of 4
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
*/


/* Q64 WAP to calculate area and circumference of a circle
public class J3 {
    public static void Circle(int radius) {
        double area = Math.PI*radius*radius;
        double Circumference = 2*Math.PI*radius;
        System.out.println("Area of Circle is: "+area);
        System.out.println("Circumference of Circle is: "+Circumference);
    }
    public static void main(String[] args) {
      Circle(4);
    }
}
*/


/* Q65 WAP to find whether a year is a Leap Year or not
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year: ");
        int Year = sc.nextInt();
        if(Year%4==0) {
            System.out.println("It is a Leap Year");
        }
        else {
            System.out.println("It is not a Leap Year");
        }
    }
}
*/


/* Q66 WAP to find first non repeated character in String
import java.util.HashMap;
import java.util.Map;

public class J3 {
    public static char getFirstNonRepeatedChar(String str) {
        Map<Character,Integer> countMap = new HashMap<>(str.length());
        //Converted String to char Array
        for(char ch: str.toCharArray()) {
            // if countMap contains key then increment it by 1 pr else count character as value 1
            countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch)+1 : 1);
        }
        // Now iterating countMap
        for(Map.Entry<Character,Integer> entry: countMap.entrySet()) {
            // if it found first nonRepeated character as value 1 it returns it
            if (entry.getValue()==1)  {
                return entry.getKey();
            }
        }
        // if string did not contain any nonRepeated character it throws Exception
        throw new RuntimeException("Didn't found any NonRepeated character");
    }
    public static void main(String[] args) {
        char ch = getFirstNonRepeatedChar("aabbccdef");
        System.out.println("First Non Repeated char is: "+ch);
    }
}
*/


/* Q67 WAP to add,multiply and average of numbers
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int choice;
        int sum = 0;
        int mul = 1;
        System.out.print("1-Sum\t2-Average\t3-Multiplication\n");
        System.out.println("Enter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.println("Enter Numbers(Separate with commas ):");
        String Outnumber = sc.next();
        String[] number = Outnumber.split(",");
        for(int i=0; i<number.length; i++) {
            sum = sum + Integer.parseInt(number[i]);
        }
        switch (choice) {
            case 1 -> System.out.println("sum is: " + sum);
            case 2 -> System.out.println("Average is: " + sum / number.length);
            case 3 -> {
                for (String str : number) {
                    mul = mul * Integer.parseInt(str);
                }
                System.out.println("Multiply " + mul);
            }
        }
    }
}
*/


/* Q68 WAP to delete element from array
import java.util.Arrays;
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int[] FirstArray = {1,2,3,4,5};
        System.out.println("Original Array is: "+ Arrays.toString(FirstArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to remove: ");
        int element = sc.nextInt();
        int[] SecondArray = new int[FirstArray.length-1];
        for(int i=0,k=0; i<FirstArray.length; i++) {
            if(FirstArray[i]==element) {
                continue;
            }
            SecondArray[k++]=FirstArray[i];
        }
        System.out.println("NewArray is: "+Arrays.toString(SecondArray));
    }
}
*/


/* Q69 WAP to split a String
public class J3 {
    public static void main(String[] args) {
        String str1 = "091-987643246";
        String[] str2 = str1.split("-");
        for(String str3: str2) {
            System.out.print(" "+str3);
        }
    }
}
*/


/* Q70 WAP to show how to iterate in HashMap
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class J3 {
    public static void main(String[] args) {
        Map<Integer,String> FruitMap = new HashMap<>();
        FruitMap.put(1,"Apple");
        FruitMap.put(2,"Banana");
        FruitMap.put(3,"Orange");
        FruitMap.put(4,"Guava");
        Iterator<Map.Entry<Integer,String>> itr = FruitMap.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer,String> entry = itr.next();
            System.out.println("Key= "+entry.getKey());
            System.out.println("Value= "+entry.getValue());
        }
    }
}
*/


/* Q71 WAP to compare two Strings in java without using built in functions
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings you want to Compare: ");
        String str1 = sc.next();
        String str2 = sc.next();
        boolean isCompare = false;
        for(int i=0; i<str1.length(); i++) {
            if(str1.charAt(i)!=str2.charAt(i)) {
                isCompare = false;
                break;
            }
            isCompare = true;
        }
        System.out.println("Both Strings are Equal= "+isCompare);
    }
}

*/


/* Q72 WAP to check whether an element is present in atleast two arrays out of 3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class J3 {
    public static void main(String[] args) {
        Integer [] arr1 = {1,2,3,9,8,7};
        Integer [] arr2 = {4,1,2,10,15};
        Integer [] arr3 = {5,1,2,4,10};
        HashSet<Integer> h = new HashSet<>(); 
        List<Integer> list1 = Arrays.asList(arr1);
        List<Integer> list2 = Arrays.asList(arr2);
        List<Integer> list3 = Arrays.asList(arr3);
        h.addAll(list1);
        h.addAll(list2);
        h.addAll(list3);
        // we store final elements which are in at least two in (finalList) 
        List<Integer> finalList = new ArrayList<>(); 
        for(Integer number: h) {
            // condition for number which is present in at least 2 arrays
            if(list1.contains(number) && list2.contains(number) ||
                    list2.contains(number) && list3.contains(number) ||
                    list3.contains(number) && list1.contains(number)) {
                finalList.add(number); // add number to finalist which are in 2Arrays
            }
        }
        System.out.println("They exists in at least two Arrays "+finalList);
    }
}
*/


/* Q73 WAP to find prime or not
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        boolean flag = false;
        for(int i=2; i<=number/2; i++) {
            if (number % i == 0) {
                flag = true;
                break;
            }
        }
        if(!flag) {
            System.out.println("It is a Prime Number ");
        }
        else {
            System.out.println("It is not a Prime Number ");
        }
    }
}
*/


/* Q74 WAP to check whether given number is positive or not
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0) {
            System.out.println("It is a Positive Number");
        }
        else {
            System.out.println("It is a Negative Number");
        }
    }
}
*/


/* Q75 WAP to reverse digits in number 
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0;
        while(num!=0) {
            int digit = num%10;
            reverse = reverse*10 + digit;
            num = num/10;
        }
        System.out.println("Reverse is: "+reverse);
    }
}
*/


/* Q76 WAP to find difference between two dates
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class J3 {
    public static void main(String[] args) {
        LocalDateTime d1 = LocalDateTime.of(2018,12,27,12,13,32);
        LocalDateTime d2 = LocalDateTime.of(2020,12,27,11,23,32);
        Duration duration = Duration.between(d1,d2);
        System.out.println(duration.getSeconds());

        LocalDate d3 = LocalDate.of(2015,12,29);
        LocalDate d4 = LocalDate.of(2018,2,14);
        Period period = Period.between(d3,d4);
        System.out.println("No. of Days= "+period.getDays());
        System.out.println("No. of Years= "+period.getYears());
        System.out.println("No. of Months= "+period.getMonths());
    }
}
*/


/* Q77 WAP to print even length words in a String
public class J3 {
    public static void main(String[] args) {
       String str = "My Name is James Anderson";
       for(String s : str.split(" ")) {
           if (s.length() % 2 == 0) {
               System.out.print(" "+s);
           }
       }
    }
}
*/


/* Q78 WAP to left rotate array by one position
public class ABC {
    public static void main(String[] args) {
      int[] array = {10,20,30,40,50};
      // Store the first element in the temp
        int temp = array[0];
        for(int i=1;i<array.length; i++) {
            array[i-1] = array[i];
        }
        // Storing the temp value in the final Position
        array[array.length-1] = temp;
        for (int i: array) {
            System.out.print(" "+i);
        }
    }
}
*/


/* Q79 WAP to move all negative numbers to the start of array and positive numbers to end
public class J3 {
    public static void main(String[] args) {
      int[] array = {-1,-20,30,40,50,-8};
      int[] NewArray = new int[array.length];
      rearrange(array,NewArray);
      print(NewArray);
    }

    private static void print(int[] newArray) {
        for(int i: newArray) {
            System.out.print(" "+i);
        }
    }

    private static void rearrange(int[] array, int[] newArray) {
        int j=0;
        for(int i=0; i<array.length; i++) {
            if (array[i] < 0) {
                newArray[j] = array[i];
                j++;
            }
        }
            for(int i=0; i<array.length; i++) {
                if(array[i]>0) {
                    newArray[j]=array[i];
                    j++;
                }
        }
    }
}
*/


/* Q80 WAP to move all zeroes to end of array
public class J3 {
    public static void main(String[] args) {
      int[] array = {0,0,30,40,0,14};
      int[] NewArray = new int[array.length];
      rearrange(array,NewArray);
      print(NewArray);
    }

    private static void print(int[] newArray) {
        for(int i: newArray) {
            System.out.print(" "+i);
        }
    }

    private static void rearrange(int[] array, int[] newArray) {
        int j=0;
            for(int i=0; i<array.length; i++) {
                if(array[i]>0) {
                    newArray[j]=array[i];
                    j++;
                }
            }
            for(int i=0; i<array.length; i++) {
            if (array[i] <= 0) {
                newArray[j] = array[i];
                j++;
            }
        }
    }
}
*/


/* Q81 WAP to find maximum and minimum number in an array
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int max,min;
        System.out.println("Enter the Size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the Elements");
        int[] array = new int[number];
        for(int i=0; i<array.length; i++) {
            array[i]= sc.nextInt();
        }
        max=array[0];
        min=array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        for(int i=0; i<array.length; i++) {
            if (array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("Maximum Element is: "+max);
        System.out.println("Minimum Element is: "+min);
    }
}
*/


/* Q82 WAP to find out maximum difference between elements in array
import java.util.Scanner;

public class J3 {
    public static void main(String[] args) {
        int max,min;
        int Difference = 0;
        System.out.println("Enter the Size of the Array: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the Elements");
        int[] array = new int[number];
        for(int i=0; i<array.length; i++) {
            array[i]= sc.nextInt();
        }
        max=array[0];
        min=array[0];
        for(int i=0; i<array.length; i++) {
            if(array[i]>max) {
                max=array[i];
            }
        }
        for(int i=0; i<array.length; i++) {
            if (array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("Maximum Element is: "+max);
        System.out.println("Minimum Element is: "+min);
        Difference = Difference+(max-min);
        System.out.println("Maximum Difference is: "+Difference);
    }
}
*/


/* Q83 WAP to perform Binary Search
public class J3 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        int searchElement = 10;
        int index = binarySearch(array,0,array.length-1,searchElement);
        System.out.println("Element found at the index "+index);
    }

    private static int binarySearch(int[] array, int low, int high, int searchElement) {
        if(high>=low) {
            int mid = low + (high-low)/2;
            if(array[mid]==searchElement) {
                return mid;
            }
            if(searchElement>array[mid]) {
                // Search the Element in Right side of the Array
                return binarySearch(array,mid+1,high,searchElement);
            }
            if(searchElement<array[mid]) {
                // Search the Element in Left side of the Array
                return binarySearch(array,low,mid-1,searchElement);
            }
        }
        return -1;
    }
}
*/


/* Q84 WAP to find duplicate elements in an array?
import java.util.HashSet;
import java.util.Set;

public class J3 {
    public static void main(String[] args) {
      int[] array = {10,20,30,40,20,40,10};
      brutualForce(array);
      extraMemory(array);
    }

    private static void extraMemory(int[] array) {
        Set<Integer> set = new HashSet<>();
        System.out.println();
        for(int i=0; i<array.length; i++) {
            if(set.contains(array[i])) {
                System.out.println("Duplicate element is: "+array[i]);
            }
            else {
                set.add(array[i]);
            }
        }
    }
    private static void brutualForce(int[] array) {
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==array[j]) {
                    System.out.println("Duplicate element is: "+array[i]);
                }
            }
        }
    }
}
*/


/* Q85 WAP: Java Two Sum Problem : Find Pair with given sum in an array
public class J3 {
    public static void main(String[] args) {
      int[] array = {10,20,30,40,50};
      int sum = 50;
       for(int i=0; i<array.length; i++) {
          for (int j=i+1; j<array.length; j++) {
              if(array[j]==sum-array[i]) {
                  System.out.println(array[i]+","+array[j]);
              }
          }
       }
    }
}
*/


/* Q86 WAP to find duplicate number in an Array
public class J3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,6,8,1,6};
        for(int i=0; i<array.length; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i]==array[j]) {
                    System.out.println("Duplicate element in an Array is: "+array[j]);
                }
            }
        }
    }
}
*/


/* Q87 WAP to find majority element in an array
import java.util.HashMap;
import java.util.Map;

public class J3 {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] array = {10,20,20,10,20,20};
        for(int i=0; i<array.length; i++) {
        // put key in the map and if key is present add +1 to value
            map.put(array[i], map.getOrDefault(array[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(entry.getValue()> array.length/2) {   //if value is greater than half of array length
                int result = entry.getKey();
                System.out.println(result);
            }
        }
    }
}
*/


/* Q88 WAP to reverse elements in an Array by using Stack
import java.util.Arrays;
import java.util.Stack;

public class J3 {
    public static void main(String[] args) {
        Stack st = new Stack();
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(array));
        for(int i=0; i<array.length; i++) {
            st.push(array[i]);
        }
        for(int i=0; i<array.length; i++) {
            array[i]= (int) st.pop();
        }
        for (int i : array) {
            System.out.print(" "+i);
        }
    }
}
*/


/* Q89 WAP to find next greater element in array in java
//we have to find next greatest element 
public class J3 {
       public static void main(String[] args){
            int[] array = {10,11,5,4,7};
            for(int i=0; i<array.length; i++) {
                int next = -1;     // initially next is assigned with -1
                for (int j = i + 1; j<array.length; j++) {
                    if (array[j]>array[i]) {
                        next = array[j];      //if value at arr[j] is greater than arr[i] then assigned it to next 
                        break;
                    }
                }
                System.out.println(array[i]+","+next);
            }
       }
}
*/


/* Q90 WAP to reverse words in String

import java.util.Stack;

public class J3 {
       static void reverseStrings(String str) {
              Stack<Character> st = new Stack<>();
              for(int i=0; i<str.length(); i++) {
                     if(str.charAt(i)!=' ') { //if char at i index is not equal to space until then push the element
                            st.push(str.charAt(i));
                     }
                     else {
                            while(st.empty()==false) { //
                                   System.out.print(st.pop());
                            }
                     }
              }
              System.out.print(" ");
              while(st.empty()==false) {
                     System.out.print(st.pop());
              }
       }
       public static void main(String[] args){
              reverseStrings("Hello World"); //calling the method
       }
}
*/


/* Q91 WAP to square a sorted array of Positive and Negative Numbers
public class J3 {
       public static void main(String[] args){
              int[] array = {-6,-1,2,4,5};
              int[] squareArray = squareSortedarray(array);
              for (int i=0; i< squareArray.length; i++) {
                     System.out.print(squareArray[i]+" ");
              }
       }

       private static int[] squareSortedarray(int[] array) {
              int[] squareArray = new int[array.length];
              int start = 0;
              int end = array.length-1;
              int squareIndexArray = array.length-1;
              while(start<=end) {
                     if(array[start]*array[start]>array[end]*array[end]) {
                            squareArray[squareIndexArray--] = array[start]*array[start];
                            start++;
                     }
                     else {
                            squareArray[squareIndexArray--] = array[end]*array[end];
                            end--;
                     }
              }
              return squareArray;
       }
}
*/



/* Q92 WAP to print number of vowels,Words & frequency of each character in a String
import java.util.Map;
import java.util.TreeMap;

public class J3 {

       private void getWord_vowelCount(String str) {
              int VowelCount = 0;
              int WordCount = 0;
              int UpperCaseCount = 0;
              for(int i=0; i<str.length(); i++) {
                     char c = str.charAt(i);
                     switch (c) {   // if there is a space and full-stop word count increment to +1
                            case ' ':
                            case '.':
                                   WordCount++;
                     }
                     switch (c) {
                            case 'A':
                            case 'E':
                            case 'I':
                            case 'O':
                            case 'U':
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                   VowelCount++;
                     }
                     if(c>=65 && c<=90) {  //as per ASCII value between 65 and 90 it is uppercase letters
                            UpperCaseCount++;
                     }
              }
              System.out.println("WordCount= "+WordCount);
              System.out.println("VowelCount= "+VowelCount);
              System.out.println("UpperCaseCount= "+UpperCaseCount);
       }

       private void getFrequency(String str) {
              TreeMap<Character,Integer> map = new TreeMap<>();
              for(int i=0; i<str.length(); i++) {
                     Integer count = map.get(str.charAt(i));
                     if(map.get(str.charAt(i))==null) { //if char is not present in the map
                            map.put(str.charAt(i),1);
                     }
                     else {
                            map.put(str.charAt(i),++count);   //if char is present then count++
                     }
                     for(Map.Entry<Character,Integer> entry: map.entrySet()) {
                            System.out.println("Character "+entry.getKey()+" Frequency "+entry.getValue());
                     }
              }
       }
       public static void main(String[] args){
              String str = "This Boy is good in Studies.";
              ABC p = new ABC();
              p.getWord_vowelCount(str);
              p.getFrequency(str);
       }
}
*/


/* Q93 WAP to print all substrings for a String
public class J3 {
       public static void main(String[] args){
              String str = "abcd";
              for(int i=0; i<str.length(); i++) {
                     for(int j=i+1; j<=str.length(); j++) {
                            System.out.println(str.substring(i,j));
                     }
              }
       }
}
*/


/* Q94 WAP to check both Strings are rotation of each other
public class J3 {
       public static void main(String[] args){
              System.out.println(isRotated("abcd","bcda"));
       }
       public static boolean isRotated(String str, String rotated_str) {
              if (str==null || rotated_str==null) { //whether any of the string is empty
                     return false;
              }
              else if(str.length()!=rotated_str.length()) { // if lengths of both strings are equal
                     return false;
              }
              else {
                     String concatenated = str + str; // concatenated string
                     return concatenated.contains(rotated_str); //if concatenated string contains rotated string letters
              }
       }
}
*/


/* Q95 WAP to print characters in descending order of frequency
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class J3 {
       public static void main(String[] args){
              String str = "Banana";
              HashMap<Character,Integer> map = new HashMap<>();
              for(int i=0; i<str.length(); i++) {
                     char ch = str.charAt(i);
                     Integer value = map.get(ch);
                     if(value!=null) {
                            map.put(ch,value+1);
                     }
                     else {
                            map.put(ch,1);
                     }
              }
              Set<Map.Entry<Character,Integer>> set = map.entrySet();
              List<Map.Entry<Character,Integer>> list = new ArrayList<>(set);
              list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
              for(Map.Entry<Character,Integer> entry: list) {
                     System.out.println("The frequency of occurrence of "+entry.getKey()+" is "+entry.getValue());
              }
       }
}
*/


/* Q96 WAP to print number of vowels and consonants in String
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
       public static void main(String[] args) throws Exception {
              System.out.println("Enter a String to check vowels nd consonants");
              BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
              String str = bf.readLine();
              isVowels(str);
       }

       private static void isVowels(String str) {
              int vowel_Count = 0;
              int consonant_Count = 0;
              for(int i=0; i<str.length(); i++) {
                     if(isVowels(str.charAt(i))) {
                            ++vowel_Count;
                     }
                     else {
                            ++consonant_Count;
                     }
              }
              System.out.println("vowel_Count= "+vowel_Count);
              System.out.println("consonant_Count= "+consonant_Count);
       }

       private static boolean isVowels(char ch) {
              ch = Character.toUpperCase(ch);
              return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
       }
}
*/


/* Q97 WAP to get first letter of each word in String
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J3 {
       public static void main(String[] args) throws Exception{
              System.out.println("Enter a string:");
              BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
              String str = bf.readLine();
              splitWords(str);
       }

       private static void splitWords(String str) {
              String[] words = str.split(" ");
              for(int i=0; i<words.length; i++) {
                     String s = words[i];
                     System.out.println(s.charAt(0));
              }
       }
}
*/


/* Q98 Given a String = "aaabbbccc".Compress it to = "a3b3c3".
Given that the output string length is always smaller then input string.No extra Space.

import java.util.LinkedHashMap;
import java.util.Map;

public class J3 {
       public static void main(String[] args) {
              String str = "aaabbbccc";
              Map<Character,Integer> map = new LinkedHashMap<>();
              for(int i=0; i<str.length(); i++) {
                     if(map.get(str.charAt(i))!=null) {
                            map.put(str.charAt(i),map.get(str.charAt(i))+1);
                     }
                     else {
                            map.put(str.charAt(i),1);
                     }
              }
              StringBuilder sb = new StringBuilder();
              for(Map.Entry<Character,Integer> entry: map.entrySet()) {
                     sb.append(entry.getKey());
                     sb.append(entry.getValue());
              }
              System.out.println(sb);
       }
}
*/


/* Q99 WAP to sort names in an array
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class J3 {
       public static void main(String[] args) throws Exception {
              BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
              System.out.println("Enter the number of names you want to sort: ");
              int number = Integer.parseInt(bf.readLine());
              String[] array = new String[number];
              System.out.println("Enter the names : ");
              for(int i=0; i<number; i++) {
                     array[i] = bf.readLine();
              }
              Arrays.sort(array);
              System.out.println("Sorted Array is: ");
              System.out.print(" "+Arrays.toString(array));
       }
}
*/


/* WAP 
*/
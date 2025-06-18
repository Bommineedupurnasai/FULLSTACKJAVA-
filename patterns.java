//square pattern
import java.util.Scanner;
public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
//number pattern
import java.util.Scanner;
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
//NumberPattern1
public class NumberPattern1{
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
//numberpattern2
public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
//NumberPattern3
public class NumberPattern3 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(number + " ");
                number++;
                if (number > 9) {
                    number = 1;
                }
            }
            System.out.println();
        }
    }
}
//NumberPattern4
public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(number + "\t");
                number += 2;
            }
            System.out.println();
        }
    }
}
//numberpattern5
public class NumberPattern5 {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) { 
                   if (j % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); 
        }
    }
}
//starpattern1
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//pattern2
class Pattern2{
public static void main(String[]args){
for(int i=1;i<=5;i++){
for(int j=1;j<=5-i;j++){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print((2*k) + " ");
}
System.out.println();
}
}
}
//pattern3
class Pattern3{
public static void main(String[]args){
String str="INDIA";
for(int i=1;i<=str.length();i++){
System.out.println(str.substring(0,i));
}
}
}
//pattern4
class Pattern4{
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
//pattern5
class Pattern5 {
    public static void main(String[] args) {
        int n = 4;
for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//pattern6
 class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            System.out.print("*");
           if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
             System.out.print("*");
            if (i != 0) {
                for (int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//pattern7
class Pattern7 {
public static void main(String[] args) {
int n = 5; 
 for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
 if (i == 1 || i == n || j == 1 || j == n)
System.out.print("* ");
 else
 System.out.print("  ");
}
System.out.println();
}
}
}
//pattern8
class Pattern8{
public static void main(String[] args) {
 int n = 7;
 int mid = n / 2;
 for (int i = 0; i < n; i++) {    
  for (int j = 0; j < n; j++) {       
  if (i == mid || j == mid) {
  System.out.print("*");
  } else {
 System.out.print(" ");
 }
 }
System.out.println();             
 }
}
}
//pattern9
class Pattern9
{
 public static void main(String[] args) 
{
 int n = 7;
 for (int i = 1; i <= n; i++)
 {
 for (int j = 1; j <= n; j++)
{
 if (j == i || j == n - i + 1)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
 }
}
}
//pattern10
 class Patterns {
public static void main(String[] args) {
int n = 7; 
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++) {
if (i == 1 || i == n || i == (n + 1) / 2 ||
j == 1 || j == n || j == (n + 1) / 2)
System.out.print("* ");
else
System.out.print("  ");
}
System.out.println();
}
}
}
//pattern11
class Patterns {
 public static void main(String[] args) {
int n = 7;
for (int i = n; i >= 1; i--) {
 for (int j = 1; j <= i; j++) {
 if (j == 1 || j == i || i == n) {
System.out.print("*");
} else {
System.out.print(" ");
 }
}
System.out.println();
}
}
}
//pattern12
class Patterns{
public static void main(String[] args) {
int n = 5;
for (int i = 0; i <= n; i++) {
for (int j = 0; j < i; j++)
System.out.print("*");
System.out.println(i);
}
}
}
//pattern13
class Patterns {
 public static void main(String[] args) {
 int n = 7;
for (int i = 1; i <= n; i++) {
for (int j = 1; j <= n; j++){ 
if (i == 1) {
System.out.print("* ");
}
else if (j == 1 || j == i) {
System.out.print("* ");
}
else {
 System.out.print("  ");
}
 }
System.out.println();
}
}
}

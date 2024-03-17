/**
 * Author: gunes
 * Project: LambdaExample
 * E-mail: gunesserkan883@gmail.com
 * Creation Date: 3/17/2024 8:25 PM
 */
public class Main {
    public static void main(String[] args) {
        Mathematics sum = (num1, num2) -> num1 + num2;
        Mathematics sub = (num1, num2) -> num1 - num2;
        Mathematics mul = (num1, num2) -> num1 * num2;
        Mathematics div = (num1, num2) -> {
            if (num1 == 0)
                num2 = 1;
            return num1 / num2;
        };
        System.out.println(sum.transaction(12, 13));
        System.out.println(sub.transaction(30, 10));
        System.out.println(mul.transaction(6, 5));
        System.out.println(div.transaction(60, 2));
    }
}

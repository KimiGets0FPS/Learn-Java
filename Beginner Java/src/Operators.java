public class Operators {
    public static void main(String[] args) {
        /*
        ! math operators
        +  --> add
        -  --> subtraction
        * ->> multiplication
        /  --> division
        %  --> modulo or. remainder after division
        examples:
        */
        int a = 10, b = 5;
        System.out.println("a + b = " + (a + b));  //* addition, answer = 15

        System.out.println("a - b = " + (a - b));  //* subtraction, answer = 5

        System.out.println("a * b = " + (a * b));  //* multiplication, answer = 50

        System.out.println("a / b = " + (a / b));  //* division, answer = 2

        System.out.println("a % b = " + (a % b));  //* modulo, answer = 0

        /*
        ! Statement operators
        * ==  --> equals to
        * !=  --> not equal to
        * >  --> greater than
        * <  --> less than
        * <=  --> less or equal to
        * >=  --> greater or equal to
        */
        System.out.println("a is " + a + " and b is " + b);  //* what is the value of a and b

        System.out.println(a == b);  //* == operator, false

        System.out.println(a != b);  //* != operator, true

        System.out.println(a > b);  //* > operator, false

        System.out.println(a < b);  //* < operator, true

        System.out.println(a >= b);  //* >= operator, false

        System.out.println(a <= b);  //* <=operator, true

        /* Logical Operators
        * && logical AND operator
        * || logical OR operator
        * ! logical NOT operator
        */

        //* && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false
        //* || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false
        //* ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
        /* Unary Operators
        * +  Unary Plus operator
        * -  Unary Minus operators
        * ++  Increment operator
        * -- Decrement operator
        * ! Logical complement operator
        */
        ++ a;  //! a+1
        System.out.println("a is now "+ a);
        -- a;  //! a-1
        System.out.println("a is now "+ a);
    }
}

import classes.function; // i called the function now if i add the function
import java.math; // this is java math. it helps so you can do those hard things.

/* in simple terms i don't know much java but i can explain what i did */
public class main {
    public static void mainProject(String []args) {
        function();

        // but wait there is more!
        project();

        // math is also easy for computers, computers love math and we do too but its super easy for them.
        math();

        // and adding examples
        examples();
    }
// i called the main function to start our project, you can call it whatever honestly
/* but you have to name the file the same as your class or 
java gonna be like "Aye that aint the correct thing, fix it fool!" 

but cool thing about java is that it is something you tell it to do and it will do it.

if i make it do  2 / 4 x 3^4 which i can not do yet but learning but i can do 

something else

by the way, remember to add the import and package because its gonna be needed to work on your project.
without, its just gonna be like "nah we aint executing that bro" so remember
*/

    public static void project(String []args) {
        System.out.print("this is also something but there is more!"); // the thing is i probably don't know jack crap about java but i am coding it right here.
        
        
        // fact is you can code in one file but what if that causes problems? that's why you need classes. they can help you.
    }

    public static void math(String []args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int answer = num1 * num2 / num3;

        System.out.print(answer);
    }
    public static void examples() {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        string myText = "Hello";     // String
        long myLong = "223,372,036,854,775"; // Long
        short myShort = "10,345"; // Short
        byte myByte = 127; // Byte
        char myChar = "D"; // char

        

        System.out.print(myNum);
        System.out.print(myFloatNum);
        System.out.print(myLetter);
        System.out.print(myBool);
        System.out.print(myText);

        int num1 = 2, num2 = 3, num3 = 4;

        int x = 100 + 50; // opterators

        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        System.out.print(sum3);
    /*    
    
        Operator	Name	        Description                                 Example	
    
        +	        Addition	    Adds together two values	                x + y	
        -	        Subtraction	    Subtracts one value from another	        x - y	
        *	        Multiplication	Multiplies two values	                    x * y	
        /	        Division	    Divides one value by another	            x / y	    
        %	        Modulus	        Returns the division remainder	            x % y	
        ++	        Increment	    Increases the value of a variable by 1	    ++x	
        --	        Decrement	    Decreases the value of a variable by 1	    --x  

        And 
        
        Operator	Example	    Same As
        =	        x = 5	    x = 5	
        +=	        x += 3	    x = x + 3	
        -=	        x -= 3	    x = x - 3	
        *=	        x *= 3	    x = x * 3	
        /=	        x /= 3	    x = x / 3	
        %=	        x %= 3	    x = x % 3	
        &=	        x &= 3	    x = x & 3	
        |=	        x |= 3	    x = x | 3	
        ^=	        x ^= 3	    x = x ^ 3	
        >>=	        x >>= 3 	x = x >> 3	
        <<=	        x <<= 3	    x = x << 3
    
    from W3Schools
    */
    }
    public static void otherstuff() {
        // something im gonna make as an example

        int num4 = 1;
        int num5 = 9;
        int num6 = 12;

        int answer1 = num4 * num5 + num6;

        System.out.print(answer1);
    }
}


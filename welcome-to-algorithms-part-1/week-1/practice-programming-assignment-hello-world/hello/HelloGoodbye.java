/******************************************************************************
 *  Compilation:  javac HelloGoodbye.java
 *  Execution:    java HelloGoodbye
 *
 *  Prints "Hello, World". By tradition, this is everyone's first program.
 *
 *  % java HelloGoodbye
 *  Hello, World
 *
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output. We will always include such
 *  lines in our programs and encourage you to do the same.
 *
 ******************************************************************************/

public class HelloGoodbye {

    public static void main(String[] args) {
        // Prints "Hello," to the terminal window.
        System.out.println("Hello " + args[0] + (!args[1].isEmpty() ? " and " + args[1] : "") + ".");
        System.out.println("Goodbye " + (!args[1].isEmpty() ? args[1] + " and " : "") + args[0] + ".");
    }

}

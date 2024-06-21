/*
Throw : Java is used to throw an exception from a method or block of code when
an error or exceptional condition occurs that the program cannot handle
at runtime.


exp : send to certain people to handle the exception    dev-> dev2-> tranie-> manager and try to solve the exception


age ko validate karne ke liye there is no exception.

        Throw                                                     Throws
Java throw keyword is used to                       Java throws keyword is used to declare an exception.
explicitly throw an exception.

Checked exception cannot be propagated              Throws is followed by class.
 using throw only.

Throw is followed by an instance.                   Throws is used with the method signature.

Throw is used within the method.                    You can declare multiple exceptions
                                                    e.g. public void method()throws IOException, SQLException.


You cannot throw multiple exceptions.

Checked exception can be propagated with throws.



throw is use in checked exception and throws is use in unchekched exception or user created exception






 */

public class ExceptionThrowDemo {
   static void validateAge(int age){
        if (age<18)
        {
            throw new ArithmeticException("age is not valid");  //with the throw keyword throw followed instance of class[using this new ArithmeticException]
        }else {
            System.out.println("Please Vote");
        }
    }
    public static void main(String[] args) {

        validateAge(14);        //invoke function
        System.out.println("Remaining Code Runs");
    }
}


/*
the exception is thrown by the main function by calling the
 invoke function then exception will be handle by JVM

 it will not handle excpetion currently but it will handle it later
 */
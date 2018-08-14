public class ErrorTypowy {

    public static void main(String[] args) throws Error {
        throw new java.lang.Error("this is very bad");

    }

    //An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not
    //try to catch. Most such errors are abnormal conditions.

/*
        Look at a few of the subclasses of Error, taking some of their JavaDoc comments:

        AnnotationFormatError - Thrown when the annotation parser attempts to read an annotation from a class file and determines that the annotation is malformed.
        AssertionError - Thrown to indicate that an assertion has failed.
                LinkageError - Subclasses of LinkageError indicate that a class has some dependency on another class; however, the latter class has incompatibly changed after the compilation of the former class.
        VirtualMachineError - Thrown to indicate that the Java Virtual Machine is broken or has run out of resources necessary for it to continue operating.

        There are really three important subcategories of Throwable:

        Error - Something severe enough has gone wrong the most applications should crash rather than try to handle the problem,
        Unchecked Exception (aka RuntimeException) - Very often a programming error such as a NullPointerException or an illegal argument. Applications can sometimes handle or recover from this Throwable category -- or at least catch it at the Thread's run() method, log the complaint, and continue running.
        Checked Exception (aka Everything else) - Applications are expected to be able to catch and meaningfully do something with the rest, such as FileNotFoundException and TimeoutException...
*/

}


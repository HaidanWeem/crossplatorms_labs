import java.util.HashMap;

public enum ExceptionVal {
    illegalValue,
    divideByZero,
    unknownException;

    public static HashMap<ExceptionVal, String> exceptionMeaning = new HashMap<>() {
        {
            put(ExceptionVal.illegalValue, "Assertion failed: Illegal value of X for cotangent calculation");
            put(ExceptionVal.divideByZero, "Assertion failed: X is equal 0, it's not possible to divide by 0");
            put(ExceptionVal.unknownException,
                    "Assertion failed: Unknown reason of the exception during exception calculation");
        }
    };
}

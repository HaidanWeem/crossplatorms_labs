/**
 * package
 */

/**
 * Class <code>Equation</code> implements method for (ctg(8*x) / x) expression
 * calculation
 * @author Khvan Danylo
 * @version 1.0
 */
public class Equation {
    /**
     * Method calculates the (ctg(8*x) / x) expression
     * @param X Angle in degrees
     * @throws Exceptions
     * @return (ctg(8*x) / x)
     */
    public double calculator(double X) throws Exceptions {
        double y, radian;
        radian = Math.toRadians(8*X);
        try{
            y= 1.0 / Math.tan(radian);

            if(y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || X*8==90 || X*8== -90 || X==0){
                throw new ArithmeticException();
            }

            y = y / X;

        }catch  (ArithmeticException e){
              var exception = ExceptionVal.exceptionMeaning.get(ExceptionVal.unknownException);

            if(radian == Math.PI/2.0 || radian == -Math.PI/2.0){
                exception = ExceptionVal.exceptionMeaning.get(ExceptionVal.illegalValue);
                throw new Exceptions(exception);

            }else if(X == 0){
                exception = ExceptionVal.exceptionMeaning.get(ExceptionVal.divideByZero);
                throw new Exceptions(exception);
            }
            
                throw new Exceptions(exception);
        }
        System.out.println(radian);
        System.out.println( Math.tan(radian)/X);
        return y;
    }





}
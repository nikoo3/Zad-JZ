package sda.zadwyjatki.ex1;

public class Exercise1 extends Exception {

    public static void main(String[] args) throws CannotDivideByZeroException {
        DivideClass.divide(10,0);
    }
}

    class CannotDivideByZeroException extends Exception {
        public CannotDivideByZeroException() {
            super("Can't divide by 0 !!");
        }
    }

    class DivideClass{
        public static float divide(int x, int y) throws CannotDivideByZeroException {
                 if (y == 0) {
                     throw new CannotDivideByZeroException(); }
                 return x / y;
    }
}

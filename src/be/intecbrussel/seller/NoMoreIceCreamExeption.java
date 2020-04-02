package be.intecbrussel.seller;

public class NoMoreIceCreamExeption {
    public class NoMoreIceCreamException extends Exception {

        public NoMoreIceCreamException() {
        }

        public NoMoreIceCreamException(String message) {
            super(message);
        }

        public NoMoreIceCreamException(String message, Throwable ca) {
            super(message, ca);
        }
    }
}

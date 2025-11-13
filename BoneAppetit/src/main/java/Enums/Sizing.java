package Enums;

public class Sizing {
    public enum Size {
        SMALL("S", 0.00),
        MEDIUM("M", 1.50),
        LARGE("L", 3.00);

        private final String code;
        private final double pricebySize;

        Size(String code, double pricebySize) {
            this.code = code;
            this.pricebySize = pricebySize;
        }

        public String getCode() {
            return code;
        }
        public double getPricebySize() {
            return pricebySize;
        }
    }
}

public class LargeClass {
    public class Problem {
        public class Operator {
            private int firstNumber;
            private int secondNumber;
            private static final int INVALID_NUMBER = -9999;

            Operator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int sum() {
                return this.firstNumber + this.secondNumber;
            }

            public int substractFirstMinusSecond() {
                return this.firstNumber - this.secondNumber;
            }

            public int substractSecondMinusFirst() {
                return this.secondNumber - this.firstNumber;
            }

            public int absoluteSubstract() {
                return this.firstNumber > 0 ? this.substractFirstMinusSecond() : this.substractSecondMinusFirst();
            }

            public int divideFirstBySecond() {
                return this.secondNumber == 0 ? Operator.INVALID_NUMBER : this.firstNumber / this.secondNumber;
            }

            public int divideSecondByFirst() {
                return this.firstNumber == 0 ? Operator.INVALID_NUMBER : this.secondNumber / this.firstNumber;
            }

            public int multiplyFirstBySecond() {
                return this.firstNumber * this.secondNumber;
            }

            public int multiplySecondByFirst() {
                return this.secondNumber * this.firstNumber;
            }

            public int powFirstBySecond() {
                double doubleFirstNumber = Integer.valueOf(this.firstNumber).doubleValue();
                double doubleSecondNumber = Integer.valueOf(this.secondNumber).doubleValue();
                double doubleNumberPow = Math.pow(doubleFirstNumber, doubleSecondNumber);
                return Double.valueOf(doubleNumberPow).intValue();
            }

            public int powSecondByFirst() {
                double doubleSecondNumber = Integer.valueOf(this.secondNumber).doubleValue();
                double doubleFirstNumber = Integer.valueOf(this.firstNumber).doubleValue();
                double doubleNumberPow = Math.pow(doubleSecondNumber, doubleFirstNumber);
                return Double.valueOf(doubleNumberPow).intValue();
            }
        }
    }

    public class Solution {
        class SumOperator {
            private int firstNumber;
            private int secondNumber;

            SumOperator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int sum() {
                return this.firstNumber + this.secondNumber;
            }
        }

        class SubstractOperator {
            private int firstNumber;
            private int secondNumber;

            SubstractOperator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int substractFirstMinusSecond() {
                return this.firstNumber - this.secondNumber;
            }

            public int substractSecondMinusFirst() {
                return this.secondNumber - this.firstNumber;
            }

            public int absoluteSubstract() {
                return this.firstNumber > 0 ? this.substractFirstMinusSecond() : this.substractSecondMinusFirst();
            }
        }

        class DivideOperator {
            private int firstNumber;
            private int secondNumber;
            private static final int INVALID_NUMBER = -9999;

            DivideOperator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int divideFirstBySecond() {
                return this.secondNumber == 0 ? DivideOperator.INVALID_NUMBER : this.firstNumber / this.secondNumber;
            }

            public int divideSecondByFirst() {
                return this.firstNumber == 0 ? DivideOperator.INVALID_NUMBER : this.secondNumber / this.firstNumber;
            }
        }

        class MultiplyOperator {
            private int firstNumber;
            private int secondNumber;

            MultiplyOperator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int multiplyFirstBySecond() {
                return this.firstNumber * this.secondNumber;
            }

            public int multiplySecondByFirst() {
                return this.secondNumber * this.firstNumber;
            }
        }

        class PowOperator {
            private int firstNumber;
            private int secondNumber;

            PowOperator(int firstNumber, int secondNumber) {
                this.firstNumber = firstNumber;
                this.secondNumber = secondNumber;
            }

            public int powFirstBySecond() {
                double doubleFirstNumber = Integer.valueOf(this.firstNumber).doubleValue();
                double doubleSecondNumber = Integer.valueOf(this.secondNumber).doubleValue();
                double doubleNumberPow = Math.pow(doubleFirstNumber, doubleSecondNumber);
                return Double.valueOf(doubleNumberPow).intValue();
            }

            public int powSecondByFirst() {
                double doubleSecondNumber = Integer.valueOf(this.secondNumber).doubleValue();
                double doubleFirstNumber = Integer.valueOf(this.firstNumber).doubleValue();
                double doubleNumberPow = Math.pow(doubleSecondNumber, doubleFirstNumber);
                return Double.valueOf(doubleNumberPow).intValue();
            }
        }
    }
}

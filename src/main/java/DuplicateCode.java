public class DuplicateCode {

    public class Problem {

        public int sum(int firstNumber, int secondNumber) {

            int sum = firstNumber + secondNumber;

            return sum;
        }

        public void printSum(int firstNumber, int secondNumber) {

            int sum = firstNumber + secondNumber;

            System.out.println(sum);
        }
    }

    public class Solution {

        public int sum(int firstNumber, int secondNumber) {

            int sum = firstNumber + secondNumber;

            return sum;
        }

        public void printSum(int firstNumber, int secondNumber) {

            System.out.println(sum(firstNumber, secondNumber));

        }
    }


}
public class DuplicateCode {

    public class Problem {

        public void printFrontPage() {
            System.out.println("Heading");
            System.out.println("Welcome to the site");
            System.out.println("Contact Us");
        }

        public void printLastPage() {
            System.out.println("Headding");
            System.out.println("Thank you for visitting");
            System.out.println("Contact Us");
        }
    }

    public class Solution {

        public void printHeader() {
            System.out.println("Heading");
        }

        public void printFooter() {
            System.out.println("Contact Us");
        }

        public void printFrontPage() {
            printHeader();
            System.out.println("Welcome to the site");
            printFooter();
        }

        public void printLastPage() {
            printHeader();
            System.out.println("Thank you for visitting");
            printFooter();
        }
    }

}
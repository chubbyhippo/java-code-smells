public class DuplicatedCode {

    public class Problem {

        public void printFrontPage() {
            System.out.println("Header start");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header end");

            System.out.println("Welcome to the site");
            System.out.println("Site's body");

            System.out.println("Footer start");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer end");
        }

        public void printLastPage() {
            System.out.println("Header start");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header end");

            System.out.println("Thank you for visitting");

            System.out.println("Footer start");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer end");
        }
    }

    public class Solution {

        public void printHeader() {
            System.out.println("Header start");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header");
            System.out.println("Header end");
        }

        public void printFooter() {
            System.out.println("Footer start");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer");
            System.out.println("Footer end");
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
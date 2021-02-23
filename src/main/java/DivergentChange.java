public class DivergentChange {
    public class Problem {

        public void printDbDetails(){
            // change this when you want to connect to another database
            System.out.println("Customer's database connection");
            System.out.println("Customer's details");
        }

    }


    public class Solution {

        public class Database {
            public void connect(){
                System.out.println("Database connection");
            }
            public void details(){
                System.out.println("Database's details");
            }
        }

        public class CustomerDb extends Database{
            @Override
            public void connect() {
                System.out.println("Customer's database connection");
            }

            @Override
            public void details() {
                System.out.println("Database's details");
            }
        }

        public void printDbDetails() {
           Database customerDb = new CustomerDb();
           customerDb.connect();
           customerDb.details();
        }
    }
}

class ShotgunSurgery {
    public class Problem {
        // Shotgun surgery is when when a single change is made to multiple classes simultaneously
        public class Student {
            public String getId() {
                return "ID123456789";
            }

            public String getName() {
                return "Jone Doe";
            }

            // change this to your liking
            public void printId() {
                System.out.println(getId());
            }
        }

        public class StudentPrinter {
            // change this to your liking
            public void printName(Student student) {
                System.out.println(student.getName());
            }
        }

        public class Printing {
            public void printStudentDetails() {
                Student student = new Student();
                // print id
                System.out.println(student.getId());

                StudentPrinter studentPrinter = new StudentPrinter();
                // print name
                studentPrinter.printName(student);
            }
        }
    }

    public class Solution {

        public class Student {
            public String getId() {
                return "ID123456789";
            }

            public String getName() {
                return "Jone Doe";
            }
        }

        public class StudentPrinter {
            // change this to your liking
            public void printId(Student student) {
                System.out.println(student.getId());
            }

            // change this to your liking
            public void printName(Student student) {
                System.out.println(student.getName());
            }
        }

        public class Printing {

            public void printStudentDetails() {
                StudentPrinter studentPrinter = new StudentPrinter();
                Student student = new Student();
                studentPrinter.printId(student);
                studentPrinter.printName(student);
            }

        }

    }
}

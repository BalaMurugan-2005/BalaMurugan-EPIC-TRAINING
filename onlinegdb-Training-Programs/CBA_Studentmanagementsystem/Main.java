
import java.util.Scanner;

class Student {

    String stuName;
    String stuDept;
    int stuAge;

    // Array to store Student Objects
    Student[] stuArr = new Student[100];

    int index = 0;


    Student() {

    }


    Student(String name, String dept, int age) {

        this.stuName = name;
        this.stuDept = dept;
        this.stuAge = age;

    }


    // ================= CREATE STUDENT =================

    void createStudent() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student Name:");
        String name = in.nextLine();

        System.out.println("Enter Student Department:");
        String dept = in.nextLine();

        System.out.println("Enter Student Age:");
        int age = in.nextInt();


        Student stu = new Student(name, dept, age);

        stuArr[index] = stu;

        index++;

        System.out.println("Student Created Successfully!");
    }


    // ================= DISPLAY STUDENT =================

    void displayStudent() {

        if (index == 0) {

            System.out.println("No Students Found!");
            return;

        }

        for (int i = 0; i < index; i++) {

            System.out.println("\nStudent ID: " + i);

            System.out.println("Name: " +
                    stuArr[i].stuName);

            System.out.println("Department: " +
                    stuArr[i].stuDept);

            System.out.println("Age: " +
                    stuArr[i].stuAge);

            System.out.println("-----------------------");
        }
    }


    // ================= GET STUDENT BY ID =================

    void getStudentByID() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student ID:");

        int id = in.nextInt();


        if (id >= 0 && id < index) {

            System.out.println("\nStudent Found!");

            System.out.println("Student ID: " + id);

            System.out.println("Name: " +
                    stuArr[id].stuName);

            System.out.println("Department: " +
                    stuArr[id].stuDept);

            System.out.println("Age: " +
                    stuArr[id].stuAge);

        } else {

            System.out.println("Student Not Found!");

        }
    }


    // ================= UPDATE STUDENT =================

    void updateStudent() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student ID:");

        int id = in.nextInt();


        if (id >= 0 && id < index) {

            in.nextLine();

            System.out.println("Enter New Name:");

            String name = in.nextLine();


            System.out.println("Enter New Department:");

            String dept = in.nextLine();


            System.out.println("Enter New Age:");

            int age = in.nextInt();


            stuArr[id].stuName = name;

            stuArr[id].stuDept = dept;

            stuArr[id].stuAge = age;


            System.out.println(
                    "Student Updated Successfully!"
            );

        } else {

            System.out.println("Student Not Found!");

        }
    }


    // ================= DELETE STUDENT =================

    void deleteStudent() {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Student ID:");

        int id = in.nextInt();


        if (id >= 0 && id < index) {

            // Shift all elements left

            for (int i = id; i < index - 1; i++) {

                stuArr[i] = stuArr[i + 1];

            }


            // Remove last duplicate reference

            stuArr[index - 1] = null;

            index--;


            System.out.println(
                    "Student Deleted Successfully!"
            );

        } else {

            System.out.println(
                    "Student Not Found!"
            );

        }
    }
}


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Main Object
        Student stu = new Student();


        while (true) {

            System.out.println(
                    "\n===== STUDENT MANAGEMENT SYSTEM ====="
            );

            System.out.println(
                    "1) Create Student"
            );

            System.out.println(
                    "2) Display Students"
            );

            System.out.println(
                    "3) Get Student By ID"
            );

            System.out.println(
                    "4) Update Student"
            );

            System.out.println(
                    "5) Delete Student"
            );

            System.out.println(
                    "6) Exit"
            );


            System.out.println(
                    "Enter your choice:"
            );


            int choice = in.nextInt();


            switch (choice) {

                case 1:

                    stu.createStudent();

                    break;


                case 2:

                    stu.displayStudent();

                    break;


                case 3:

                    stu.getStudentByID();

                    break;


                case 4:

                    stu.updateStudent();

                    break;


                case 5:

                    stu.deleteStudent();

                    break;


                case 6:

                    System.out.println(
                            "Thank You!"
                    );

                    System.exit(0);

                    break;


                default:

                    System.out.println(
                            "Invalid Choice!"
                    );
            }
        }
    }
}
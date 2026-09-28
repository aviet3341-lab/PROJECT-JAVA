package course;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CourseArrayList courseList = new CourseArrayList();

        int choice;

        do {
            System.out.println("\n========== COURSE MANAGEMENT ==========");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. Display All Courses");
            System.out.println("5. Display Available Courses");
            System.out.println("6. Calculate Total Fees");
            System.out.println("7. Exit");
            System.out.println("=======================================");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Choose course type: 1. OnlineCourse | 2. OfflineCourse");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        OnlineCourse oc = new OnlineCourse();
                        oc.addCourse();
                        courseList.addCourseToArrayList(oc);

                    } else if (type == 2) {
                        OffLineCourse ofc = new OffLineCourse();
                        ofc.addCourse();
                        courseList.addCourseToArrayList(ofc);

                    } else {
                        System.out.println("Invalid type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter course ID: ");
                    String updateId = sc.nextLine();
                    courseList.updateCourseById(updateId);
                    break;

                case 3:
                    System.out.print("Enter course ID: ");
                    String deleteId = sc.nextLine();
                    courseList.deleteCourseById(deleteId);
                    break;

                case 4:
                    courseList.displayAllCourses();
                    break;

                case 5:
                    courseList.displayAvailableCourses();
                    break;

                case 6:
                    double totalFees = courseList.calculateTotalFees();
                    System.out.println("Total fees: " + totalFees);
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 7);

        sc.close();
    }
}
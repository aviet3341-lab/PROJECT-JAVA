/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course;

import java.util.ArrayList;

/**
 *
 * @author longthinh
 */
public class CourseArrayList {

    ArrayList<Course> courseArrayList = new ArrayList<>();

    // a. Add a new course
    public void addCourseToArrayList(Course course) {
        courseArrayList.add(course);
    }

    // b. Update course by ID
    public void updateCourseById(String id) {
        for (Course course : courseArrayList) {
            if (course.getId().equalsIgnoreCase(id)) {
                course.updateCourse();
                return;
            }
        }
        System.out.println("Course not found!");
    }

    // c. Delete course by ID
    public void deleteCourseById(String id) {
        for (Course course : courseArrayList) {
            if (course.getId().equalsIgnoreCase(id)) {
                courseArrayList.remove(course);
                return;
            }
        }
        System.out.println("Course not found!");
    }

    // d. Display all courses
    public void displayAllCourses() {
        for (Course course : courseArrayList) {
            System.out.println(course);
        }
    }

    // e. Display available courses
    public void displayAvailableCourses() {
        for (Course course : courseArrayList) {
            if (course.isIsAvailable()) {
                System.out.println(course);
            }
        }
    }

    // f. Calculate total fees
    public double calculateTotalFees() {
        double total = 0;

        for (Course course : courseArrayList) {
            total += course.calculateTotalFee();
        }
        return total;
    }
}

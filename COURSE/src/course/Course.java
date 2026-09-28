/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author longthinh
 */
public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    @Override
    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Id: ");
        setId(sc.nextLine());

        System.out.println("Enter Fee Per Student: ");
        setFeePerStudent(sc.nextDouble());

        try {
            System.out.println("Enter Start Date(dd/MM/yyy: ");
            setStartDate(sdf.parse(sc.nextLine()));
        } catch (ParseException e) {
            System.out.println("Erorr Format!!!");
        }

        System.out.println("Is Vehicle Available? (true/false): ");
        setIsAvailable(sc.nextBoolean());

        if (isIsAvailable()) {
            System.out.println("Vehicle is available");
        } else {
            System.out.println("Vehicle is not available");
        }

        System.out.println("Enter Enrolled Students: ");
        setEnrolledStudents(sc.nextInt());
    }

    @Override
    public void updateCourse() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Enter Id: ");
            setId(sc.nextLine());

            System.out.println("Enter Fee Per Student: ");
            setFeePerStudent(sc.nextDouble());

            System.out.println("Enter Start Date(dd/MM/yyy: ");
            setStartDate(sdf.parse(sc.nextLine()));

            System.out.println("Is Vehicle Available? (true/false): ");
            setIsAvailable(sc.nextBoolean());

            if (isIsAvailable()) {
                System.out.println("Vehicle is available");
            } else {
                System.out.println("Vehicle is not available");
            }

            System.out.println("Enter Enrolled Students: ");
            setEnrolledStudents(sc.nextInt());
        } catch (ParseException ex) {
            System.out.println("Erorr Format!!!");
        }
    }
    
    @Override
    public void displayCourse() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = (startDate != null) ? sdf.format(startDate) : "N/A";
        
        System.out.println("Id: " + getId());
        System.out.println("Fee Per Student: " + getFeePerStudent());
        System.out.println("Start Date: " + dateStr);
        System.out.println("Available: " + isIsAvailable());
        System.out.println("Enrolled Students: " + getEnrolledStudents());
    }
    
    public abstract double calculateTotalFee();
}

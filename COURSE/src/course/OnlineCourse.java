/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package course;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author longthinh
 */
public class OnlineCourse extends Course {
    private String platformName;
    private  double discountPercent;
    
    public OnlineCourse() {
        
    }

    public OnlineCourse(String platformName, double discountPercent) {
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    @Override
    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        super.addCourse();
        
        System.out.println("Enter Plat Form Name: ");
        setPlatformName(sc.nextLine());
        
        System.out.println("Enter Discount Percent: ");
        setDiscountPercent(sc.nextDouble());
    }
    
    
    @Override
    public void updateCourse() {
        Scanner sc = new Scanner(System.in);
        super.updateCourse();
        
        System.out.println("Enter Plat Form Name: ");
        setPlatformName(sc.nextLine());
        
        System.out.println("Enter Discount Percent: ");
        setDiscountPercent(sc.nextDouble());
    }
    
    @Override
    public void displayCourse() {
        super.displayCourse();
        
        System.out.println("Plat Form Name: " + getPlatformName());
        System.out.println("Discount Percent: " + getDiscountPercent());
    }
    
    @Override
    public double calculateTotalFee() {

        return getFeePerStudent() * getEnrolledStudents() * (1 - discountPercent / 100);
    }

}

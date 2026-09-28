
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
public class OffLineCourse extends Course {
    private String classroomNumber;
    private double materialFeePerStudent;
    
    public OffLineCourse() {
        
    }

    public OffLineCourse(String classroomNumber, double materialFeePerStudent) {
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OffLineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }
    
    @Override
    public void addCourse() {
        Scanner sc = new Scanner(System.in);
        
        super.addCourse();
        
        System.out.println("Enter Class Room Number: ");
        setClassroomNumber(sc.nextLine());
        
        System.out.println("Enter Material FeePer Student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }
    
    @Override
    public void updateCourse() {
        Scanner sc = new Scanner(System.in);
        
        super.updateCourse();
        
        System.out.println("Enter Class Room Number: ");
        setClassroomNumber(sc.nextLine());
        
        System.out.println("Enter Material FeePer Student: ");
        setMaterialFeePerStudent(sc.nextDouble());
    }
    
    @Override
    public void displayCourse() {
        super.displayCourse();
        
        System.out.println("Class Room Number: " + getClassroomNumber());
        System.out.println("Material FeePer Student: " + getMaterialFeePerStudent());
       
    }
    
    @Override
    public double calculateTotalFee() {
        return (getFeePerStudent() + materialFeePerStudent) * getEnrolledStudents() ;
    }
}

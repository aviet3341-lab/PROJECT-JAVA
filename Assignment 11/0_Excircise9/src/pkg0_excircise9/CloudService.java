/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg0_excircise9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author longthinh
 */
public abstract class CloudService implements ICloudService {

    private String id;
    private double baseMonthlyFee;
    private Date startDate;
    private boolean isActive;
    private int monthsUsed;
    
    protected Scanner scanner = new Scanner(System.in);

    public CloudService(String id, double baseMonthlyFee, Date startDate, boolean isActive, int monthsUsed) {
        this.id = id;
        this.baseMonthlyFee = baseMonthlyFee;
        this.startDate = startDate;
        this.isActive = isActive;
        this.monthsUsed = monthsUsed;
    }

    public CloudService() {
    }

    public String getId() {
        return id;
    }

    public double getBaseMonthlyFee() {
        return baseMonthlyFee;
    }

    public Date getStartDate() {
        return startDate;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public int getMonthsUsed() {
        return monthsUsed;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBaseMonthlyFee(double baseMonthlyFee) {
        this.baseMonthlyFee = baseMonthlyFee;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setMonthsUsed(int monthsUsed) {
        this.monthsUsed = monthsUsed;
    }

    @Override
    public void addService() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter Id: ");
        setId(sc.nextLine());

        System.out.println("Enter: Base MonthlyFee: ");
        setBaseMonthlyFee(sc.nextDouble());

        try {
            System.out.println("Enter Start Date(dd/MM/yyyy: ");
            setStartDate(sdf.parse(sc.nextLine()));
        } catch (ParseException e) {
            System.out.println("ERORR!!!");
        }

        System.out.println("Is Cloud Active? (true/false): ");
        setIsActive(sc.nextBoolean());
        if (isIsActive()) {
            System.out.println("Cloud is Active");
        } else {
            System.out.println("Cloud is not Active");
        }

        System.out.println("Enter Month Used: ");
        setMonthsUsed(sc.nextInt());
    }

    @Override
    public void updateService() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Enter Id: ");
            setId(sc.nextLine());

            System.out.println("Enter: Base MonthlyFee: ");
            setBaseMonthlyFee(sc.nextDouble());

            System.out.println("Enter Start Date(dd/MM/yyyy: ");
            setStartDate(sdf.parse(sc.nextLine()));

            System.out.println("Is Cloud Active? (true/false): ");
            setIsActive(sc.nextBoolean());
            if (isIsActive()) {
                System.out.println("Cloud is Active");
            } else {
                System.out.println("Cloud is not Active");
            }

            System.out.println("Enter Month Used: ");
            setMonthsUsed(sc.nextInt());

        } catch (ParseException ex) {
            System.out.println("ERORR!!!");
        }
    }

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateStr = (startDate != null) ? sdf.format(startDate) : "N/A";
        
        System.out.println("ID: " + getId());
        System.out.println("Base MonthlyFee: " + getBaseMonthlyFee());
        System.out.println("Date: " + dateStr);
        System.out.println("Is cloud active: " + isIsActive());
        System.out.println("Month Used: " + getMonthsUsed());
    }
}

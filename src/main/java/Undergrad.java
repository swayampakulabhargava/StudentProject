/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bharath
 */
public class Undergrad extends Student {
    
    private int year;

    public Undergrad(int year, String studentId, String firstName, String lastName) {
        super(studentId, firstName, lastName);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
    
 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bharath
 */
public class Graduate extends Student{
    
    private String type;

    public Graduate(String type, String studentId, String firstName, String lastName) {
        super(studentId, firstName, lastName);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;

    
}
}

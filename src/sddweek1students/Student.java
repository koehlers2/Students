/*
    Name:  Sebastian Koehler
    Assignment:  [assignment name]
    Program: PROG24178
    Date:  [assignment due date here]

    Description:
    [program description in your own words]
*/
/*
 * Sebastian Koehler
 * Student ID: 991 480 670
 * SYST10199 - Web Programming
 */

package sddweek1students;

/**
 *
 * @author Seby
 */
public class Student {


     * @return the ID
     */
    
    private String name;
    private int ID;
    private int maxCourses;
    
    //Constructors
    Student(String name){
        setName(name);
    }
    //Accessors/Getters
    public String getName(){
        return this.name;
    }
    //Mutators/Setters
    public void setName(String name){
        this.name=name;
    }
    public int getID() {
        return ID;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
       
    private int getMaxCourses() {
        return maxCourses;
    }

    
    private void setMaxCourses(int maxCourses) {
        this.maxCourses = maxCourses;
    }

}

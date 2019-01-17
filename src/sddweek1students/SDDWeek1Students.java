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
public class SDDWeek1Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student s1 = new Student("Sebastian");
        Student[] studentList = new Student[3];
        studentList[0] = s1;
        studentList[1] = new Student("amrit kaur");
        studentList[2] = new Student("Malav Jani");
        
        for (int i = 0; i < studentList.length;i++){
            System.out.println(studentList[i].getName());
        }
        
    }

}

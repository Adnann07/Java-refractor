/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package refractor3;

/**
public class StudentGrades {
    public String getGrade(int marks) {
        if (marks >= 90 && marks <= 100) {
            return "A";
        } else if (marks >= 80 && marks < 90) {
            return "B";
        } else if (marks >= 70 && marks < 80) {
            return "C";
        } else if (marks >= 60 && marks < 70) {
            return "D";
        } else if (marks >= 0 && marks < 60) {
            return "F";
        } else {
            return "Invalid Marks";
        }
    }
}
 */
public class StudentGrades {
    

    public String getGrade(int marks)
    {
        if(isInvalidMarks(marks))
        {
            return "Invalid Marks";
        }
        else if(marks >=90)
        {
            return "A";
        }
        else if(marks >=80)
        {
            return "b";
        }
        else if(marks >=70)
        {
            return "c";
        }
        else if(marks >=60)
        {
            return "d";
        }
        else 
        {
            return "f";
        }
        
    }
    
    private boolean isInvalidMarks(int marks)
    {
        return marks<0 || marks>100;
    }
   
}

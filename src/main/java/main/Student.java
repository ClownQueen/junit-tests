package main;

import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    // returns the student's id
    public long getId(long id){
        return this.id = id;
    }

    // returns the student's name
    public String getName(String name){
        return this.name = name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
//    public ArrayList<Integer> getGrades(){
//
//    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}

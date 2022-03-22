package main;

import java.util.ArrayList;

public class Student {
    public long id;
    public String name;
    public ArrayList<Integer> grades;

    public Student() {
        grades = new ArrayList<>();
    }

    public Student(long id, String name){
        this();
        this.id = id;
        this.name = name;
    }

    // returns the student's id
    public long getId(long id){
        return id;
    }

    // returns the student's name
    public String getName(String name){
        return name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for (int grade: grades){
            sum += grade;
        }
        return sum / grades.size();
    }
}

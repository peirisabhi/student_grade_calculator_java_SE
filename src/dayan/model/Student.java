/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dayan.model;

import java.util.List;

/**
 *
 * @author abhi
 */
public class Student {
    String name;
    String indexNumber;
    String courseType;
    List<Subject> subjects;

    public Student() {
    }
    
    

    public Student(String name, String indexNumber, String courseType, List<Subject> subjects) {
        this.name = name;
        this.indexNumber = indexNumber;
        this.courseType = courseType;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", indexNumber=" + indexNumber + ", courseType=" + courseType + ", subjects=" + subjects + '}';
    }
    
    
    
    
}

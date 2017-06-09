/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentInformationSystem;

import java.util.Comparator;

/**
 *
 * @author Dell
 */
public class data implements Comparable <data>{

private int StudentID;
private String StudentName;
private String ModuleName;
private double quiz1;
private double quiz2;
private double IndividualAssignment1;
private double IndividualAssignment2;
private double labtest;
private double midTerm;
private double groupProject;
private double finalexam;
private double courseworkMark;
private double courseworkperc;
private double finalexamperc;
private double totalmark;
private double result;
private double grade;

public data(int StudentID,String StudentName,String ModuleName,
        double quiz1,double quiz2,double IndividualAssignment1,double IndividualAssignment2,
        double labtest,double midTerm,double groupProject,double finalexam,double courseworkMark,
        double courseworkperc,double finalexamperc,double totalmark,double result,double grade){
    
    super();
    this.StudentID=StudentID;
    this.StudentName=StudentName;
    this.ModuleName=ModuleName;
    this.quiz1=quiz1;
    this.quiz1=quiz2;
    this.IndividualAssignment1=IndividualAssignment1;
    this.IndividualAssignment2=IndividualAssignment2;
    this.labtest=labtest;
    this.midTerm=midTerm;
    this.groupProject=groupProject;
    this.finalexam=finalexam;
    this.courseworkMark=courseworkMark;
    this.courseworkperc=courseworkperc;
    this.finalexamperc=finalexamperc;
    this.totalmark=totalmark;
    this.result=result;
    this.grade=grade;
}
public int getStudentID(){
    return StudentID;
}

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    

    public String getModuleName() {
        return ModuleName;
    }

    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }
    
    

    public double getQuiz1() {
        return quiz1;
    }

    public void setQuiz1(double quiz1) {
        this.quiz1 = quiz1;
    }
    

    public double getQuiz2() {
        return quiz2;
    }

    public void setQuiz2(double quiz2) {
        this.quiz2 = quiz2;
    }
    

    public double getIndividualAssignment1() {
        return IndividualAssignment1;
    }

    public void setIndividualAssignment1(double IndividualAssignment1) {
        this.IndividualAssignment1 = IndividualAssignment1;
    }
    

    public double getIndividualAssignment2() {
        return IndividualAssignment2;
    }

    public void setIndividualAssignment2(double IndividualAssignment2) {
        this.IndividualAssignment2 = IndividualAssignment2;
    }
    

    public double getLabtest() {
        return labtest;
    }

    public void setLabtest(double labtest) {
        this.labtest = labtest;
    }
    

    public double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(double midTerm) {
        this.midTerm = midTerm;
    }

    public double getGroupProject() {
        return groupProject;
    }

    public void setGroupProject(double groupProject) {
        this.groupProject = groupProject;
    }
    

    public double getFinalexam() {
        return finalexam;
    }

    public void setFinalexam(double finalexam) {
        this.finalexam = finalexam;
    }
    

    public double getCourseworkMark() {
        return courseworkMark;
    }

    public void setCourseworkMark(double courseworkMark) {
        this.courseworkMark = courseworkMark;
    }
    

    public double getCourseworkperc() {
        return courseworkperc;
    }

    public void setCourseworkperc(double courseworkperc) {
        this.courseworkperc = courseworkperc;
    }
    

    public double getFinalexamperc() {
        return finalexamperc;
    }

    public void setFinalexamperc(double finalexamperc) {
        this.finalexamperc = finalexamperc;
    }
    

    public double getTotalmark() {
        return totalmark;
    }

    public void setTotalmark(double totalmark) {
        this.totalmark = totalmark;
    }
    

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

@Override
public int compareTo(data comparedata) {
        
        double comparecourseworkMark = ((data) comparedata).getCourseworkMark();
        return (int) (comparecourseworkMark - this.courseworkMark);
    }

    
}

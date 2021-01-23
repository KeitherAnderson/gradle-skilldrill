package edu.isu.cs.cs2263;

import java.util.ArrayList;

public class Student {

   private String firstName;
   private String lastName;
   private ArrayList<Course> courses;

   public Student() { courses = new ArrayList(); }

   public void setFirstName(String name) { firstName = name; }
   public void setLastName(String name) { lastName = name; }
   public String getFirstName() { return firstName; }
   public String getLastName() { return lastName; }
   public String toString() { return firstName + " " + lastName; }
   public ArrayList<Course> getCourses() { return courses; }
}

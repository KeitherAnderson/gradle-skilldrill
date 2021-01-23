package edu.isu.cs.cs2263;

public class Course {
   private int number;
   private String subject;
   private String title;

   Course() {}

   public void setNumbers(int num) { number = num; }
   public void setSubject(String subj) { subject = subj; }
   public void setTitle(String t) { title = t; }
   public int getNumber() { return number; }
   public String getSubject() { return subject; }
   public String getTitle() { return title; }
   public String toString() { return subject + " " + number + " " + title; }

}

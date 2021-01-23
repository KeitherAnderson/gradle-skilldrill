package edu.isu.cs.cs2263;

import java.util.ArrayList;
import com.google.gson.Gson;

import java.nio.file.*;
import java.io.*;

public class IOManager {

   IOManager() {}
   
   public Student[] readData(String file) {
      try {
         Gson gson = new Gson();
         Reader reader = Files.newBufferedReader(Paths.get(file));
         return gson.fromJson(reader, Student[].class);
      }catch (Exception ex) {
         ex.printStackTrace();
      }
      return null;
   }
   
   public void writeData(String file, ArrayList<Student> data) {
      try {
         Gson gson = new Gson();
         Writer writer = Files.newBufferedWriter(Paths.get(file));
         
         gson.toJson(data, writer);
         writer.close();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }

}

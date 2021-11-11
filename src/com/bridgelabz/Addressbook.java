package com.bridgelabz;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Addressbook {
    public static void main(String[] args) {
        StringBuilder contactbuild= new StringBuilder();
        contactbuild.append("FirstName").append(",").append("LastName").append(",").append("PhoneNumber").append(",")
                .append("State").append("\n");
        contactbuild.append("Rahul").append(",").append("Saha").append(",").append("8645812785").append(",")
                .append("assam").append("\n");
        contactbuild.append("Dipankar").append(",").append("Saha").append(",").append("9645875127").append(",")
                .append("Kolkata").append("\n");
        contactbuild.append("Chiranjit").append(",").append("Saha").append(",").append("9645845127").append(",")
                .append("Bikanar").append("\n");
        try(FileWriter writer=new FileWriter("Friend.csv")){
            writer.write(contactbuild.toString());
            System.out.println("CSV file created");

        }catch (Exception e){
            System.out.println("Csv not created");
        }
        String file="src\\Friend.csv";
        BufferedReader reader=null;
        String line="";
        try{
            reader=new BufferedReader(new FileReader(file));
            while ((line=reader.readLine())!=null){
                String[] row=line.split(",");
                for (String index:row) {
                    System.out.printf("%-10s",index);
                }
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }
    }
}

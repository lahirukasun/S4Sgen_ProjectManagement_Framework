package com.s4sgen.projectManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDataDemo {

    public static void main(String[] args) {
        
        enter_project_details("ttttt", "Education", "Student Managemetnt System", "class management");
        
    }

    public static void enter_project_details(String name, String categoty, String scategory, String title) {

        String pName = name;
        String pCategory = categoty;
        String pSCategory = scategory;
        String pTitle = title;

        Connection connection = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/s4sgen", "root", "thela");

            stmt = connection.createStatement();
            stmt.execute("INSERT INTO project (project_name,project_category,project_sub_category,project_title) "
                    + "VALUES ('" + pName + "','" + pCategory + "','" + pSCategory + "','" + pTitle + "')");
            
            System.out.println("data sucsessfully inserted");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

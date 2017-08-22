package com.s4sgen.projectManagement;

import java.io.File;

public class create_project_folder {
    
    public static void main(String[] args) {
        
        create_folder("ddddddddd");
    }
    
   
    public static void create_folder(String folderName){
    
    new File("G:\\S4Sgen\\system_store\\"+folderName).mkdir();
    System.out.println("done");
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filefolder;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Ruam
 */
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a folder path: ");
        String strPath = scanner.nextLine();
        File path = new File(strPath);
        File[] folders = path.listFiles(File::isDirectory);
        scanner.close();
        System.out.println("Folders: ");
        for(File folder : folders){
            System.out.println(folder);
        }
        
        boolean success = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
    }
}

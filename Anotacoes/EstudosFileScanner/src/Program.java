
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ruam
 */
public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ruam\\Documents\\GitHub\\UdemyJava\\Anotacoes\\in.txt"); 
        Scanner scanner = null;
        try{
            scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        }
        catch(IOException e){
            System.out.println("Error: " +e.getMessage());
        }
        finally{
            if(scanner != null){
                scanner.close();
            }
            
        }
    }
}

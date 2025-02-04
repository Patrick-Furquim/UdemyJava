/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebufferedwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Ruam
 */
public class Program {
    public static void main(String[] args) {
        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
        String path = "C:\\Users\\Ruam\\Documents\\GitHub\\UdemyJava\\Anotacoes\\in.txt";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }
        catch(IOException e){
                System.out.println("Error: "+ e.getMessage());
        }
    }
}

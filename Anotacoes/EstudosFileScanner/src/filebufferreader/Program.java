/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filebufferreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Ruam
 */
public class Program {
    public static void main(String[] args) {
        String path = "C:\\Users\\Ruam\\Documents\\GitHub\\UdemyJava\\Anotacoes\\in.txt";
//        FileReader fr = null;
//        BufferedReader br = null;
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
 //           fr = new FileReader(path);
 //           br = new BufferedReader(fr);
            
            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch(IOException e){
            System.out.println("Error: "+ e.getMessage());
        }
//        finally{
//            try{
//                if(br!=null){
//                    br.close();
//                }
//                if(fr != null){
//                    fr.close();
//                }
//            }
//            catch(IOException e){
//                e.printStackTrace();
//            }
//        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservahotel;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import model.exceptions.DomainException;

/**
 *
 * @author Ruam
 */
public class ReservaHotel {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ReservaHotel reservaHotel = new ReservaHotel();
        Reserva reserva = reservaHotel.criarReserva(); 
        reservaHotel.updateReserva(reserva);
    }
    
    
    public Reserva criarReserva(){
        System.out.println("Qual quarto voce deseja?");
        String stringQuarto = scanner.nextLine();
        int quarto = Integer.parseInt(stringQuarto);
        System.out.println("Quando fara o check in? Utilize o formato dd/MM/yyyy");
        String dataString = scanner.nextLine();
        LocalDate checkIn = LocalDate.parse(dataString, formatter);
        System.out.println("Quando fara o check out? Utilize o formato dd/MM/yyyy");
        dataString = scanner.nextLine();
        LocalDate checkOut = LocalDate.parse(dataString, formatter);
        
        Reserva reserva = new Reserva(checkIn, checkOut, quarto);
        return reserva;
    }
    
    public void updateReserva(Reserva reserva){
        try{
            System.out.println("Qual a nova data de checkIn?");
            String dataString = scanner.nextLine();
            LocalDate checkIn = LocalDate.parse(dataString, formatter);

            System.out.println("Qual a nova data de checkOut?");
            dataString = scanner.nextLine();
            LocalDate checkOut = LocalDate.parse(dataString, formatter);
            reserva.updateDates(checkIn, checkOut);
        }
        catch(DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        
    }
}

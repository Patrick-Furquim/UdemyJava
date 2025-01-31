/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservahotel;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import model.exceptions.DomainException;


public class Reserva {
    private int roomNumber;
    private LocalDate checkIn;
    private LocalDate checkOut;
    
    public Reserva(LocalDate checkIn, LocalDate checkOut, int roomNumber) throws DomainException{
        if(checkIn.isAfter(checkOut)){
            throw new DomainException("check out dates mus be after check in dates");
        }
        if(checkIn.isBefore(LocalDate.now())){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.roomNumber = roomNumber;
    }
    
    public int duration(){
       int diasEntre;
       diasEntre = (int) ChronoUnit.DAYS.between(checkIn, checkOut);
       return diasEntre;
    }
    
    public void updateDates(LocalDate newCheckIn, LocalDate newCheckOut) throws DomainException{
        if(newCheckIn.isAfter(newCheckOut)){
            throw new DomainException("check out dates mus be after check in dates");
        }
        if(newCheckIn.isBefore(LocalDate.now())){
            throw new DomainException("Reservation dates for update must be future dates");
        }
        this.checkIn = newCheckIn;
        this.checkOut = newCheckOut;
        System.out.println("Data updated: " + this.toString());
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }


    @Override
    public String toString() {
        return "Reserva{" + "Numero do quarto: " + roomNumber + ", CheckIn: " + checkIn + ", CheckOut: " + checkOut + ", Duração em dias: " + this.duration() + '}';
    }
    
}

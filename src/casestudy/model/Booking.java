package casestudy.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private String bookingCode, bookingdate, startDate, endDate, idCustomer, idService;

    public Booking() {
    }

    public Booking(String bookingCode, String bookingdate, String startDate, String endDate, String idCustomer, String idService) {
        this.bookingCode = bookingCode;
        this.bookingdate = bookingdate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public String getBookingdate() {
        return bookingdate;
    }

    public void setBookingdate(String bookingdate) {
        this.bookingdate = bookingdate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getInfoToWrite() {
        return getBookingCode() + "," + getBookingdate() + "," + getStartDate() + "," + getEndDate() + "," + getIdCustomer() + "," + getIdService();
    }

    @Override
    public String toString() {
        return "ID: " + getBookingCode() + ", Date booking: " + getBookingdate() + ", Date start: " + getStartDate() + ", Date end:" + getEndDate() + ", ID customer: " + getIdCustomer() + ", ID service: " + getIdService();
    }

    @Override
    public int compareTo(Booking o) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate thisdate = LocalDate.parse(this.getBookingdate(), formatter);
        LocalDate thatDate = LocalDate.parse(o.getBookingdate(), formatter);
        if (thisdate.compareTo(thatDate) == 0) {
            LocalDate date1 = LocalDate.parse(this.getEndDate(), formatter);
            LocalDate date2 = LocalDate.parse(o.getEndDate(), formatter);
            return date1.compareTo(date2);
        } else {
            return thisdate.compareTo(thatDate);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookingCode(), getBookingdate(), getStartDate(), getEndDate(), getIdCustomer(), getIdService());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Booking booking= (Booking) o;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start1 = LocalDate.parse(this.getStartDate(), formatter);
        LocalDate end1 = LocalDate.parse(this.getEndDate(), formatter);
        LocalDate start2 = LocalDate.parse(booking.getStartDate(), formatter);
        LocalDate end2 = LocalDate.parse(booking.getEndDate(), formatter);

        return Objects.equals(this.getIdService(), booking.getIdService()) && !start2.isAfter(end1) && !end2.isBefore(start1);
    }
}

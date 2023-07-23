package org.apiautomation.payload.pojos;

import java.util.function.BooleanSupplier;

public class Booking {

    private String firstname;
    private String lastname;
    private Double totalrice;
    private BooleanSupplier depositpaid;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Double getTotalrice() {
        return totalrice;
    }

    public void setTotalrice(Double totalrice) {
        this.totalrice = totalrice;
    }

    public BooleanSupplier getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(BooleanSupplier depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public BookingDates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(BookingDates bookingdates) {
        this.bookingdates = bookingdates;
    }

    private String additionalneeds;
    private BookingDates bookingdates;

}

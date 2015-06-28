package DAO;

import model.Booking;
import model.Cafe;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface BookingDAO {

    public List<Booking> getBookingList();

    public List<Booking> getBookingByCafe(Cafe cafe);

    public List<Booking> getBookingByTable(Cafe cafe, int tableNumber);

    public Booking mergeBooking(Booking booking);

    public Booking cancelBooking(Booking booking);

}

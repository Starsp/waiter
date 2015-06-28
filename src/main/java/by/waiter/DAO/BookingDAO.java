package by.waiter.DAO;

import by.waiter.model.Booking;
import by.waiter.model.Cafe;

import java.util.List;

/**
 * Created by Vassilev on 28.06.2015.
 */
public interface BookingDAO {

    List<Booking> getBookingList();

    List<Booking> getBookingByCafe(Cafe cafe);

    List<Booking> getBookingByTable(Cafe cafe, int tableNumber);

    Booking mergeBooking(Booking booking);

    Booking cancelBooking(Booking booking);

}

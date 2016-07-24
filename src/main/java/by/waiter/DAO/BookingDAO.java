package by.waiter.DAO;

import by.waiter.model.Booking;
import by.waiter.model.Retail;

import java.util.List;

/**
 * Created by Vassilev
 * 28.06.2015.
 */
public interface BookingDAO {

    List<Booking> getBookingList();

    List<Booking> getBookingByCafe(Retail retail);

    List<Booking> getBookingByTable(Retail retail, int tableNumber);

    Booking mergeBooking(Booking booking);

    Booking cancelBooking(Booking booking);

}

package com.jetbrains.bookingservice.repositories;

import com.jetbrains.bookingservice.models.Booking;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface BookingRepository extends CrudRepository<Booking, Long> {
    List<Booking> findAllByRestaurantIdAndDate(final String restaurantId, final LocalDate bookingDate);

    List<Booking> findAllByRestaurantId(final String restaurantId);
}
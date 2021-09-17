package com.jetbrains.bookingservice;

import java.time.DayOfWeek;
import java.util.Set;

public record Restaurant(String id, Integer capacity, Set<DayOfWeek> openingDays) {

    Boolean isCapacityLessThanNumberOfDinersIn(final Booking booking) {
      return booking.isNumberOfDinersMoreThanGivenCapacity(this.capacity);
    }

    Boolean isRestaurantOpenOn(final DayOfWeek dayOfWeek) {
      return this.openingDays.contains(dayOfWeek);
    }

    Boolean isBookingPossibleForGiven(final Booking booking, final Integer totalDinersOnThisDay) {
      return (booking.getSumOfBookingDinersAnd(totalDinersOnThisDay)) <= this.capacity;
    }
}

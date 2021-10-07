package com.reservationsteps.springboot.msy.dto.mapper;

import com.reservationsteps.springboot.msy.dto.model.bus.TripScheduleDTO;
import com.reservationsteps.springboot.msy.model.bus.TripSchedule;

public class TripScheduleMapper {

    public static TripScheduleDTO toTripScheduleDTO (TripSchedule tripSchedule) {
        return new TripScheduleDTO()
                .setId(tripSchedule.getId())
                .setFare(tripSchedule.getTripDetail().getFare())
                .setJourneyTime(tripSchedule.getTripDetail().getJourneyTime())
                .setBusCode(tripSchedule.getTripDetail().getBus().getCode())
                .setTripDate(tripSchedule.getTripDate())
                .setDestinationStop(tripSchedule.getTripDetail().getDestStop().getName())
                .setSourceStop(tripSchedule.getTripDetail().getSourceStop().getName())
                .setAvailableSeats(tripSchedule.getAvailableSeats());
    }
}

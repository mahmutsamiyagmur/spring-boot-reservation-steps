package com.reservationsteps.springboot.msy.dto.mapper;

import com.reservationsteps.springboot.msy.dto.model.bus.TripDTO;
import com.reservationsteps.springboot.msy.model.bus.Trip;

public class TripMapper {

    public static TripDTO toTripDto (Trip trip) {
        return new TripDTO()
                .setId(trip.getId())
                .setFare(trip.getFare())
                .setAgencyCode(trip.getAgency().getCode())
                .setBusCode(trip.getBus().getCode())
                .setDestinationStopName(trip.getDestStop().getName())
                .setDestinationStopCode(trip.getDestStop().getCode())
                .setSourceStopCode(trip.getSourceStop().getCode())
                .setSourceStopName(trip.getSourceStop().getName())
                .setJourneyTime(trip.getJourneyTime());
    }
}

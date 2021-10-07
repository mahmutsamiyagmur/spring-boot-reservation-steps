package com.reservationsteps.springboot.msy.service;

import com.reservationsteps.springboot.msy.dto.model.bus.*;
import com.reservationsteps.springboot.msy.dto.model.user.UserDTO;
import com.reservationsteps.springboot.msy.model.bus.Stop;

import java.util.List;
import java.util.Set;

/**
 * Bus reservation related methods.
 */
public interface BusReservationService {

    // Stop related methods.
    Set<Stop> getAllStops();

    StopDTO getStopByCode(String stopCode);

    // Agency related methods.
    AgencyDTO getAgency(UserDTO userDto);

    AgencyDTO addAgency(AgencyDTO agencyDto);

    AgencyDTO updateAgency(AgencyDTO agencyDto, BusDTO busDto);

    // Trip related methods.
    TripDTO getTripById(String tripID);

    List<TripDTO> addTrip(TripDTO tripDto);

    List<TripDTO> getAgencyTrips(String agencyCode);

    List<TripDTO> getAvailableTripsBetweenStops(String sourceStopCode, String destinationStopCode);

    // Trips schedule related methods.
    List<TripScheduleDTO> getAvailableTripSchedules(String sourceStopCode, String destinationStopCode);

    TripScheduleDTO getTripSchedule(TripDTO tripDto, String tripDate, boolean createSchedForTrip);

    // Ticket related method.
    TicketDTO bookTicket(TripScheduleDTO tripScheduleDto, UserDTO passenger);





}

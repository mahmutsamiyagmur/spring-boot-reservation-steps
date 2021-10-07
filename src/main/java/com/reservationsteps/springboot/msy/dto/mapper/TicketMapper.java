package com.reservationsteps.springboot.msy.dto.mapper;

import com.reservationsteps.springboot.msy.dto.model.bus.TicketDTO;
import com.reservationsteps.springboot.msy.model.bus.Ticket;

/**
 * Mapper for {@code Ticket} to {@code TicketDTO}.
 */
public class TicketMapper {

    public static TicketDTO toTicketDto (Ticket ticket) {
        return new TicketDTO()
                .setId(ticket.getId())
                .setBusCode(ticket.getTripSchedule().getTripDetail().getBus().getCode())
                .setSeatNumber(ticket.getSeatNumber())
                .setSourceStop(ticket.getTripSchedule().getTripDetail().getSourceStop().getName())
                .setDestinationStop(ticket.getTripSchedule().getTripDetail().getDestStop().getName())
                .setCancelable(false)
                .setJourneyDate(ticket.getJourneyDate())
                .setPassengerName(ticket.getPassenger().getFullName())
                .setPassengerMobileNumber(ticket.getPassenger().getMobileNumber());
    }

}

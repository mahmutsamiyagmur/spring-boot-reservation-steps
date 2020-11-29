package com.reservationsteps.springboot.msy.dto.model.bus;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class TicketDTO {

    private String id;

    private String busCode;

    private String seatNumber;

    private boolean cancelable;

    private String journeyDate;

    private String sourceStop;

    private String destinationStop;

    private String passengerName;

    private String passengerMobileNumber;
}

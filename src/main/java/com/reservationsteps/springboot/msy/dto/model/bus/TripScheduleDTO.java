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
public class TripScheduleDTO {

    private String id;

    private String tripId;

    private String tripDate;

    private int availableSeats;

    private int fare;

    private int journeyTime;

    private String busCode;

    private String sourceStop;

    private String destinationStop;
}

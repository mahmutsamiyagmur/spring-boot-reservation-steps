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
public class StopDTO implements Comparable {
    private String code;

    private String name;

    private String detail;

    @Override
    public int compareTo(Object o) {
        return this.getName().compareTo(((StopDTO) o).getName());
    }
}

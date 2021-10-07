package com.reservationsteps.springboot.msy.model.bus;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
@Document(collection = "trip")
public class Trip {

    @Id
    private String id;

    private int fare;
    // fixme time can be date.
    private int journeyTime;

    @DBRef
    private Stop sourceStop;

    @DBRef
    private Stop destStop;

    @DBRef
    private Bus bus;

    @DBRef
    private Agency agency;
}

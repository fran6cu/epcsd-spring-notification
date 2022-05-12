package edu.uoc.epcsd.notification.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;

import java.sql.Time;
import java.util.Date;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Performance {
    private Date date;
    private Time time;
    private String streamingUrl;
    private Integer remainingSeats;
    private String status;
}

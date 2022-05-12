package edu.uoc.epcsd.notification.pojos;

import lombok.*;

import java.util.ArrayList;

@ToString(exclude = "shows")
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    private Long id;
    private String name;
    private String description;

}

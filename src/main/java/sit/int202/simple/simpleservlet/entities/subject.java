package sit.int202.simple.simpleservlet.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class subject {
    private String id;
    private String title;
    private double credit;
}

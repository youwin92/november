package comm.november.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "recommend")
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Data
public class Recommend {

    @Id
    private Long id;

}

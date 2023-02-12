package comsudhir.charginstation.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "charginstation")
public class ChargingStation {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    public Long stationCode;
    public String stationName;
    public String stationImageUrl;

    public Double stationPrice;

    public String stationAddress;
}

package comsudhir.charginstation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChargingStationInput {
    public String stationName;
    public String stationImageUrl;

    public Double stationPrice;

    public String stationAddress;
}

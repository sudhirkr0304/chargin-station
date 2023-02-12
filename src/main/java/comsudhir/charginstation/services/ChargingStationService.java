package comsudhir.charginstation.services;

import comsudhir.charginstation.dto.ChargingStationInput;
import comsudhir.charginstation.model.ChargingStation;
import comsudhir.charginstation.repository.ChargingStationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChargingStationService {

    @Autowired
    public ChargingStationRepository chargingStationRepository;

    public List<ChargingStation> getAllCharginStations(Integer limit) {

        if(limit == null) {
            return  (List<ChargingStation>)chargingStationRepository.findAll();
        }
        else {
            Pageable pageRequest = PageRequest.of(0,limit);
            return  chargingStationRepository.findAll(pageRequest);

        }


    }

    public ChargingStation getChargingStationById(Long id) {
       return chargingStationRepository.findById(id).get();
    }

    public ChargingStation addChargingPoint(ChargingStation chargingStationInput) {
        return  chargingStationRepository.save(chargingStationInput);
    }

    public ChargingStation editChargingStation(Long id, ChargingStation chargingStation) {

        ChargingStation chargingStation1 =  chargingStationRepository.findById(id).get();

        if(chargingStation1 != null) {
            chargingStation.setStationCode(id);
            chargingStationRepository.save(chargingStation);
        }

        return chargingStation;
    }

    public void deleteChargingStationById(Long id) {
        chargingStationRepository.deleteById(id);
    }
}

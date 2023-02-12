package comsudhir.charginstation.controller;


import comsudhir.charginstation.dto.ChargingStationInput;
import comsudhir.charginstation.model.ChargingStation;
import comsudhir.charginstation.services.ChargingStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChargingStationController {

    @Autowired
    private ChargingStationService chargingStationService;

    @GetMapping("/")
    public List<ChargingStation> getAllChargingStations( @RequestParam(name = "limit",required = false) Integer limit) {

        return chargingStationService.getAllCharginStations(limit);
    }

    @GetMapping("/show/{id}")
    public ChargingStation getChargingStation(@PathVariable("id") Long id) {
       return  chargingStationService.getChargingStationById(id);
    }

    @PostMapping("/")
    public ChargingStation addCharginStation(@RequestBody ChargingStation chargingStationInput)
    {
       return chargingStationService.addChargingPoint(chargingStationInput);
    }

    @PutMapping("/{id}/edit")
    public ChargingStation editChargingStation(@PathVariable("id") Long id, @RequestBody ChargingStation chargingStation) {
       return chargingStationService.editChargingStation(id,chargingStation);
    }

    @RequestMapping("/delete/{id}")
    public String deleteChargingStation(@PathVariable("id") Long id) {
        chargingStationService.deleteChargingStationById(id);
        return "charging station deleted";
    }

}

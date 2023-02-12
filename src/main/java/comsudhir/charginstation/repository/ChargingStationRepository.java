package comsudhir.charginstation.repository;

import comsudhir.charginstation.model.ChargingStation;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChargingStationRepository extends CrudRepository<ChargingStation,Long> {
    List<ChargingStation> findAll(Pageable pageRequest);
}

package scw.repository;

import scw.entities.TotalCasualtiesEstimate;
import org.springframework.data.repository.CrudRepository;

/**
 * Spring will implement and instantiate this repository during runtime
 */
public interface TotalCasualtiesRepository extends CrudRepository<TotalCasualtiesEstimate, Long> {

}

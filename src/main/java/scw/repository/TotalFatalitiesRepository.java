package scw.repository;

import scw.entities.TotalFatalitiesEstimate;
import org.springframework.data.repository.CrudRepository;

/**
 * Spring will implement and instantiate this repository during runtime
 */
public interface TotalFatalitiesRepository extends CrudRepository<TotalFatalitiesEstimate, Long> {

}

package scw.controllers;

import org.springframework.web.bind.annotation.RestController;
import scw.beans.TotalFatalitiesEstimates;
import scw.entities.TotalFatalitiesEstimate;
import scw.repository.TotalFatalitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


/**
 * Defines endpoints for retrieving and serving TotalFatalitiesEstimate entities
 */
@RestController
@RequestMapping(path="/totalfatalities")
public class TotalFatalitiesController {

    // implemented and instantiated at runtime
    @Autowired
    private TotalFatalitiesRepository totalFatalitiesRepository;

    /**
     * Returns all total fatalities estimates
     *
     * @return
     */
    @GetMapping(path="/allestimates")
    public TotalFatalitiesEstimates getAllEstimates() {
        List<TotalFatalitiesEstimate> estimates = (List<TotalFatalitiesEstimate>) totalFatalitiesRepository.findAll();
        TotalFatalitiesEstimates response = new TotalFatalitiesEstimates();
        response.setCount(estimates.size());
        response.setEstimates(estimates);

        return response;
    }
}

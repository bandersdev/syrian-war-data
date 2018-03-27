package scw.controllers;

import scw.entities.TotalFatalitiesEstimate;
import scw.repository.TotalFatalitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Defines endpoints for retrieving and serving TotalFatalitiesEstimate entities
 */
@Controller
@RequestMapping(path="/totalfatalities")
public class TotalFatalitiesController {

    // implemented and instantiated at runtime
    @Autowired
    private TotalFatalitiesRepository totalCasualtiesRepository;

    /**
     * Returns all total fatalities estimates
     *
     * @return
     */
    @GetMapping(path="/allestimates")
    public @ResponseBody Iterable<TotalFatalitiesEstimate> getAllEstimates() {
        return totalCasualtiesRepository.findAll();
    }
}

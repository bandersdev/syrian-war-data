package scw.controllers;

import scw.entities.TotalCasualtiesEstimate;
import scw.repository.TotalCasualtiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Defines endpoints for retrieving and serving TotalCasualtiesEstimate entities
 */
@Controller
@RequestMapping(path="/totalcasualties")
public class TotalCasualtiesController {

    // implemented and instantiated at runtime
    @Autowired
    private TotalCasualtiesRepository totalCasualtiesRepository;

    /**
     * Returns all total casualty estimates
     *
     * @return
     */
    @GetMapping(path="/allestimates")
    public @ResponseBody Iterable<TotalCasualtiesEstimate> getAllEstimates() {
        return totalCasualtiesRepository.findAll();
    }
}

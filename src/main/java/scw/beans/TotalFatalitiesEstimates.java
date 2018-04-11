package scw.beans;

import scw.entities.TotalFatalitiesEstimate;

import java.util.List;

/**
 * A java bean intended to contain a number of TotalFatalitiesEstimates entities
 * to be returned by a Controller.
 *
 * @author Bryan Anders
 *
 */
public class TotalFatalitiesEstimates {

    private List<TotalFatalitiesEstimate> estimates;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<TotalFatalitiesEstimate> getEstimates() {
        return estimates;
    }

    public void setEstimates(List<TotalFatalitiesEstimate> estimates) {
        this.estimates = estimates;
    }
}

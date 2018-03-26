package main.java.swc.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * A simple JDA entity which represents a single
 * estimate of total casualties in the Syrian Civil War.
 *
 * @author Bryan Anders
 */
@Entity
public class TotalCasualtiesEstimate {

    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    // The name or abbreviation of the organization that published the report
    private String sourceOrganization;

    // The url of the article or data source for the estimate
    private String url;

    // The date the estimate was published
    private Date dateReported;

    // The low and high end of an estimate range. If there is only
    // as single estimate value then both values should be
    // se to the number
    private Integer lowEstimate;
    private Integer highEstimate;


    public void setId(Long id) {
        this.id = id;
    }

    public String getSourceOrganization() {
        return sourceOrganization;
    }

    public void setSourceOrganization(String sourceOrganization) {
        this.sourceOrganization = sourceOrganization;
    }

    public Date getDateReported() {
        return dateReported;
    }

    public void setDateReported(Date dateReported) {
        this.dateReported = dateReported;
    }

    public Integer getLowEstimate() {
        return lowEstimate;
    }

    public void setLowEstimate(Integer lowEstimate) {
        this.lowEstimate = lowEstimate;
    }

    public Integer getHighEstimate() {
        return highEstimate;
    }

    public void setHighEstimate(Integer highEstimate) {
        this.highEstimate = highEstimate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}

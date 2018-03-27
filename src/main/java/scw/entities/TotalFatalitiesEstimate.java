package scw.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * A simple JDA entity which represents a single
 * estimate of total casualties in the Syrian Civil War.
 *
 * @author Bryan Anders
 */
@Entity
@Table(name="total_fatalities")
public class TotalFatalitiesEstimate {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    // The name and/or abbreviation of the organization that published the report
    @Column(name="source")
    private String source;

    // The url of the article or data source for the estimate
    @Column(name="url")
    private String url;

    // The date the estimate was published
    @Column(name="estimate_date")
    private Date dateReported;

    // The low and high end of an estimate range. If there is only
    // as single estimate value then both values should be
    // se to the number
    @Column(name="estimate_low_end")
    private Integer lowEstimate;

    @Column(name="estimate_high_end")
    private Integer highEstimate;


    public void setId(Long id) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}

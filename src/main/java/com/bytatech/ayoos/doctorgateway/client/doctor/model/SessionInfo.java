package com.bytatech.ayoos.doctorgateway.client.doctor.model;


import java.io.Serializable;
import java.time.OffsetDateTime;
import java.time.LocalDate;

/**
 * A SessionInfo.
 */

public class SessionInfo  {

    private static final long serialVersionUID = 1L;


    private Long id;

   
    private String sessionName;


    private LocalDate date;


    private OffsetDateTime fromTime;

  
    private OffsetDateTime toTime;

 
    private Long interval;

   
    private WorkPlace workPlace;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionName() {
        return sessionName;
    }

    public SessionInfo sessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }

    public void setSessionName(String sessionName) {
        this.sessionName = sessionName;
    }

    public LocalDate getDate() {
        return date;
    }

    public SessionInfo date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public OffsetDateTime getFromTime() {
        return fromTime;
    }

    public SessionInfo fromTime(OffsetDateTime fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    public void setFromTime(OffsetDateTime fromTime) {
        this.fromTime = fromTime;
    }

    public OffsetDateTime getToTime() {
        return toTime;
    }

    public SessionInfo toTime(OffsetDateTime toTime) {
        this.toTime = toTime;
        return this;
    }

    public void setToTime(OffsetDateTime toTime) {
        this.toTime = toTime;
    }

    public Long getInterval() {
        return interval;
    }

    public SessionInfo interval(Long interval) {
        this.interval = interval;
        return this;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public WorkPlace getWorkPlace() {
        return workPlace;
    }

    public SessionInfo workPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
        return this;
    }

    public void setWorkPlace(WorkPlace workPlace) {
        this.workPlace = workPlace;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SessionInfo)) {
            return false;
        }
        return id != null && id.equals(((SessionInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "SessionInfo{" +
            "id=" + getId() +
            ", sessionName='" + getSessionName() + "'" +
            ", date='" + getDate() + "'" +
            ", fromTime='" + getFromTime() + "'" +
            ", toTime='" + getToTime() + "'" +
            ", interval=" + getInterval() +
            "}";
    }
}

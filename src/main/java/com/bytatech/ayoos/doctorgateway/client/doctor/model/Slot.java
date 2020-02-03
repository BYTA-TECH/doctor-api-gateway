package com.bytatech.ayoos.doctorgateway.client.doctor.model;

import java.time.*;
import java.util.HashSet;
import java.util.Set;

/**
 * A Slot.
 */

public class Slot {



    private Long id;

    
    private LocalDate date;

    
    private Instant fromTime;

    
    private Instant toTime;

    
    private Set<Status> statuses = new HashSet<>();


    private Doctor doctor;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public Slot date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Instant getFromTime() {
        return fromTime;
    }

    public Slot fromTime(Instant fromTime) {
        this.fromTime = fromTime;
        return this;
    }

    public void setFromTime(Instant fromTime) {
        this.fromTime = fromTime;
    }

    public Instant getToTime() {
        return toTime;
    }

    public Slot toTime(Instant toTime) {
        this.toTime = toTime;
        return this;
    }

    public void setToTime(Instant toTime) {
        this.toTime = toTime;
    }

    public Set<Status> getStatuses() {
        return statuses;
    }

    public Slot statuses(Set<Status> statuses) {
        this.statuses = statuses;
        return this;
    }

    public Slot addStatus(Status status) {
        this.statuses.add(status);
        status.setSlot(this);
        return this;
    }

    public Slot removeStatus(Status status) {
        this.statuses.remove(status);
        status.setSlot(null);
        return this;
    }

    public void setStatuses(Set<Status> statuses) {
        this.statuses = statuses;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Slot doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Slot)) {
            return false;
        }
        return id != null && id.equals(((Slot) o).id);
    }*/

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Slot{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", fromTime=" + getFromTime() +
            ", toTime=" + getToTime() +
            "}";
    }



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slot other = (Slot) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (fromTime == null) {
			if (other.fromTime != null)
				return false;
		} else if (!fromTime.equals(other.fromTime))
			return false;
		if (toTime == null) {
			if (other.toTime != null)
				return false;
		} else if (!toTime.equals(other.toTime))
			return false;
		return true;
	}

	
}

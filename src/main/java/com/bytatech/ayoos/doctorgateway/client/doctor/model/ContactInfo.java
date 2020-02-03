package com.bytatech.ayoos.doctorgateway.client.doctor.model;

/**
 * A ContactInfo.
 */

public class ContactInfo  {



   
    private Long id;


    private String facebookURL;


    private String twitterURL;

 
    private Doctor doctor;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacebookURL() {
        return facebookURL;
    }

    public ContactInfo facebookURL(String facebookURL) {
        this.facebookURL = facebookURL;
        return this;
    }

    public void setFacebookURL(String facebookURL) {
        this.facebookURL = facebookURL;
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public ContactInfo twitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
        return this;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public ContactInfo doctor(Doctor doctor) {
        this.doctor = doctor;
        return this;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContactInfo)) {
            return false;
        }
        return id != null && id.equals(((ContactInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
            "id=" + getId() +
            ", facebookURL='" + getFacebookURL() + "'" +
            ", twitterURL='" + getTwitterURL() + "'" +
            "}";
    }
}

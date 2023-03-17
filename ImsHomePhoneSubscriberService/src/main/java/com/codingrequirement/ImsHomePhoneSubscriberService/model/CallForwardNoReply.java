package com.codingrequirement.ImsHomePhoneSubscriberService.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "call_forward")
public class CallForwardNoReply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "provision")
    private Boolean provisioned;

    @Column(name = "destination")
    private String destination;

    public CallForwardNoReply() {

    }

    public CallForwardNoReply(Boolean provisioned, String destination) {
        this.provisioned = provisioned;
        this.destination = destination;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getProvisioned() {
        return provisioned;
    }

    public void setProvisioned(Boolean provisioned) {
        this.provisioned = provisioned;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CallForwardNoReply that = (CallForwardNoReply) o;
        return id.equals(that.id) && provisioned.equals(that.provisioned) && destination.equals(that.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, provisioned, destination);
    }

    @Override
    public String toString() {
        return "CallForwardNoReply{" +
                "id=" + id +
                ", provisioned=" + provisioned +
                ", destination='" + destination +
                '}';
    }
}

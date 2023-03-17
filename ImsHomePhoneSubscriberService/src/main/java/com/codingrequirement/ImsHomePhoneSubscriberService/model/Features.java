package com.codingrequirement.ImsHomePhoneSubscriberService.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "features")
public class Features {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cfn_id")
    private CallForwardNoReply callForwardNoReply;

    public Features() {

    }

    public Features(CallForwardNoReply callForwardNoReply) {
        this.callForwardNoReply = callForwardNoReply;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CallForwardNoReply getCallForwardNoReply() {
        return callForwardNoReply;
    }

    public void setCallForwardNoReply(CallForwardNoReply callForwardNoReply) {
        this.callForwardNoReply = callForwardNoReply;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Features features = (Features) o;
        return id.equals(features.id) && callForwardNoReply.equals(features.callForwardNoReply);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, callForwardNoReply);
    }

    @Override
    public String toString() {
        return "Features{" +
                "id=" + id +
                ", callForwardNoReply=" + callForwardNoReply +
                '}';
    }
}

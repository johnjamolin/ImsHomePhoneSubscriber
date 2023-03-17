package com.codingrequirement.ImsHomePhoneSubscriberService.model;

import jakarta.persistence.*;
import org.springframework.data.util.Lazy;


import java.util.Objects;

@Entity
@Table(name = "subscriber")
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "phone_no")
    private String phoneNumber;

    @Column(name = "user_name", length = 250)
    private String userName;
    @Column(name = "password", length = 250)
    private String password;

    @Column(name = "domain", length = 250)
    private String domain;

    @Column(name = "status", length = 250)
    private String status;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_features_id")
    private Features features;

    public Subscriber() {

    }

    public Subscriber(String phoneNumber, String userName, String password, String domain, String status, Features features) {
        this.phoneNumber = phoneNumber;
        this.userName = userName;
        this.password = password;
        this.domain = domain;
        this.status = status;
        this.features = features;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscriber that = (Subscriber) o;
        return id.equals(that.id) && phoneNumber.equals(that.phoneNumber) && userName.equals(that.userName) && password.equals(that.password) && domain.equals(that.domain) && status.equals(that.status) && features.equals(that.features);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, phoneNumber, userName, password, domain, status, features);
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", domain='" + domain + '\'' +
                ", status='" + status + '\'' +
                ", features=" + features +
                '}';
    }
}

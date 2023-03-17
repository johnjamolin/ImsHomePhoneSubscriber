package com.codingrequirement.ImsHomePhoneSubscriberService.repository;

import com.codingrequirement.ImsHomePhoneSubscriberService.model.Subscriber;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubscriberRepository extends JpaRepository<Subscriber, Long> {

    Subscriber findByPhoneNumber(String phoneNumber);

    @Transactional
    void deleteByPhoneNumber(String phoneNumber);
}

package com.senacniteroi.delivery3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senacniteroi.delivery3.model.Delivery;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long>{

}

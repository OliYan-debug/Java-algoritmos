package com.xiaomi.technology.smartphone.repository;

import com.xiaomi.technology.smartphone.model.Smartphone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SmartphoneRepository extends JpaRepository<Smartphone, Integer> {
}

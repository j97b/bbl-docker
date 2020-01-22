package com.bae.persistence.repo;

import com.bae.persistence.domain.Boulder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoulderRepo extends JpaRepository<Boulder, Long> {

}

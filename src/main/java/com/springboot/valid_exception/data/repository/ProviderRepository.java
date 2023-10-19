package com.springboot.valid_exception.data.repository;

import com.springboot.valid_exception.data.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}

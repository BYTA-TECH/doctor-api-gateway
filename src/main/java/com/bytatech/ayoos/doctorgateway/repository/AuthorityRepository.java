package com.bytatech.ayoos.doctorgateway.repository;

import com.bytatech.ayoos.doctorgateway.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

package com.propwand.listing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.propwand.listing.domain.Property;

public interface PropertyListingRepository extends JpaRepository<Property, Long> {

}

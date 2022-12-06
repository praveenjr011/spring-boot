package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
	Optional<Asset> findByUsername(String username);

	void deleteByUsername(String username);
	

}

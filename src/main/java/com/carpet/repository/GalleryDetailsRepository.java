package com.carpet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carpet.dto.GalleryDetailsDTO;
import com.carpet.modal.GalleryDetails;

@Repository
public interface GalleryDetailsRepository extends JpaRepository<GalleryDetails, Long>{

	@Query("Select new com.carpet.dto.GalleryDetailsDTO(g) from GalleryDetails g")
	List<GalleryDetailsDTO> getAllData();

}

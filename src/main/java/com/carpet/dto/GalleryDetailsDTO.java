package com.carpet.dto;

import com.carpet.modal.GalleryDetails;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.springframework.web.multipart.MultipartFile;


@SuppressWarnings("deprecation")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class GalleryDetailsDTO {

	private Long id;
	private String category;
	private String imagePath;
	private String description;
	private Boolean active;
	private MultipartFile imageFile;
	
	
	public GalleryDetailsDTO() {}
	
	public GalleryDetailsDTO(GalleryDetails entity) {
		this.id = entity.getId();
		this.category = entity.getCategory();
		this.imagePath = entity.getImagePath();
		this.description = entity.getDescription();
		this.active = entity.getActive();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}

	public MultipartFile getImageFile() {
		return imageFile;
	}

	public void setImageFile(MultipartFile imageFile) {
		this.imageFile = imageFile;
	}


}

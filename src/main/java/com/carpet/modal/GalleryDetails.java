package com.carpet.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.carpet.dto.GalleryDetailsDTO;

@Entity
@Table(name = "t_gallery_details")
public class GalleryDetails {
	
	@Id
	@Column(name = "c_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "c_category")
	private String category;
	
	@Column(name = "c_image_path")
	private String imagePath;
	
	@Column(name = "c_description")
	private String description;
	
	@Column(name = "c_active")
	private Boolean active;

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
	
	public GalleryDetails() {}
	
	public GalleryDetails(GalleryDetailsDTO dto) {
		this.id = dto.getId();
		this.category = dto.getCategory();
		this.imagePath = dto.getImagePath();
		this.description = dto.getDescription();
		this.active = dto.getActive();
	}

}

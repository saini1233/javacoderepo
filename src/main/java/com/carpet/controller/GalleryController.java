package com.carpet.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carpet.dto.GalleryDetailsDTO;
import com.carpet.service.GalleryDetailsService;

@RestController
@RequestMapping("/gallery")
public class GalleryController {

	private GalleryDetailsService galleryDetailsService;
	
	public GalleryController(GalleryDetailsService galleryDetailsService) {
		this.galleryDetailsService = galleryDetailsService;
	}
	
	@PostMapping
	public GalleryDetailsDTO saveGalleryData(GalleryDetailsDTO dto,HttpServletRequest request) {
		return galleryDetailsService.saveGalleryData(dto);
	}
	
	@GetMapping
	public List<GalleryDetailsDTO> getGalleryList() {
		return galleryDetailsService.getGalleryList();
	}
	
	@GetMapping("/{id}")
	public GalleryDetailsDTO getGalleryDataById(@PathVariable Long id) {
		return galleryDetailsService.getGalleryDataById(id);
	}
	
	
	@DeleteMapping("/{id}")
	public void deleteGalleryItem(@PathVariable Long id) {
		galleryDetailsService.deleteGalleryItem(id);
	}
}

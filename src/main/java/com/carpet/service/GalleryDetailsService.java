package com.carpet.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.carpet.dto.GalleryDetailsDTO;
import com.carpet.modal.GalleryDetails;
import com.carpet.repository.GalleryDetailsRepository;
import com.carpet.utils.Utils;

@Service
public class GalleryDetailsService {
	
	@Value("${uploadfolder}")
	private String uploadFolder;

	private GalleryDetailsRepository galleryDetailsRepository;

	public GalleryDetailsService(GalleryDetailsRepository galleryDetailsRepository) {
		this.galleryDetailsRepository = galleryDetailsRepository;
	}

	public GalleryDetailsDTO saveGalleryData(GalleryDetailsDTO dto) {
		

		String absolutePath = uploadFile(dto.getImageFile(), Utils.getDirectoryMap().get(dto.getCategory().toLowerCase()));
		dto.setImagePath(absolutePath);	
		GalleryDetails entity = new GalleryDetails(dto);

		try {

			return new GalleryDetailsDTO(galleryDetailsRepository.save(entity));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<GalleryDetailsDTO> getGalleryList() {

		return galleryDetailsRepository.getAllData();
	}

	public GalleryDetailsDTO getGalleryDataById(Long id) {

		return new GalleryDetailsDTO(galleryDetailsRepository.getById(id));
	}

	public void deleteGalleryItem(Long id) {

		galleryDetailsRepository.deleteById(id);

	}
	
	private String uploadFile(MultipartFile file, String directoryName) {

		File dirFile = new File(uploadFolder + directoryName + "//");
		if (!dirFile.exists()) {
			dirFile.mkdir();
		}
		try {
			UUID uuid = UUID.randomUUID();
			Path path = Paths.get(uploadFolder + directoryName + "//" + uuid+"_"+file.getOriginalFilename());
			Path finalPath = Files.write(path, file.getBytes());
			return finalPath.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "";
	}

}

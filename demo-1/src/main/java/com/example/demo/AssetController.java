package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssetController {
	private final AssetRepository repository;
	
	AssetController(AssetRepository repository){
		this.repository = repository;
		
	}
	@GetMapping("/assetdet")
	List<Asset> all() {
		return repository.findAll();
	}
	@PostMapping("/addasset")
	Asset newasset(@RequestBody Asset newAsset) {
		return repository.save(newAsset);
	}
	
	
	
	@GetMapping("/assetdet/type/{id}")

	Optional<Asset> one(@PathVariable Long id) {

		return repository.findById(id);

	}
	
	@DeleteMapping("/assetdet/{id}")
	  void deleteAsset(@PathVariable Long id) {
	    repository.deleteById(id);
	  }
//	@PutMapping("/assetdet/{id}")
//	  Asset replaceAsset(@RequestBody Asset newAsset, @PathVariable Long id) {
//	    
//	    return repository.findById(id)
//	      .map(asset -> {
//	 asset.setAssetType(newAsset.getAssertType());
//	 asset.setAssetType(newAsset.getBrand());
//	 asset.setAssetType(newAsset.getModelName());
//	 asset.setAssetType(newAsset.getSerialNumber());
//
//      });
	       
//	}
}
	
	

	
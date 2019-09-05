package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.PackageInfo;
import tws.service.PackageService;

@RestController
@RequestMapping("/noob-post")
public class PackageController {
	@Autowired
	PackageService packageService;
	
	@GetMapping
	@CrossOrigin
	public List<PackageInfo> getPackageInfos(){
		return packageService.getPackageInfos();
	}
	
	@PostMapping
	@CrossOrigin
	public void addPackageInfo(@RequestBody PackageInfo packageInfo) {
		packageService.addPackageInfo(packageInfo);
	}
}

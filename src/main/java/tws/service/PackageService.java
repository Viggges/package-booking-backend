package tws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tws.entity.PackageInfo;
import tws.repository.PackageMapper;

@Service
public class PackageService {

	@Autowired
	PackageMapper packageMapper;
	
	public  List<PackageInfo> getPackageInfos() {
		return packageMapper.getPackageInfos();
	}

	public void addPackageInfo(PackageInfo packageInfo) {
		
		packageMapper.addPackageInfo(packageInfo);
	}
	
}

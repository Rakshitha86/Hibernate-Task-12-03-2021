package com.xworkz.tester;

import org.apache.poi.hssf.extractor.ExcelExtractor;

import com.xworkz.dao.CameraDAO;
import com.xworkz.dao.CameraDAOImpl;
import com.xworkz.dto.CameraDTO;
import com.xworkz.service.CameraService;
import com.xworkz.service.CameraServiceImpl;

public class Tester {

	public static void main(String[] args) {
		String excelPath="./Camera/Excel.xldx";
		String sheetName="CameraDetails";
		
		CameraDTO cameraDTO = new CameraDTO("Sony", "White", 20000, 2);
		CameraDAO cameraDAO = new CameraDAOImpl();
		
		cameraDAO.saveCamera(cameraDTO);
		cameraDAO.readCamera(2);
		cameraDAO.updateCamera(2);
		cameraDAO.deleteCamera(2);
		
//		CameraService cameraService = new CameraServiceImpl(cameraDAO);
//		cameraService.validateAndSave(cameraDTO);
//		cameraService.validateAndRead(1);
//		cameraService.validateAndUpdate(1);
//		cameraService.validateAndDelete(1);
	}

}



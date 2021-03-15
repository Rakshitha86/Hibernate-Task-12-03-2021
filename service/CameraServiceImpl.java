package com.xworkz.service;

import com.xworkz.dao.CameraDAO;
import com.xworkz.dto.CameraDTO;

public class CameraServiceImpl implements CameraService {

	private CameraDAO dao;

	public CameraServiceImpl(CameraDAO dao) {
		this.dao = dao;
	}

	@Override
	public void validateAndSave(CameraDTO cameraDTO) {
		boolean validData = false;
		if (cameraDTO != null) {
			System.out.println("dto is not null, can validate");
			if (validData) {
				String brand = cameraDTO.getBrand();
				if (brand != null && !brand.isEmpty() && !brand.contentEquals(" ")) {
					System.out.println("brand is valid");
					validData = true;
				} else {
					System.out.println("brand is not valid");
					validData = false;
				}
			}

			if (validData) {
				String color = cameraDTO.getColor();
				if (color != null && !color.isEmpty() && !color.contentEquals(" ")) {
					System.out.println("color is valid");
					validData = true;
				} else {
					System.out.println("color is not valid");
					validData = false;
				}
			}
			if (validData) {
				int price = cameraDTO.getPrice();
				if (price != 0 && price > 2000) {
					System.out.println("price is valid");
					validData = true;
				} else {
					System.out.println("price is not valid");
					validData = false;
				}
			}
			if (validData) {
				int lens = cameraDTO.getLense();
				if (lens > 0) {
					System.out.println("lens is valid");
					validData = true;
				} else {
					System.out.println("lens is not valid");
					validData = false;
				}
			}
			if (validData) {
				System.out.println("Invoke save method, data is valid");
				dao.saveCamera(cameraDTO);
			}

		} else {
			System.out.println("dto is null, invalid data");
		}
	}

	@Override
	public void validateAndRead(int cameraId) {
		if (cameraId > 0) {
			System.out.println(" id is valid, can read: " + cameraId);
			this.dao.readCamera(cameraId);
		} else {
			System.out.println("invalid id");
		}
	}

	@Override
	public void validateAndUpdate(int cameraId) {
		if (cameraId > 0) {
			System.out.println(" id is valid, can read: " + cameraId);
			this.dao.updateCamera(cameraId);
		} else {
			System.out.println("invalid id");
		}
	}

	@Override
	public void validateAndDelete(int cameraId) {
		if (cameraId > 0) {
			System.out.println(" id is valid, can read: " + cameraId);
			dao.deleteCamera(cameraId);
		} else {
			System.out.println("invalid id");
		}
	}

}
